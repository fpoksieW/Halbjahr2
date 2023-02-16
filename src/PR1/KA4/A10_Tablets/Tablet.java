package PR1.KA4.A10_Tablets;

public class Tablet {
    private String modellBezeichnung;
    private double groesse;

    public Tablet(String modellBezeichnung, double groesse) {
        this.modellBezeichnung = modellBezeichnung;
        this.groesse = groesse;
    }

    public String getModellBezeichnung() {
        return modellBezeichnung;
    }
}
