package cruz.mastermind.views.console;

import cruz.mastermind.controllers.MenuController;
import cruz.mastermind.controllers.ResumeController;
import cruz.mastermind.controllers.StartController;
import cruz.mastermind.views.View;

public class ConsoleView extends View {
	
	private StartView startView;
	
	private MenuView menuView;
	
	private ResumeView resumeView;
	
	public ConsoleView(){
		this.startView = new StartView();
		this.menuView = new MenuView();
		this.resumeView = new ResumeView();
	}
	
	public void visit(StartController startController) {
		this.startView.interact(startController);		
	}
	
	public void visit(MenuController menuController) {
		this.menuView.interact(menuController);
	}
	
	public void visit(ResumeController resumeController) {
		this.resumeView.interact(resumeController);
	}
}
