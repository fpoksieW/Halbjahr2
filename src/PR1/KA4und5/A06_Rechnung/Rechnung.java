package PR1.KA4und5.A06_Rechnung;

public class Rechnung {
    protected double gesamtbetrag;
    protected double mehrwertsteuer;

    public Rechnung(double gesamtbetrag, double mehrwertsteuer) {
        this.gesamtbetrag = gesamtbetrag;
        this.mehrwertsteuer = mehrwertsteuer;
    }

    protected double bruttobetragBerechnen(){
        return gesamtbetrag + gesamtbetrag * mehrwertsteuer;
    }
}
