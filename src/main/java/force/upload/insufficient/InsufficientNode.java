package force.upload.insufficient;

import force.StringUtils;

public class InsufficientNode {
	
	private final String baseClass;
	
	private final String targetClass;
	
	private final String field;
	
	private final String value;

	public String getBaseClass() {
		return baseClass;
	}

	public String getTargetClass() {
		return targetClass;
	}

	public String getField() {
		return field;
	}

	public String getValue() {
		return value;
	}

	public InsufficientNode(String baseClass, String targetClass, String field,
			String value) {
		super();
		this.baseClass = baseClass;
		this.targetClass = targetClass;
		this.field = field;
		this.value = value;
	}
	
	public boolean isValid(){
		return ( StringUtils.isNotBlank(this.baseClass) && StringUtils.isNotBlank(this.targetClass) &&
				StringUtils.isNotBlank(this.field) && StringUtils.isNotBlank(this.value) && !("null".equalsIgnoreCase(this.value)));
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append( this.field );
		sb.append( '(' );
		sb.append( this.targetClass );
		sb.append( ')' );
		sb.append( ' ' );
		sb.append( '=' );
		sb.append( ' ' );
		sb.append( this.value );
		return sb.toString();
	}
}