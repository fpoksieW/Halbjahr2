package PR1.KA4und5.A17_Industrieroboter;

public class Bohrer extends Werkzeug{

    private int groesse;

    public Bohrer(String art, int verschleiss, int groesse) {
        super(art, verschleiss);
        this.groesse = groesse;
    }

    public void ausgeben() {
        System.out.println("Bohrer: " + " " + verschleiss + " " + groesse);
    }
}
