package cruz.mastermind.views.console.menu;

import cruz.mastermind.controllers.MenuController;

public abstract class Command {
    protected String title;
	protected MenuController menuController;
	
	protected Command(String title, MenuController menuController){
		this.title = title;
		this.menuController=menuController;
	}

    public String getTitle() {
		return title;
	}
	
	public abstract void execute();
    protected abstract boolean isActive();
}
