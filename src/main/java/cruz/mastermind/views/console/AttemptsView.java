package cruz.mastermind.views.console;

import cruz.mastermind.controllers.MenuController;
import cruz.mastermind.views.MessageView;
import cruz.utils.WithConsoleView;

public class AttemptsView extends WithConsoleView {

	private MenuController menuController;

	AttemptsView(MenuController menuController) {
		this.menuController = menuController;
	}

	void writeln() {
		this.console.writeln(MessageView.ATTEMPTS.getMessage().replaceFirst("#attempts",
				"" + this.menuController.getAttempts()));
	}

}
