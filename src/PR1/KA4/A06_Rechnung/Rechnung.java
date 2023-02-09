package PR1.KA4.A06_Rechnung;

public class Rechnung {
    protected double gesamtbetrag;
    protected double mehrwertsteuer;

    public Rechnung(double gesamtbetrag, double mehrwertsteuer) {
        this.gesamtbetrag = gesamtbetrag;
        this.mehrwertsteuer = mehrwertsteuer;
    }
}
