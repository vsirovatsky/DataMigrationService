package force.load;

public class DependencyNode {

	private final String baseClassName;
	
	private final String targetClassName;
	
	private final String fieldName;

	public DependencyNode(String baseClassName, String targetClassName,
			String fieldName) {
		super();
		this.baseClassName = baseClassName;
		this.targetClassName = targetClassName;
		this.fieldName = fieldName;
	}

	public String getBaseClassName() {
		return baseClassName;
	}

	public String getTargetClassName() {
		return targetClassName;
	}

	public String getFieldName() {
		return fieldName;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append('[');
		sb.append(" baseClassName : ");
		sb.append(this.baseClassName);
		sb.append(' ');
		sb.append(']');
		sb.append('[');
		sb.append(" targetClassName : ");
		sb.append(this.targetClassName);
		sb.append(' ');
		sb.append(']');
		sb.append('[');
		sb.append(" fieldName : ");
		sb.append(this.fieldName);
		sb.append(' ');
		sb.append(']');
		return sb.toString();
	}
}
