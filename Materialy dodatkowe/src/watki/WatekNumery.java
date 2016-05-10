package watki;

/**
 * Ustawianie watkow w kolejke - wyswietlanie numerow po kolei
 */

public class WatekNumery implements Runnable {
	public static final Object SEMAPHORE = new Object();

	private static int lastPrinted = -1;
	private static int quantity = -1;

	private int numToPrint;

	public WatekNumery() {
		this.numToPrint = ++quantity;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (SEMAPHORE) {
				if (lastPrinted == quantity) {
					lastPrinted = -1;
				}

				try {
					while (true) {
						if (numToPrint == lastPrinted + 1)
							break;

						SEMAPHORE.wait();
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				System.out.print(numToPrint);
				lastPrinted++;

				SEMAPHORE.notifyAll();
				try {
					// potrzebne tylko do rozjasnienia outputu
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
		Thread[] threads = new Thread[10];

		for (int i = 0; i < threads.length; i++) {
			threads[i] = new Thread(new WatekNumery());
			threads[i].start();
		}
	}
}