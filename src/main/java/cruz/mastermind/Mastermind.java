package cruz.mastermind;

import cruz.mastermind.controllers.AcceptController;
import cruz.mastermind.controllers.Logic;
import cruz.mastermind.views.View;

public abstract class Mastermind {
	
	private Logic logic;
	
	private View view;
	
	protected Mastermind() {
		this.logic = new Logic();
		this.view = this.createView();
	}
	
	protected abstract View createView();

	protected void play() {
		AcceptController acceptController;
		do {
			acceptController = this.logic.getController();
			if (acceptController != null){
				this.view.interact(acceptController);
			}
		} while (acceptController != null); 
	}
	
}

