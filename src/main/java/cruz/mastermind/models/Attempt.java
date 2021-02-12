package cruz.mastermind.models;

public class Attempt {
    private ProposedCombination proposedCombination;
    private Result result;

    public Attempt(ProposedCombination proposedCombination,Result result){
        this.proposedCombination=proposedCombination;
        this.result=result;
    }

    public ProposedCombination getProposedCombination() {
        return proposedCombination;
    }

    public Result getResult() {
        return result;
    }
    
}
