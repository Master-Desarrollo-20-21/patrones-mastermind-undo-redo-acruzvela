package cruz.mastermind.controllers;

import cruz.mastermind.models.Game;
import cruz.mastermind.models.State;

public class UndoController extends Controller {

    public UndoController(Game game, State state) {
        super(game, state);
    }

    public void undo(){
        this.game.undo();
    }
    
}
