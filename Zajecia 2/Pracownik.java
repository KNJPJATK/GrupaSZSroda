import java.time.LocalDate;

public class Pracownik extends Osoba {
	
	private double pensja;

	public Pracownik(String imie, String nazwisko, LocalDate dataUrodzenia, double pensja) {
		super(imie, nazwisko, dataUrodzenia);
		this.pensja = pensja;
	}

	public double getPensja() {
		return pensja;
	}

	public void setPensja(double pensja) {
		this.pensja = pensja;
	}
	
	@Override
	public void speak() {
		System.out.println("Poproszê o podwy¿kê");
	}
	
	@Override
	public String kimJestem() {
		return "Pracownikiem";
	}

	@Override
	public String toString() {
		return String.format("Pracownik [%s, pensja=%s]", super.toString(), pensja);
	}

}
