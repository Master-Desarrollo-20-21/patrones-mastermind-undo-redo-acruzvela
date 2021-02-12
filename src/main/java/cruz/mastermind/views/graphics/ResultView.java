package cruz.mastermind.views.graphics;

import javax.swing.JLabel;

import cruz.mastermind.controllers.ProposalController;
import cruz.mastermind.views.MessageView;

@SuppressWarnings("serial")
class ResultView extends JLabel {
	
	private ProposalController proposalController;

	ResultView(ProposalController proposalController) {
		this.proposalController = proposalController;
		this.setText(MessageView.RESULT.getMessage()
				.replaceFirst("#blacks", "" + this.proposalController.getBlacks(this.proposalController.getAttempts()-1))
				.replaceFirst("#whites", "" + this.proposalController.getWhites(this.proposalController.getAttempts()-1)));
	}
	
}
