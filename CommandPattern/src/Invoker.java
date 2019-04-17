import java.util.ArrayList;

public class Invoker implements ICommand {
	
	ArrayList <ICommand> executeList = new ArrayList<>();
	ArrayList <ICommand> undoList = new ArrayList<>();
	
	public void addCommand(ICommand command)
	{
		executeList.add(command);
		undoList.add(command);
	}
	

	@Override
	public void execute() {
		for(ICommand command: executeList)
		{
			command.execute();
			
		}
		
	}

	@Override
	public void undo() 
	{
		int lastIndex = undoList.size() - 1;
		
		if(lastIndex>-1)
		{
			undoList.get(lastIndex).undo();
			undoList.remove(lastIndex);
			
		}
		else
		{
			System.out.println("No more commad to undo!");
		}
	}
	
	@Override
	public void redo() {
		(executeList.get(executeList.size() - 1)).execute();
	}
	
	

}
