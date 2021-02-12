package cruz.mastermind.controllers;

import cruz.mastermind.models.Game;
import cruz.mastermind.models.State;

public class RedoController extends Controller{

    public RedoController(Game game, State state) {
        super(game, state);
    }

    public void redo(){
        this.game.redo();
    }
}
