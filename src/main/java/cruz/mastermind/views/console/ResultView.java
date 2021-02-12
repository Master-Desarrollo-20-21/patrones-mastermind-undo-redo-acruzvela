package cruz.mastermind.views.console;

import cruz.mastermind.controllers.MenuController;
import cruz.mastermind.views.MessageView;
import cruz.utils.WithConsoleView;

class ResultView extends WithConsoleView {
	private MenuController menuController;
	
	ResultView(MenuController menuController){
		this.menuController = menuController;
	}

	void writeln(int i) {
		this.console.writeln(MessageView.RESULT.getMessage()
				.replaceFirst("#blacks", "" + this.menuController.getBlacks(i))
				.replaceFirst("#whites", "" + this.menuController.getWhites(i)));
	}
}
