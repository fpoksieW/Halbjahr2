package PR1.KA4.A07_Schulverwaltungssoftware;

public class Schueler extends Menschen{

    private int klassenstufe;
    private double jahresBeitrag;
    private int jahresBeitragFaktor = 5;


    public Schueler(String name, int alter, int klassenstufe) {
        super(name, alter);
        this.klassenstufe = klassenstufe;
        this.jahresBeitrag = jahresBeitragBerechnung();
    }

    public double jahresBeitragBerechnung() {
        this.jahresBeitrag = (double)this.alter/(double)this.klassenstufe*jahresBeitragFaktor;
        return this.jahresBeitrag;
    }


    public int getKlassenstufe() {
        return klassenstufe;
    }

    public void setKlassenstufe(int klassenstufe) {
        this.klassenstufe = klassenstufe;
    }

    public double getJahresBeitrag() {
        return jahresBeitrag;
    }

    public void setJahresBeitrag(double jahresBeitrag) {
        this.jahresBeitrag = jahresBeitrag;
    }

    public int getJahresBeitragFaktor() {
        return jahresBeitragFaktor;
    }

    public void setJahresBeitragFaktor(int jahresBeitragFaktor) {
        this.jahresBeitragFaktor = jahresBeitragFaktor;
    }
}
