
public class Main {

	public static void main(String[] args) {
		MessageMediator chatroom = new ChatRoomMediator();
		ChatUserFactory userFactory = new ChatUserFactory();
		
		User user1 = userFactory.create("ChatUser", "Steve", chatroom);
		User user2 = userFactory.create("ChatUser", "Peter", chatroom);
		User user3 = userFactory.create("ChatUser", "John", chatroom);
		

		user1.sendMsg("Message 1");
		user3.sendMsg("Message 2");
		user2.sendMsg("Message 3");
		user3.sendMsg("addBot");
		user1.sendMsg("cat");
		user2.sendMsg("addBot");
		user3.sendMsg("Cool");
	}

}
