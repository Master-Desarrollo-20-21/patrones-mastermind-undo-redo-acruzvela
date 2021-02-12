package cruz.mastermind.models;

import java.util.ArrayList;
import java.util.List;

import cruz.mastermind.types.Color;

public class Game {

	private static final int MAX_LONG = 10;

	private SecretCombination secretCombination;

	private List<Attempt> attempts;
	private List<Attempt> undoneAttempts;

	//private int numAttempts;

	public Game() {
		this.clear();
	}

	public void clear() {
		this.secretCombination = new SecretCombination();
		this.attempts=new ArrayList<Attempt>();
		this.undoneAttempts=new ArrayList<Attempt>();
		//this.numAttempts = 0;
	}

	public void addProposedCombination(List<Color> colors) {
		ProposedCombination proposedCombination = new ProposedCombination(colors);
		this.attempts.add(new Attempt(proposedCombination,
		this.secretCombination.getResult(proposedCombination)));
		//this.numAttempts++;
	}

	public boolean isLooser() {
		return this.getAttemptsSize() == Game.MAX_LONG;
	}
	
	public boolean isWinner() {
		return this.attempts.get(this.getAttemptsSize()-1).getResult().isWinner();
	}

	// public int getAttempts() {
	// 	return this.numAttempts;
	// }

	public List<Color> getColors(int position) {
		return this.attempts.get(position).getProposedCombination().colors;
	}

	public int getBlacks(int position) {
		return this.attempts.get(position).getResult().getBlacks();
	}

	public int getWhites(int position) {
		return this.attempts.get(position).getResult().getWhites();
	}

	public int getWidth() {
		return Combination.getWidth();
	}

	public int getAttemptsSize(){
		return this.attempts.size();
	}

	public int getUndoneAttemptsSize(){
		return this.undoneAttempts.size();
	}


	public boolean isUndoable() {
		return this.getAttemptsSize()>0;
	}
  
	public boolean isRedoable() {
		return undoneAttempts.size()>0;
	}

	public void undo(){
		Attempt attempt=attempts.remove(this.getAttemptsSize()-1);
		undoneAttempts.add(attempt);
	}

	public void redo(){
		Attempt attempt=undoneAttempts.remove(this.getUndoneAttemptsSize()-1);
		attempts.add(attempt);
	}

	public void clearUndoneAttempts(){
		this.undoneAttempts.clear();
	}
}
