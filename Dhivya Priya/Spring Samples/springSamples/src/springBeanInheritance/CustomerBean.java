package springBeanInheritance;

public class CustomerBean extends Customer {

	private int type;
	private String action;
	
	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}
}
