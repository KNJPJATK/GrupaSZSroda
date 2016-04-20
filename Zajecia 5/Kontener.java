
public class Kontener {
	private volatile Integer number = 0;
	
	void increment(){
		synchronized (number) {
			number++;
		}
		System.out.println(number);
	}
	
	synchronized void decrement(){
		number--;
		System.out.println(number);
	}
	
}
