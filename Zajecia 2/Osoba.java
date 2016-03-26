import java.time.LocalDate;

public abstract class Osoba implements Speakable {
	
	private String imie, nazwisko;
	private LocalDate dataUrodzenia;
	
	public Osoba(String imie, String nazwisko, LocalDate dataUrodzenia) {
		super();
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.dataUrodzenia = dataUrodzenia;
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

	public LocalDate getDataUrodzenia() {
		return dataUrodzenia;
	}

	public void setDataUrodzenia(LocalDate dataUrodzenia) {
		this.dataUrodzenia = dataUrodzenia;
	}
	
	public abstract String kimJestem();

	@Override
	public String toString() {
		return String.format("Osoba [imie=%s, nazwisko=%s, dataUrodzenia=%s]", imie, nazwisko, dataUrodzenia);
	}

}
