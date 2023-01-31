package PR1.KA4.A02_Rekursion;

public class Spieler {

    private String vorname;
    private String name;
    private int nummer;

    public Spieler(String vorname, String name, int nummer) {
        this.vorname = vorname;
        this.name = name;
        this.nummer = nummer;
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

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }


}
