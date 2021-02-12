package cruz.mastermind.views.console;

import cruz.mastermind.controllers.MenuController;
import cruz.mastermind.views.MessageView;
import cruz.mastermind.views.console.menu.Menu;
import cruz.mastermind.views.console.menu.ProposedCommand;
import cruz.mastermind.views.console.menu.RedoCommand;
import cruz.mastermind.views.console.menu.UndoCommand;

public class MenuView {
    private Menu menu;
    
    public MenuView(){
        this.menu=new Menu();
    }

    public void interact(MenuController menuController){
        this.initMenu(menuController);
        this.menu.execute();
    }

    private void initMenu(MenuController menuController){
        this.menu.clearCommandList();
        this.menu.addOptions(new ProposedCommand(MessageView.PROPOSE_COMMAND.getMessage(),menuController));
		this.menu.addOptions(new UndoCommand(MessageView.UNDO_COMMAND.getMessage(),menuController));
		this.menu.addOptions(new RedoCommand(MessageView.REDO_COMMAND.getMessage(),menuController));
    }
}
