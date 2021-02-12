package cruz.mastermind.views.console;

import java.util.List;

import cruz.mastermind.controllers.MenuController;
import cruz.mastermind.types.Color;
import cruz.mastermind.types.Error;
import cruz.utils.WithConsoleView;
import cruz.mastermind.views.MessageView;

public class ProposalView extends WithConsoleView {

	public void interact(MenuController menuController) {
		Error error;
		do {
			List<Color> colors = new ProposedCombinationView(menuController).read();
			error = menuController.addProposedCombination(colors);
			if (error != null) {
				new ErrorView(error).writeln();
			}
		} while (error != null);
		new GameView(menuController);
		if (menuController.isWinner()) {
			this.console.writeln(MessageView.WINNER.getMessage());
		} else if (menuController.isLooser()) {
			this.console.writeln(MessageView.LOOSER.getMessage());
		}
	}
}
