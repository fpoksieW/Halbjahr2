package PR1.KA4und5.A17_Industrieroboter;

public class Schweisser extends Werkzeug{

    public Schweisser(String art, int verschleiss) {
        super(art, verschleiss);
    }
    public void ausgeben() {
        System.out.println("Schweisser: " + " " + verschleiss);
    }
}
