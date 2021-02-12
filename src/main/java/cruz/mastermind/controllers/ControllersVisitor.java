package cruz.mastermind.controllers;

public interface ControllersVisitor {
	
	void visit(StartController startController);
	
	void visit(MenuController menuController);
	
	void visit(ResumeController continueController);
}
