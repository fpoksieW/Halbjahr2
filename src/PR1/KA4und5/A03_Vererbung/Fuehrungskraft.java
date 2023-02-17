package PR1.KA4und5.A03_Vererbung;

public class Fuehrungskraft extends Mitarbeiter{

    protected String position;

    public Fuehrungskraft() {
        super();
    }

    public Fuehrungskraft(double gehalt, String vorname, String name) {
        super(gehalt, vorname, name);
        position = "A Boss";
    }

}
