package PR1.KA4.A01_Motorrad;

public class Reifen {

    private double durchmesser;
    private double profiltiefe;
    private String jahreszeit;

    public Reifen(double pDurchmesser, double pProfiltiefe, String pJahreszeit) {
        this.durchmesser = pDurchmesser;
        this.profiltiefe = pProfiltiefe;
        this.jahreszeit = pJahreszeit;
    }

    public double getDurchmesser() {
        return durchmesser;
    }

    public double getProfiltiefe() {
        return profiltiefe;
    }

    public String getJahreszeit() {
        return jahreszeit;
    }

    public void gibInfo(){
        System.out.println("Reifen{" +
                "durchmesser=" + durchmesser +
                ", profiltiefe=" + profiltiefe +
                ", jahreszeit='" + jahreszeit + '\'' +
                '}');
    }

}
