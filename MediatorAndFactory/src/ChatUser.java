
public class ChatUser extends User{
	public ChatUser(String name, MessageMediator med) {
		super(name, med);
		med.addUser(this);
	}

	@Override
	public void sendMsg(String msg) {
		med.sendMsg(msg, this);
		System.out.println("Message: " + msg + " sent by " + this.getName());
	}

	@Override
	public void receiveMsg(String msg) {
		System.out.println("Message: " + msg + " received by " + this.getName());
	}
	
	
}
