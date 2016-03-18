public class Student extends Osoba {
	private static int counter;
	private String nrIndeksu;
	private final int id;

	public Student(String imie, String nazwisko, char plec, String nrIndeksu){
		super(imie, nazwisko, plec);
		this.nrIndeksu = nrIndeksu;
		
		id = counter++;
	}
	
}
