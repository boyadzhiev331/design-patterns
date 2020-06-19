package Commands;

public class Exercise {
	protected boolean isUp;
	
	public String getUp() {
		System.out.println("Please get up!");
		this.isUp = true;
		return "Up";
	}
	
	public String layDown() {
		System.out.println("Please lay down!");
		this.isUp = false;
		return "Down";
	}
}
