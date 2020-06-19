import java.util.ArrayList;
import java.util.List;

import Commands.Exercise;
import Commands.GetUp;
import Commands.LayDown;
import Entities.Instructor;
import Entities.Trainee;
import Entities.Viewer;
import Interfaces.Command;

public class Main {

	public static void main(String[] args) {
		Instructor instructor = new Instructor();
		Exercise exercise = new Exercise();
	    Trainee trainee = new Trainee();
	    
        List<Command> exercises = new ArrayList<Command>();
        List<Viewer> viewers = new ArrayList<Viewer>();

        exercises.add(new LayDown(exercise));
        exercises.add(new GetUp(exercise));

        viewers.add(new Viewer("Steve"));
        viewers.add(new Viewer("John"));
        viewers.add(new Viewer("Mike"));

        for (Viewer viewer : viewers) {
            trainee.subscribe(viewer);
        }

        while (true) {
            for (Command command : exercises) {
            	instructor.setCommand(command);
            	trainee.doExercise(instructor.switchExercise());
                System.out.println();

                try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
            }
        }
	}
}

