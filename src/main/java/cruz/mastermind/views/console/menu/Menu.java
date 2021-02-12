package cruz.mastermind.views.console.menu;

import java.util.ArrayList;
import java.util.List;
import cruz.utils.ClosedInterval;
import cruz.utils.Console;

public class Menu {
    private static final String OPTION = "----- Choose one option -----";
    protected List<Command> commandList;

    public Menu() {
		this.commandList = new ArrayList<Command>();
	}
        
    public void addOptions(Command command){
        commandList.add(command);
    }

    public void execute() {
		ArrayList<Command> commands = new ArrayList<Command>();
		for (int i = 0; i < this.commandList.size(); i++) {
			if (this.commandList.get(i).isActive()) {
				commands.add(this.commandList.get(i));
			}
		}
		boolean error;
		int option;
        Console console=new Console();
		do {
			error = false;
			console.writeln();
			console.writeln(Menu.OPTION);
			for (int i = 0; i < commands.size(); i++) {
				console.writeln((i + 1) + ") " + commands.get(i).getTitle());
			}
			option = console.readInt("") - 1;
			if (!new ClosedInterval(0, commands.size()-1).includes(option)) {
				error = true;
			} 				
		} while (error);
		commands.get(option).execute();
	}
    
	public void clearCommandList(){
		this.commandList.clear();
	}
}
