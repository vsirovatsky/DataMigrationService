package force.custom;

import java.util.Comparator;
import java.util.Hashtable;
import java.util.Set;
import java.util.TreeSet;

import force.custom.capitalization.CapitalizationScenario;
import force.custom.investors.InvestorsScenario;

public class ScenarioManager {
	
	public static final String INVESTOR_SCENARIO = "Investor";
	
	public static final String CAPITALIZATION_SCENARIO = "Capitalization";

	private Hashtable<String, IScenario> scenarious = new Hashtable<String, IScenario>();
	
	public static final ScenarioManager INSTANCE = new ScenarioManager();
	
	private ScenarioManager(){
		registerAll();
	}
	
	private void register( String name, IScenario scen ){
		scenarious.put(name, scen);
	}

	private void registerAll() {
		register( CAPITALIZATION_SCENARIO, new CapitalizationScenario() );
		register( INVESTOR_SCENARIO, new InvestorsScenario() );
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	
	public IScenario getDefault(){
		return get( CAPITALIZATION_SCENARIO );
	}
	
	public IScenario get( String name ){
		if ( name == null ) {
			return null;
		} else {
			return scenarious.get( name );
		}
	}
	
	public Set<String> listScenarious(){
		TreeSet<String> result = new TreeSet<String>( new Comparator<String> (){
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		for ( String s : this.scenarious.keySet() ) {
			result.add( s );
		}
		return result;
	}
}
