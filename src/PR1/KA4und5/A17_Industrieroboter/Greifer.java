package PR1.KA4und5.A17_Industrieroboter;

public class Greifer extends Werkzeug{

        public Greifer(String art, int verschleiss) {
            super(art, verschleiss);
        }
        public void ausgeben() {
            System.out.println("Greifer: " + " " + verschleiss);
        }
}
