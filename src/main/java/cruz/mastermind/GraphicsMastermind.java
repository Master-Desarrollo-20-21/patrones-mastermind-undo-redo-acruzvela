package cruz.mastermind;

import cruz.mastermind.views.View;
import cruz.mastermind.views.graphics.GraphicsView;

public class GraphicsMastermind extends Mastermind{

	protected View createView() {
		return new GraphicsView();
	}
	
	public static void main(String[] args) {
		new GraphicsMastermind().play();
	}
}
