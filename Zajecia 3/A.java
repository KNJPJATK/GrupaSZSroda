
public class A {
	private int number;

	public class B {
		private int number = 100;

		void doSomething() {
			System.out.println("Cos B " + number + " " + A.this.number);
		}

	}

	public static class C {
		void doSomething2() {
			System.out.println("Cos C");
		}
	}

}
