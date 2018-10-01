package com.allrounds.datamigrationservice.webservice;

import com.allrounds.datamigrationservice.migration.ManagerMover;

public class DataMigrationResourceService {

	public DataMigrationResourceService(){}
	
	public void moveCapitalization( final String sourceLogin, final String sourcePass, final String targetLogin, final String targetPass, final String capId, final ServiceTraceReceiver trace ) throws Throwable {
		Thread t = new Thread() {

			@Override
			public void run() {
				
				try {
					ManagerMover.INSTANCE.connectLoad(sourceLogin, sourcePass);
					ManagerMover.INSTANCE.connectSave(targetLogin, targetPass);
					ManagerMover.INSTANCE.moveData(trace, capId);
				} catch (Throwable e) {
					e.printStackTrace();
					trace.error( e.getMessage() );
				}
			}
			
		};
		t.start();
	}
}
