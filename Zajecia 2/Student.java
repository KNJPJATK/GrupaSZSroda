import java.time.LocalDate;
import java.time.Period;

public class Student extends Osoba {
	
	private String numerIndeksu;

	public Student(String imie, String nazwisko, LocalDate dataUrodzenia, String numerIndeksu) {
		super(imie, nazwisko, dataUrodzenia);
		this.numerIndeksu = numerIndeksu;
	}

	public String getNumerIndeksu() {
		return numerIndeksu;
	}

	public void setNumerIndeksu(String numerIndeksu) {
		this.numerIndeksu = numerIndeksu;
	}
	
	@Override
	public String kimJestem() {
		return "Studentem";
	}
	
	public double ileStypendium() {
		double result = 1.2;
		Period period = Period.between(getDataUrodzenia(), LocalDate.now());
		return (result * period.getYears());
	}

	@Override
	public String toString() {
		return String.format("Student [%s, numerIndeksu=%s]", super.toString(), numerIndeksu);
	}

}
