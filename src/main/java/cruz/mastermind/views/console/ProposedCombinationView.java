package cruz.mastermind.views.console;

import java.util.ArrayList;
import java.util.List;

import cruz.mastermind.controllers.MenuController;
import cruz.mastermind.types.Color;
import cruz.utils.WithConsoleView;
import cruz.mastermind.views.MessageView;

public class ProposedCombinationView extends WithConsoleView {
	
	private MenuController menuController;
	
	public ProposedCombinationView(MenuController menuController) {
		this.menuController = menuController;
	}
	
	public void write(int position) {
		for (Color color : this.menuController.getColors(position)) {
			new ColorView(color).write();
		}
	}

	public List<Color> read() {
		String characters = this.console.readString(MessageView.PROPOSED_COMBINATION.getMessage());
		List<Color> colors = new ArrayList<Color>();
		for (int i=0; i<characters.length(); i++) {
			colors.add(ColorView.getInstance(characters.charAt(i)));
		}
		return colors;
	}
	
}
