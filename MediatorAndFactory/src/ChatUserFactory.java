
public class ChatUserFactory extends UserFactory{

	@Override
	public User create(String userType, String name, MessageMediator med) {
		if (userType.equals("ChatBot")) {
			return ChatBot.createBot(name, med);
		} else if (userType.equals("ChatUser")) {
			return new ChatUser(name, med);
		} else {
			throw new Error("Unknown user type!");
		}
	}
	
}
