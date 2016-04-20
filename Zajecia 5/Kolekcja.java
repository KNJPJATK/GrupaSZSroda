
public class Kolekcja<T extends Integer> {
	
	private int length = 0;
	private T[] array;
	
	public Kolekcja() {
//		array = new T[10];
	}
	
	public void addAll(Kolekcja<? extends T> kolekcja) {
		for (T e : kolekcja.array) {
			System.out.println(e.toString());
		}
	}
	
	public void add(T e) {
		array[length++] = e;
	}

}
