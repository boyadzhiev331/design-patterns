
public class ChatBot extends User{
	private static ChatBot chatBot;
	
	public ChatBot(String name, MessageMediator med) {
		super(name, med);
		med.addUser(this);
	}
	
	public static ChatBot createBot(String name, MessageMediator med) {
		return chatBot == null ? new ChatBot(name, med) : chatBot;
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
