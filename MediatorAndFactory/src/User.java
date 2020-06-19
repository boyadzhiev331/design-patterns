
public abstract class User {
	private String name;
	protected MessageMediator med;
	
	public User(String name, MessageMediator med) {
		this.setName(name);
		this.med = med;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void sendMsg(String msg);
	public abstract void receiveMsg(String msg);
}
