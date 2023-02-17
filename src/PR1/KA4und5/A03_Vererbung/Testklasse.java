package PR1.KA4und5.A03_Vererbung;

public class Testklasse {

    public static void main(String[] args) {

        Mitarbeiter Wa = new Mitarbeiter(1600.0, "Andres", "Wellstein");
        Mitarbeiter Dit = new Mitarbeiter(1650.0, "Hans", "Dietrich");
        Fuehrungskraft Krp = new Fuehrungskraft(4000.0, "Joachim", "Krappel");
        Hausmeister Dar = new Hausmeister();

        System.out.println(Krp.position);
        System.out.println(Krp.gehalt);


    }
}
