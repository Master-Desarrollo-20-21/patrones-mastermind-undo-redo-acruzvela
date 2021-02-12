package cruz.mastermind.views.console;

import cruz.mastermind.types.Error;
import cruz.utils.Console;

public class ErrorView extends cruz.mastermind.views.ErrorView {

	public ErrorView(Error error) {
		super(error);
	}
	
	public void writeln() {
		new Console().writeln(ErrorView.MESSAGES[this.error.ordinal()]);
	}	

}
