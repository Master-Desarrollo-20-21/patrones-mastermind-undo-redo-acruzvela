package cruz.mastermind.controllers;

import cruz.mastermind.models.Game;
import cruz.mastermind.models.State;

public class ResumeController extends Controller implements AcceptController{

	public ResumeController(Game game, State state) {
		super(game, state);
	}
	
	public void resume(boolean newGame) {
		if (newGame) {
			this.game.clear();
			this.state.reset();
		} else {
			this.state.next();
		}
	}

	@Override
	public void accept(ControllersVisitor controllersVisitor) {
		controllersVisitor.visit(this);
	}

}
