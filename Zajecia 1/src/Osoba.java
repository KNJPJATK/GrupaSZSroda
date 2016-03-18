/**
 * 
 * @author s11848
 * 
 */

public class Osoba {
	private String imie = "Janeczka", nazwisko;
	private char plec = 'K';

	public Osoba(String imie, String nazwisko, char plec) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.plec = plec;
	}

	public Osoba(String imie, String nazwisko) {
		this(imie, nazwisko, 'M');
	}

	public Osoba(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public Osoba() {
	}
	
	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public char getPlec() {
		return plec;
	}

	public void setPlec(char plec) {
		if (plec != 'K' || plec != 'M') {
			System.out.println("Niepoprwana plec!!!");
			return;
		}

		this.plec = plec;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Osoba [imie=");
		builder.append(imie);
		builder.append(", nazwisko=");
		builder.append(nazwisko);
		builder.append(", plec=");
		builder.append(plec);
		builder.append("]");
		return builder.toString();
	}

	public void show(){
		
	}
	
}
