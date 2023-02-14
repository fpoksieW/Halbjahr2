package PR1.KA4.A08_Override;

public class Sparkonto extends Bankkonto{

    private double zinsSatz;

    public Sparkonto(double kontostand, double zinsSatz) {
        super(kontostand);
        this.zinsSatz = zinsSatz;
    }

    public void zinsenAnrechnen () {
        kontostand += (kontostand * zinsSatz);
    }

}
