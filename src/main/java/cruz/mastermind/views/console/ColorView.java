package cruz.mastermind.views.console;

import cruz.mastermind.types.Color;
import cruz.utils.Console;

class ColorView extends cruz.mastermind.views.ColorView {

	ColorView(Color color) {
		super(color);
	}
	
	void write() {
		new Console().write(ColorView.INITIALS[this.color.ordinal()]);
	}

}
