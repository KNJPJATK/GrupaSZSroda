
public interface Speakable {
	
	public static final String GLOS = "m�wi� m�wi� m�wi�";
	
	default public void speak() {
		System.out.println(getClass().getName() + ": " + GLOS);
	}

}
