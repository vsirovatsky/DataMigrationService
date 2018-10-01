package force.upload.autofix;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import com.sforce.soap.enterprise.sobject.SObject;

import force.ITraceReciever;
import force.fObject.fObject;

public class AutoFixManager {
	
	public static final AutoFixManager INSTANCE = new AutoFixManager();
	
	private Hashtable<IAutoFix, Boolean> fixes = new Hashtable<IAutoFix, Boolean>();
	
	private AutoFixManager(){
		registerAll();
	}
	
	private void registerAll() {
		this.fixes.put(new AutoFixWrongLookup(), new Boolean(true));
	}
	
	private List<IAutoFix> getFixes(){
		final List<IAutoFix> result = new ArrayList<IAutoFix>();
		for ( IAutoFix fix : this.fixes.keySet() ) {
			if ( this.fixes.get(fix) ) {
				result.add( fix );
			}
		}
		return result;
	}

	public boolean applyFixes( fObject object, SaveError saveError, ITraceReciever trace ) throws Exception {
		Boolean fixApplied = false;
		for ( IAutoFix fix : getFixes() ) {
			// TODO: implement
			/*if (fix.fix(object, saveError, trace)) {
				fixApplied = true;
			}*/
		}
		return fixApplied;
	}
}
