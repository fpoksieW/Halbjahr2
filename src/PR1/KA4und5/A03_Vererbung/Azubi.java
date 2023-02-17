package PR1.KA4und5.A03_Vererbung;

public class Azubi extends Mitarbeiter {

    protected String beruf;
    protected int ausJahr;

    public Azubi(double gehalt, String vorname, String name, String beruf, int ausJahr) {
        super(gehalt, vorname, name);
        this.beruf = beruf;
        this.ausJahr = ausJahr;
    }
}
