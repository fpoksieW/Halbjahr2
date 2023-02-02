package PR1.KA4.A03_Vererbung;

public class Mitarbeiter {


    private double gehalt;
    private String vorname;
    private String name;

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





}
