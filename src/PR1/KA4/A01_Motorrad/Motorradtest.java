package PR1.KA4.A01_Motorrad;

public class Motorradtest {

    public static void main(String[] args) {
        Motor myMotor = new Motor(36,1337.0);
        Reifen vorderReifen = new Reifen(16, 3.0, "Sommer");
        Reifen hinterReifen = new Reifen(16, 3.0, "Sommer");

        Motorrad harley = new Motorrad(hinterReifen, vorderReifen, myMotor);

        Motorrad fatboy = new Motorrad(new Reifen(16, 3.0, "Sommer"),
                    new Reifen(16, 3.0, "Sommer"),
                    new Motor(36,1337.0));

        harley.getInfo();

        System.out.println("##############################");
        System.out.println(fatboy.getHinterReifen().getDurchmesser());



    }
}
