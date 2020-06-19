package Entities;

import Interfaces.Observable;
import Interfaces.Observer;

public class Viewer implements Observer{
	 private String name;
	    private Observable trainee;

	    public Viewer(String name) {
	        this.setName(name);
	    }
	    
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		@Override
		public void update() {
			if (trainee == null) {
	            System.out.println("Trainee is gone!");
	            return;
	        }
	        String exercise = trainee.getUpdate();
	        System.out.println(this.getName() + " is changins his position to " + exercise);
		}

		@Override
		public void setTrainee(Observable trainee) {
			this.trainee = trainee;
			
		}
}
