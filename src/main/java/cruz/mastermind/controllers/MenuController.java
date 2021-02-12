package cruz.mastermind.controllers;

import java.util.List;

import cruz.mastermind.models.Game;
import cruz.mastermind.models.State;
import cruz.mastermind.types.Color;
import cruz.mastermind.types.Error;

public class MenuController extends Controller implements AcceptController {

    private ProposalController proposalController;
	private UndoController undoController;
	private RedoController redoController;

    MenuController(Game game, State state) {
        super(game, state);
        this.proposalController = new ProposalController(game, state);
		this.undoController = new UndoController(game, state);
		this.redoController = new RedoController(game, state);
    }

    @Override
    public void accept(ControllersVisitor controllersVisitor) {
        controllersVisitor.visit(this);
    }

    public boolean isUndoable() {
    return this.game.isUndoable();
    }

    public boolean isRedoable() {
        return this.game.isRedoable();
    }

    public ProposalController getProposalController(){
        return this.proposalController;
    }

    public void undo(){
        this.undoController.undo();
    }

    public void redo(){
        redoController.redo();
    }

    public List<Color> getColors(int position) {
        return this.proposalController.getColors(position);
    }

    public Error addProposedCombination(List<Color> colors) {
		return this.proposalController.addProposedCombination(colors);
	}

    public int getAttempts() {
		return this.proposalController.getAttempts();
	}

    public int getBlacks(int position) {
		return this.proposalController.getBlacks(position);
	}

	public int getWhites(int position) {
		return this.proposalController.getWhites(position);
	}

    public boolean isWinner() {
		return this.proposalController.isWinner();
	}

	public boolean isLooser() {
		return this.proposalController.isLooser();
	}

    public void clearUndoneAttempts(){
        this.game.clearUndoneAttempts();
    }
}
