package cruz.mastermind.controllers;

import cruz.mastermind.models.Game;
import cruz.mastermind.models.State;

public class StartController extends Controller implements AcceptController{

	public StartController(Game game, State state) {
		super(game, state);
	}
	
	public void start() {
		this.state.next();
	}
	
	@Override
	public void accept(ControllersVisitor controllersVisitor) {
		controllersVisitor.visit(this);
	}

}
