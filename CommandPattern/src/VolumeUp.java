
public class VolumeUp implements ICommand{
	IDevice device;
	public VolumeUp(IDevice device)
	{
		this.device = device;
	}
	
	@Override
	public void execute() {
		
		device.volumeUp();
	}

	@Override
	public void undo() {
		
		device.volumeDown();
	}
	
	@Override
	public void redo() {
		execute();
	}
}
