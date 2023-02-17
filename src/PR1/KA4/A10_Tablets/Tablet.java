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
    public void setModellBezeichnung(String modellBezeichnung) {
        this.modellBezeichnung = modellBezeichnung;
    }
    public double getGroesse() {
        return groesse;
    }
    public void setGroesse(double groesse) {
        this.groesse = groesse;
    }
}
