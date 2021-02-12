package cruz.mastermind.views;

import cruz.mastermind.controllers.AcceptController;
import cruz.mastermind.controllers.ControllersVisitor;

public abstract class View implements ControllersVisitor {
	
	public void interact(AcceptController acceptController) {
		acceptController.accept(this);
	}

}
