//class for creating TV objects
public class TV {
	// data fields for TV with default values
	int channel = 1;
	int volumeLevel = 1;
	boolean on = false;
	
	// construcor for TV object(s)
	public TV() { // TV constructor has same name as class itself and no return type
	}
	
	// methods for defining behaviour of TV object(s)
	public void turnOn() {
		on = true;
	}
	
	public void turnOff() {
		on = false;
	}
	
	public void setChannel(int newChannel) { // setter method
		if (on && newChannel >= 1 && newChannel <= 120) 
			channel = newChannel;
	}
	
	public void setVolume(int newVolumeLevel) { // setter method
		if (on && newVolumeLevel >= 1 && newVolumeLevel <= 7)
			volumeLevel = newVolumeLevel;
	}
	
	public void channelUp() {
		if (on && channel < 120)
			channel++;
	}
	
	public void channelDown() {
		if (on && channel > 1) 
			channel--;
	}
	
	public void volumeUp() {
		if (on && volumeLevel < 7)
			volumeLevel++;
	}
	public void volumeDown() {
		if (on && volumeLevel > 1) 
			volumeLevel--;
	}
}//
