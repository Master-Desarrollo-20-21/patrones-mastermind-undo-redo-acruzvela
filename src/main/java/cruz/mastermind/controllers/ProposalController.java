package cruz.mastermind.controllers;

import java.util.List;

import cruz.mastermind.models.Combination;
import cruz.mastermind.models.Game;
import cruz.mastermind.models.State;
import cruz.mastermind.types.Color;
import cruz.mastermind.types.Error;

public class ProposalController extends Controller {

	public ProposalController(Game game, State state) {
		super(game, state);
	}

	public Error addProposedCombination(List<Color> colors) {
		Error error=Error.NULL;
		if (colors.size() != Combination.getWidth()) {
			error = Error.WRONG_LENGTH;
		} else {
			for (int i = 0; i < colors.size(); i++) {
				if (colors.get(i) == null) {
					error = Error.WRONG_CHARACTERS;
				} else {
					for (int j = i+1; j < colors.size(); j++) {
						if (colors.get(i) == colors.get(j)) {
							error = Error.DUPLICATED;
						}
					}
				}				
			}
		}
		if (error.isNull()){
			this.game.addProposedCombination(colors);
			if (this.game.isWinner() || this.game.isLooser()) {
				this.state.next();
			}
		}
		return error;	
	}

	public boolean isWinner() {
		return this.game.isWinner();
	}

	public boolean isLooser() {
		return this.game.isLooser();
	}
	
	public int getAttempts() {
		return this.game.getAttemptsSize();
	}

	public List<Color> getColors(int position) {
		return this.game.getColors(position);
	}

	public int getBlacks(int position) {
		return this.game.getBlacks(position);
	}

	public int getWhites(int position) {
		return this.game.getWhites(position);
	}
	
}
