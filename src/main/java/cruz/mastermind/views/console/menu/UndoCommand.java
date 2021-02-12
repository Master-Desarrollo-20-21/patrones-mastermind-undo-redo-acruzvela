package cruz.mastermind.views.console.menu;

import cruz.mastermind.controllers.MenuController;
import cruz.mastermind.views.console.GameView;

public class UndoCommand extends Command {

    public UndoCommand(String title, MenuController menuController) {
        super(title, menuController);
    }

    @Override
    public void execute() {
        menuController.undo();
        new GameView(menuController);
    }

    @Override
    protected boolean isActive() {
        return this.menuController.isUndoable();
    }
    
}
