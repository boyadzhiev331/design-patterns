package Entities;

import Interfaces.Command;

public class Instructor {
	private Command command;

	public void setCommand(Command command) {
		this.command = command;
	}
	
	public String switchExercise() {
		System.out.println("Switching exercises...");
		return this.command.execute();
	}
}
