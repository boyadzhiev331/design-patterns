package Commands;

import Interfaces.Command;

public class LayDown implements Command{
	protected Exercise ex;
	
	public LayDown(Exercise ex) {
		this.ex = ex;
	}

	@Override
	public String execute() {
		return this.ex.layDown();
	}
	
}
