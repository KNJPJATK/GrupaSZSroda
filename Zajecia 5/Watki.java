
public class Watki {

	public static void main(String[] args) throws InterruptedException {
		// Runnable r = () -> {
		// while (true) {
		// try {
		// Thread.sleep(500);
		// } catch (Exception e) {
		// e.printStackTrace();
		// }
		// System.out.println("Watek " + Thread.currentThread().getName());
		// }
		// };
		// Thread[] threads = new Thread[10];
		// for (int i = 0; i < 10; i++) {
		// threads[i] = new Thread(r, "Thread " + i);
		// }
		// for (int i = 0; i < 10; i++) {
		// threads[i].start();
		// }

		// Thread t1 = new Thread(() -> {
		// while (true) {
		// try {
		//// Thread.sleep(500);
		// } catch (Exception e) {
		// e.printStackTrace();
		// }
		// System.out.println("Watek " + Thread.currentThread());
		// }
		// });
		//
		// t1.start();
		//
		// while (true) {
		// System.out.println("Watek main " + Thread.currentThread());
		//// Thread.sleep(500);
		// }

		Kontener kon = new Kontener();

		Thread t2 = new Thread(() -> {
			while (true) {
				kon.increment();
				try {
					Thread.sleep(100);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		Thread t3 = new Thread(() -> {
			while (true) {
				kon.decrement();
				try {
					Thread.sleep(100);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		t2.start();
		t3.start();
	}

}
