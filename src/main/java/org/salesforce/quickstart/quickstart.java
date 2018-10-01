/*
 * Created on Dec 6, 2005
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package org.salesforce.quickstart;

import java.io.BufferedReader;
import java.io.IOException;
import com.sforce.soap.enterprise.sobject.*;
import com.sforce.soap.enterprise.*;
import com.sforce.soap.enterprise.Error;
import javax.xml.rpc.*;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.rmi.*;

import com.sforce.soap.enterprise.fault.*;

/**
 * @author dcarroll
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class quickstart {
    // create a class scope reference to the service object
    private SoapBindingStub binding = null;

    private LoginResult lr = null; // maintain the login results

    private Account[] _accounts = null;

    static BufferedReader rdr = new BufferedReader(
            new java.io.InputStreamReader(System.in));

    public static void main(String[] args) {
        Logger.getLogger("org.apache.axis").setLevel(Level.OFF);
        new quickstart();
    }

    public quickstart() {
        try {
            mainLoop();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void displayMenu() {
        // set up a simple menu system
        System.out.println("1. Login");
        System.out.println("2. Get Accounts");
        System.out.println("3. Update Accounts");
        System.out.println("4. Get Server Timestamp");
    }

    static String getUserInput(String prompt) {
        System.out.print(prompt);
        try {
            return rdr.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private void mainLoop() {
        displayMenu();
        // ask the user what they want to do
        String menuOption = getUserInput("Enter a menu option: ");
        while (menuOption.length() > 0) {
            switch (new Integer(menuOption).intValue()) {
            case 1:
                doLogin();
                break;
            case 2:
                doGetAccounts();
                break;
            case 3:
                doUpdateAccount();
                break;
            case 4:
                doGetTimestamp();
                break;
            }
            displayMenu();
            menuOption = getUserInput("Enter a menu option: ");
        }
    }

    private void doGetTimestamp() {
        // check to see if we are already logged in
        if (lr == null) {
            System.out.println("Run the login sample before the others.\n");
            getUserInput("Hit enter to continue: ");
            System.out.println("\n");
            return;
        }
        // create a variable to hold the timestamp result
        GetServerTimestampResult tsr = null;
        try {
            tsr = binding.getServerTimestamp();
            System.out.println("The server timestamp is:  " + tsr.getTimestamp().getTime().toString());
        } catch (UnexpectedErrorFault e) {
            e.printStackTrace();
            System.out.println("\n\n");
            return;
        } catch (RemoteException e) {
            e.printStackTrace();
            System.out.println("\n\n");
            return;
        }
    }
    private void doGetAccounts() {
        // check to see if we are already logged in
        if (lr == null) {
            System.out.println("Run the login sample before the others.\n");
            getUserInput("Hit enter to continue: ");
            System.out.println("\n");
            return;
        }
        // create a variable to hold the query result
        QueryResult qr = null;
        // call the query saving the results in qr
        try {
            qr = binding
                    .query("select Name, numberOfEmployees, Id, Industry from Account");
        } catch (UnexpectedErrorFault uef) {
            System.out.println(uef.getExceptionMessage() + "\n\n");
            return;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("\n\n");
            return;
        }
        // always a good idea
        if (qr != null) {
            SObject[] records = qr.getRecords();
            _accounts = new Account[records.length];
            // we can loop through the returned records
            for (int i = 0; i < records.length; i++) {
                // Because we asked for accounts we will convert
                // the SObject for each record into an Account object
                Account account = (Account) records[i];
                _accounts[i] = account;
                // Now we can access any of the fields we had in the query
                // select clause directly from the account variable
                System.out.print(new Integer(i).toString() + ". ");
                System.out.print(account.getName() + " - ");
                System.out.println(account.getId());
            }
            System.out.println("");
        }
    }

    private void updateAccount(String accountID, String newAccountName) {
        // First we will create an account object array, all calls are batch
        // ours is a single element batch
        SObject[] accounts = new Account[1];
        // instantiate the new account object
        Account account = new Account();
        Account oldAccount = _accounts[new Integer(accountID).intValue()];
        // set the id, the id must always be set for an update
        account.setId(oldAccount.getId());
        // set the new name of the account
        account.setName(newAccountName);
        // add the account to the array of objects
        accounts[0] = account;
        // we are now ready to update the record
        // create an array for the results
        SaveResult[] saveResults = null;
        try {
            saveResults = binding.update(accounts);
        } catch (UnexpectedErrorFault uef) {
            System.out.println(uef.getExceptionMessage() + "\n\n");
            return;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("\n\n");
            return;
        }
        if (saveResults == null)
            return;
        for (int i = 0; i < saveResults.length; i++) {
            // we will create a separate save result object for clarity
            SaveResult saveResult = saveResults[i];
            // check to see if the first update was a success
            if (saveResult.isSuccess()) {
                // the id that we passed should be the one we get back.
                System.out.println("Update account with id: "
                        + saveResult.getId());
            } else {
                // an error occurred on this record
                Error error = saveResult.getErrors()[0];
                System.out.println(error.getMessage());
            }
        }
    }

    private void doUpdateAccount() {
        // check to see if we are already logged in
        if (lr == null) {
            System.out.println("Run the login sample before the others.\n");
            getUserInput("Hit enter to continue: ");
            System.out.println("\n");
            return;
        }
        System.out
                .println("From the list of accounts above, \nenter the ID of the account you want to update.");
        System.out
                .println("\nIf there is not account list above, run sample 2.\n");
        String accountID = getUserInput("Enter the account number ('c' to cancel): ");
        if (accountID.length() == 0 || accountID.equals("c"))
            return;
        String newName = getUserInput("\nEnter a new name for the account ('c' to cancel): ");
        if (newName.length() == 0 || newName.equals("c"))
            return;
        updateAccount(accountID, newName);
        System.out.println("\n");
    }

    private void doLogin() {
        String userName = getUserInput("User name: ");
        String pwd = getUserInput("Password: ");
        if (userName.length() == 0 || pwd.length() == 0)
            return;
        else {
            try {
                binding = (SoapBindingStub) new SforceServiceLocator()
                        .getSoap();
            } catch (ServiceException ex1) {
                System.out.println(ex1.getMessage());
                return;
            }
            try {
                lr = binding.login(userName, pwd);
            } catch (UnexpectedErrorFault ex2) {
                System.out.println(ex2.getExceptionMessage() + "\n\n");
                return;
            } catch (LoginFault ex2) {
                System.out.println(ex2.getExceptionMessage() + "\n\n");
                return;
            } catch (RemoteException ex2) {
                System.out.println(ex2.getMessage() + "\n\n");
                return;
            }
            System.out.println("Login was successfull.");
            System.out.print("The returned session id is: ");
            System.out.println(lr.getSessionId());
            System.out.print("Your logged in user id is: ");
            System.out.println(lr.getUserId() + " \n\n");

            // on a successful login, you should always set up your session id
            // and the url for subsequent calls

            // reset the url endpoint property, this will cause subsequent calls
            // to made to the serverURL from the login result
            binding._setProperty(SoapBindingStub.ENDPOINT_ADDRESS_PROPERTY, lr
                    .getServerUrl());

            // create a session head object
            SessionHeader sh = new SessionHeader();
            // set the sessionId property on the header object using
            // the value from the login result
            sh.setSessionId(lr.getSessionId());
            // add the header to the binding stub
            String sforceURI = new SforceServiceLocator().getServiceName()
                    .getNamespaceURI();
            binding.setHeader(sforceURI, "SessionHeader", sh);
            return;
        }
    }
}
