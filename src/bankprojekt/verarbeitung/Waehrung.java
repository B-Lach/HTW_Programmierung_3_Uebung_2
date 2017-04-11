package bankprojekt.verarbeitung;

/**
 * Enum um Währungen zu repräsentieren
 * @author HorseT
 *
 */
public enum Waehrung {
	/**
	 * Euro
	 */
	EUR(1.0),
	/**
	 * Bulgarische Leva 
	 */
	BGN(1.95583),
	/**
	 * Litauische Litas
	 */
	LTL(1.95583),
	/**
	 * Konvertible Mark
	 */
	KM(3.4528);
	
	private double kurs;
	
	private Waehrung(double kurs) {
		this.kurs = kurs;
	}
	
	/**
	 * Methode um einen Betrag in Euro in die Landeswaehrung umzurechnen
	 * @param betrag Der zu konvertierende Betrag in Euro
	 * @return Umgerechneter Betrag in Landeswaehrung
	 */
	public double umrechnen(double betrag) {
		return betrag * kurs;
	}
}
