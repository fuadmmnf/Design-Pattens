
public class VolumeOff implements ICommand {

	IDevice device;
	public VolumeOff(IDevice device)
	{
		this.device = device;
	}
	
	@Override
	public void execute() {
		device.volumeDown();
		
	}

	@Override
	public void undo() {
		device.volumeUp();
	}
	
	@Override
	public void redo() {
		execute();
	}
	
	
	
	
	

}
