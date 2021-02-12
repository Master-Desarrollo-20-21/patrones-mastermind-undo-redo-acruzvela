package cruz.mastermind.views.console;

import cruz.mastermind.controllers.StartController;
import cruz.mastermind.views.MessageView;
import cruz.utils.WithConsoleView;

class StartView extends WithConsoleView {
	
	private SecretCombinationView secretCombinationView;
	
	void interact(StartController startController) {
		startController.start();
		this.console.writeln(MessageView.TITLE.getMessage());
		this.secretCombinationView = new SecretCombinationView(startController);
		this.secretCombinationView.writeln();
	}

}
