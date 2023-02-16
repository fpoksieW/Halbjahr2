package PR1.KA4.A08_Override;

public abstract class abstractKonto {

    protected double kontoStand;


    public abstractKonto(double anfangsBetrag) {
        this.kontoStand = anfangsBetrag;
    }

    public double getKontoStand() {
        return kontoStand;
    }

    public abstract void einzahlen (double x);
    public abstract void abheben (double x);
}
