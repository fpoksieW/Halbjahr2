package PR1.KA4und5.A09_Immobilien;

public class StartImmobilie {

    public static void main(String[] args) {

        Wohnung w1 = new Wohnung("Ulm", 2005, 85.0, 185000.0);
        Wohnhaus h1 = new Wohnhaus("Esslingen", 1996, 180.0, 575000.0, 450.0);

        System.out.println(w1.getInfo());
        System.out.println(h1.getInfo());
    }
}
