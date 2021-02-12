package cruz.mastermind.views.console;

import cruz.mastermind.controllers.ResumeController;
import cruz.mastermind.views.MessageView;
import cruz.utils.YesNoDialog;

class ResumeView {

	void interact(ResumeController resumeController) {
		resumeController.resume(new YesNoDialog().read(MessageView.RESUME.getMessage()));
	}
	
}
