package PR1.KA4.A03_Vererbung;

public class Azubi {
    private double gehalt;
    private String vorname;
    private String name;
    private String ausbildungsBez;
    private int jahr;


    public void gehaltErhöhen(double betrag){
        this.gehalt += betrag;
    }



    public double getGehalt() {
        return gehalt;
    }

    public void setGehalt(double gehalt) {
        this.gehalt = gehalt;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAusbildungsBez() {
        return ausbildungsBez;
    }

    public void setAusbildungsBez(String ausbildungsBez) {
        this.ausbildungsBez = ausbildungsBez;
    }

    public int getJahr() {
        return jahr;
    }

    public void setJahr(int jahr) {
        this.jahr = jahr;
    }


}
