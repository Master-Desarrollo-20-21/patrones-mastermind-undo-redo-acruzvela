package cruz.mastermind.views.console;

import cruz.mastermind.controllers.Controller;
import cruz.mastermind.views.MessageView;
import cruz.utils.WithConsoleView;

class SecretCombinationView extends WithConsoleView {
	
	private Controller controller;
	
	SecretCombinationView(Controller controller) {
		super();
		this.controller = controller;
	}
	
	void writeln() {
		for (int i = 0; i < this.controller.getWidth(); i++) {
			this.console.write(MessageView.SECRET.getMessage());
		}
		this.console.writeln();
	}
	
}
