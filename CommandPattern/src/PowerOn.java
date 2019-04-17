
public class PowerOn implements ICommand  
{
	IDevice device;
	public PowerOn(IDevice device)
	{
		this.device = device;
	}

	@Override
	public void execute() {
		System.out.println("DEvice Power is on");
		
	}

	@Override
	public void undo() {
		System.out.println("DEvice Power is off");
	}
	
	@Override
	public void redo() {
		execute();
	}
	
	
	
}
