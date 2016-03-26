import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Osoba[] osoby = {
				new Student("Adrian", "Kowalski", LocalDate.now(), "s65241"),
				new Pracownik("Jaros³aw", "Psikuta", LocalDate.now(), 0.00)
		};
		for (Osoba osoba : osoby) {
//			System.out.println(((Student) osoba).ileStypendium()); - Powoduje ClassCastException
			if (osoba instanceof Student) {
				System.out.println(((Student) osoba).ileStypendium());
			}
			System.out.println(osoba.kimJestem());
		}
		
		Speakable[] speakables = {
				new Student("Kinga", "Ma³aszyñska", LocalDate.now(), "s24541"),
				new Pracownik("Onufry", "Zag³oba", LocalDate.MIN, 0.0)
		};
		for (Speakable speakable : speakables) {
			speakable.speak();
		}
	}

}
