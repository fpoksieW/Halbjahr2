package PR1.KA4.A05_Bundespraesident;

public class Bundespraesident extends Kunde{
    private int rabatt;

    public Bundespraesident(String name, int rabatt) {
        super(name);
        this.rabatt = rabatt;
        System.out.println("ich heiße " + name + " und erhalte überall " + rabatt + " Prozent Rabatt.");
    }
}
