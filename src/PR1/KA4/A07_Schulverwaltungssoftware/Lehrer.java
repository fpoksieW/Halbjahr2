package PR1.KA4.A07_Schulverwaltungssoftware;

public class Lehrer extends Menschen{
    protected String fach;

    public Lehrer(String name, int alter, String fach) {
        super(name, alter);
        this.fach = fach;
    }
}
