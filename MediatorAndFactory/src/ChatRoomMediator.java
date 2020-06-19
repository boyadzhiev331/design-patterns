import java.util.ArrayList;
import java.util.List;

public class ChatRoomMediator implements MessageMediator{
	protected ChatBot chatBot;
	protected List<User> users;
	
	public ChatRoomMediator() {
		this.users = new ArrayList<User>();
	}

	@Override
	public void addUser(User user) {
		this.users.add(user);
		System.out.println(user.getName() + " has joined.");
	}

	@Override
	public void removeUser(User user) {
		this.users.remove(user);
		System.out.println(user.getName() + " has left.");
	}

	@Override
	public void sendMsg(String msg, User user) {
		if (!this.users.contains(user)) {
			System.out.println("You have to join this chatroom to send messages!");
			return;
		}
		if (msg.equals("addBot")) {
			if (chatBot == null) {
				ChatUserFactory userFactory = new ChatUserFactory();
				chatBot = (ChatBot) userFactory.create("ChatBot", "Bot 1", this);	
			}
			else {
				System.out.println("There is already a bot in this chatroom.");
			}
		}
		if (chatBot != null) {
			if (msg.contains("cat")) {
				this.removeUser(user);
				chatBot.sendMsg(user.getName() + " was removed by a bot.");
				return;
			}
		}
		for (User _user : this.users) {
			_user.receiveMsg(msg);
		}
	}
}
