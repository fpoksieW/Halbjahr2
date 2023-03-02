package PR1.KA4und5.A11_Kaffeemaschine;

public class AbfallBehaelter extends Behaelter{
    public String toString() {
        return "Die Fuellmenge ist: " + this.fuellstand;
    }

    public void fuell(double kaffeeMenge){
        this.fuellstand += kaffeeMenge;
    }

}
