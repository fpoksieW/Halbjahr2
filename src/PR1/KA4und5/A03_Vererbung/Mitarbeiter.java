package PR1.KA4und5.A03_Vererbung;

public class Mitarbeiter {


    protected double gehalt;
    protected String vorname;
    protected String name;


    public Mitarbeiter() {

    }
    public Mitarbeiter(double gehalt, String vorname, String name) {
        this.gehalt = gehalt;
        this.vorname = vorname;
        this.name = name;
    }




    /*public void gehaltErhöhen(double betrag){
        this.gehalt += betrag;
    }*/




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
