package cruz.mastermind.views.console;

import cruz.mastermind.controllers.MenuController;
import cruz.utils.WithConsoleView;

public class GameView extends WithConsoleView{
    public GameView(MenuController menuController){
        this.console.writeln();
        new AttemptsView(menuController).writeln();
		new SecretCombinationView(menuController).writeln();
        for (int i = 0; i < menuController.getAttempts(); i++) {
			new ProposedCombinationView(menuController).write(i);
			new ResultView(menuController).writeln(i);
		}
    }
}
