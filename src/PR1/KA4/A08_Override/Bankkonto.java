package PR1.KA4.A08_Override;

public class Bankkonto {

    protected double kontostand;

    public Bankkonto(double kontostand) {
        this.kontostand = kontostand;
    }

    public void einzahlen(double betrag) {
        kontostand += betrag;
    }
    public void abheben(double betrag) {
        kontostand -= betrag;
    }

    public double getKontostand() {
        return kontostand;
    }
}
