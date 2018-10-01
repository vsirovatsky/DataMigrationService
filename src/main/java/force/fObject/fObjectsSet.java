package force.fObject;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;

import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

import force.StringUtils;

public class fObjectsSet {

	private List<fObject> objects = new ArrayList<fObject>();
	
	private String name;
	
	private boolean done = false;
	
	private final Hashtable<String, Boolean> fieldNames = new Hashtable<String, Boolean>();
	
	public fObjectsSet( Element elem ){
		init( elem );
	}
	
	private void init(Element elem) {
		if ( elem == null ) {
			return;
		}
		obtainDone(elem);
		System.out.println("Is Done : " + this.done);
		obtainRecords(elem);
		
		for ( fObject o : this.objects ) {
			System.out.println( o );
		}
		
		/*Node n = elem.getFirstChild();
		
		Node n1 = n.getFirstChild();
		
		NamedNodeMap nodes = elem.getAttributes();
		System.out.println( "nodes.getLength(): " + nodes.getLength() );
		//Node n1 = nodes.item(0);
		System.out.println("n1.getNodeName(): " + n1.getNodeName());
		System.out.println("n1.getNodeValue(): " + n1.getNodeValue());
		System.out.println("n1.getLocalName(): " + n1.getLocalName());
		System.out.println( n1 );
		System.out.println( n1.getFirstChild().getLocalName() );
		System.out.println( n1.getFirstChild().getNodeValue() );*/
	}
	
	private void obtainDone( Element elem ){
		Node result = elem.getFirstChild();
		Node done = result.getFirstChild();
		String value = done.getFirstChild().getNodeValue();
		this.done = ((value != null) ? value.equals("true") : false);
	}
	
	private void obtainRecords( Element elem ){
		
		System.out.println( "elem:" );
		System.out.println( elem );
		System.out.println( "----" );
		Node result = elem.getFirstChild();
		Node done = result.getFirstChild();
		System.out.println("done : " + done.getLocalName());
		Node queryLocator = done.getNextSibling();
		System.out.println("queryLocator : " + queryLocator.getLocalName());
		
		Node records = queryLocator.getNextSibling();
		
		Node szNode = result.getLastChild();
		String size = szNode.getFirstChild().getNodeValue();
		System.out.println("size : " + size);
		if ( Integer.parseInt( size ) == 0 ) {
			return;
		}
		
		NamedNodeMap attr = records.getAttributes();
		System.out.println( "attr : " + attr );
		Node namedItem = attr.getNamedItem("xsi:type");
		System.out.println( "xsi:type : " + namedItem );
		String localType = namedItem.getNodeValue();
		if ( (localType!=null) && (localType.startsWith("sf:")) ) {
			this.name = localType.substring( 3 );
		} else {
			this.name = "Unknown";
		}
		
		while ( (records != null) && ("records".equals( records.getLocalName() )) ) {
			System.out.println("records : " + records.getLocalName());
			
			obtainOneObject(records);
			
			records = records.getNextSibling();
		}
		
		for ( fObject o : this.objects ) {
			for ( String fName : this.fieldNames.keySet() ) {
				o.setNullIfNull(fName);
			}
		}
	}
	
	private void obtainOneObject( Node record ){
		Node field = record.getFirstChild();
		fObject o = new fObject( this.name );
		while ( field != null ) {
			String fieldName = field.getLocalName();
			if ( (fieldName != null) && (!this.fieldNames.containsKey(fieldName)) ) {
				this.fieldNames.put( fieldName, new Boolean(true) );
			}
			o.set(fieldName, field.getFirstChild().getNodeValue());
			field = field.getNextSibling();
		}
		this.objects.add( o );
	}

	public List<String> getIds(){
		final List<String> ids = new ArrayList<String>();
		for ( fObject o : this.objects ) {
			String id = o.getId();
			if ( StringUtils.isNotBlank(id) ) {
				ids.add( id );
			}
		}
		return ids;
	}

	public int getSize() {
		return this.objects.size();
	}
	
	public List<fObject> getObjects(){
		return this.objects;
	}
	
	public Set<String> getFields(){
		return this.fieldNames.keySet();
	}
	
	public boolean isValid(){
		return !this.objects.isEmpty();
	}
}
