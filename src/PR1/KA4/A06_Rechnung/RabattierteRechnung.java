package PR1.KA4.A06_Rechnung;

public class RabattierteRechnung extends Rechnung{

    protected double rabatt;

    public RabattierteRechnung(double gesamtbetrag, double mehrwertsteuer, double rabatt) {
        super(gesamtbetrag, mehrwertsteuer);
        this.rabatt = rabatt;
    }
    
}
