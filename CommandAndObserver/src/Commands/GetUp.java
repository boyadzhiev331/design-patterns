package Commands;

import Interfaces.Command;

public class GetUp implements Command{
	protected Exercise ex;
	
	public GetUp(Exercise ex) {
		this.ex = ex;
	}

	@Override
	public String execute() {
		return this.ex.getUp();
	}
}
