
public class TestTV {
	public static void main(String[] args) {
		TV tv1 = new TV();
		tv1.turnOn();
		tv1.setChannel(30);
		tv1.setVolume(5);
		
		TV tv2 = new TV();
		tv2.turnOn(); // on = true.
		tv2.channelUp(); // channel moves up from default of 1 to 2.
		tv2.channelUp(); // channel moves up from 2 to 3.
		tv2.volumeUp(); // volume moves up from default of 1 to 2.
		
		System.out.println("tv1's channel is " + tv1.channel + " and volume level is " + tv1.volumeLevel);
		
		System.out.println("tv2's channel is " + tv2.channel + " and volume level is " + tv2.volumeLevel);
	}//
}//
