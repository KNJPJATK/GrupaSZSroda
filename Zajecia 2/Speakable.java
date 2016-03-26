
public interface Speakable {
	
	public static final String GLOS = "mówiê mówiê mówiê";
	
	default public void speak() {
		System.out.println(getClass().getName() + ": " + GLOS);
	}

}
