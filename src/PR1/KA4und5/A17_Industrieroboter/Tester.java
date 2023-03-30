package PR1.KA4und5.A17_Industrieroboter;

public class Tester {
    public static void main(String[] args) {

        Industrieroboter robi = new Industrieroboter();

        Bohrer bohrer1 = new Bohrer("Bohrer", 0, 10);
        Bohrer bohrer2 = new Bohrer("Bohrer", 0, 10);

        System.out.println(robi.werkzeugHinzufuegen(5, bohrer1));
        System.out.println(robi.werkzeugHinzufuegen(5, bohrer2));
        System.out.println(robi.werkzeugHinzufuegen(10, bohrer2));
        System.out.println(robi.werkzeugHinzufuegen(-1, bohrer2));
        System.out.println(robi.werkzeugEntfernen(5));
        System.out.println(robi.werkzeugEntfernen(5));
        System.out.println(robi.werkzeugEntfernen(10));
        System.out.println(robi.werkzeugEntfernen(-1));

    }
}
