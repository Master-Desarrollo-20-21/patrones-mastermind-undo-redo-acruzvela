package cruz.mastermind.views.console.menu;

import cruz.mastermind.controllers.MenuController;
import cruz.mastermind.views.console.GameView;

public class RedoCommand extends Command {

    public RedoCommand(String title, MenuController menuController) {
        super(title, menuController);
    }

    @Override
    public void execute() {
        menuController.redo();
        new GameView(menuController);
    }

    @Override
    protected boolean isActive() {
        return this.menuController.isRedoable();
    }
    
}
