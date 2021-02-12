package cruz.mastermind.views.console.menu;

import cruz.mastermind.controllers.MenuController;
import cruz.mastermind.views.console.ProposedCombinationView;
import cruz.mastermind.views.console.ErrorView;
import cruz.mastermind.views.console.GameView;
import cruz.mastermind.types.Color;
import cruz.mastermind.types.Error;
import java.util.List;

public class ProposedCommand extends Command {

    public ProposedCommand(String title, MenuController menuController) {
        super(title, menuController);
    }

    @Override
    public void execute() {
        Error error;
		do {
			List<Color> colors = new ProposedCombinationView(this.menuController).read();
			error = this.menuController.addProposedCombination(colors);
			if (!error.isNull()) {
				new ErrorView(error).writeln();
			}
		} while (!error.isNull());
        menuController.clearUndoneAttempts();
		new GameView(this.menuController);
    }

    @Override
    protected boolean isActive() {
        return true;
    }
}
