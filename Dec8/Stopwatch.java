public class Stopwatch {

	private long startTime;
	private long endTime;
	
	Stopwatch() {
		startTime = System.currentTimeMillis();
	}
	
	public void start() {
		startTime = System.currentTimeMillis();
	}
	
	public void stop() {
		endTime = System.currentTimeMillis();
	}
	
	long getElapsedTime() {
		return endTime - startTime;
	}
}
