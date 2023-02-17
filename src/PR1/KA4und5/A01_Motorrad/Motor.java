package PR1.KA4und5.A01_Motorrad;

public class Motor {

    private int leistung;
    private double hubraum;

    public Motor(int pLeistung, double pHubraum) {
        this.leistung = pLeistung;
        this.hubraum = pHubraum;
    }
    public int getLeistung() {
        return leistung;
    }

    public double getHubraum() {
        return hubraum;
    }   //test

    public String gibInfo(){
        System.out.print("Leistung: " + this.getLeistung() + "\nHubraum: " + this.getHubraum());

        return "Leistung: " + this.getLeistung() + "\nHubraum: " + this.getHubraum();
    }
}
