package cruz.mastermind.controllers;

import java.util.HashMap;
import java.util.Map;

import cruz.mastermind.models.Game;
import cruz.mastermind.models.State;
import cruz.mastermind.models.StateValue;

public class Logic {
	
	private State state;
	
	private Game game;
	
	private Map<StateValue, AcceptController> acceptControllers;
		
	public Logic() {
		this.state = new State();
		this.game = new Game();
		this.acceptControllers = new HashMap<StateValue, AcceptController>();
		this.acceptControllers.put(StateValue.INITIAL, new StartController(this.game, this.state));
		this.acceptControllers.put(StateValue.IN_GAME, new MenuController(this.game, this.state));
		this.acceptControllers.put(StateValue.FINAL, new ResumeController(this.game, this.state));
		this.acceptControllers.put(StateValue.EXIT, null);
	}
	
	public AcceptController getController() {
		return this.acceptControllers.get(this.state.getValueState());
	}
	
}
