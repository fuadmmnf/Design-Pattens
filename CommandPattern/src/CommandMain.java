
public class CommandMain {
	public static void main(String [] args)
	{
		IDevice radio = new Radio();
		
		Invoker invoker = new Invoker();
		invoker.addCommand(new VolumeUp(radio));
		invoker.addCommand(new VolumeOff(radio));
		invoker.execute();
		invoker.undo();
		invoker.undo();
		invoker.undo();
		
		invoker.addCommand(new PowerOff(radio));
		invoker.addCommand(new PowerOn(radio));
		invoker.addCommand(new PowerOn(radio));
		invoker.execute();
		invoker.undo();
		invoker.redo();
		
		
		
	}

}
