package PR1.KA4und5.A01_Motorrad;

public class Motorrad {

    private Reifen[] meineReifen = new Reifen[2];
    private Motor meinMotor;


    public Motorrad(Reifen pVorne, Reifen pHinten, Motor pMotor) {
        this.meineReifen[0]= pVorne;
        this.meineReifen[1]= pHinten;
        this.meinMotor = pMotor;
    }

    public Reifen getVorderReifen() {
        return this.meineReifen[0]; //ist der Vorderreifen
    }

    public Reifen getHinterReifen() {
        return this.meineReifen[1]; //ist der Hinterreifen
    }

    public Motor getMeinMotor() {
        return meinMotor;
    }

    public void getInfo(){

        System.out.println("Motor: ");
        this.meinMotor.gibInfo();
        System.out.println("\nReifen vorne: ");
        this.getVorderReifen().gibInfo();
        System.out.println("Reifen hinten: ");
        this.getHinterReifen().gibInfo();
    }


}
