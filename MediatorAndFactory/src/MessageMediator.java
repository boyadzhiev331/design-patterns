public interface MessageMediator {
	void addUser(User user);
	void removeUser(User user);
	void sendMsg(String msg, User user);
}
