package PR1.KA4und5.A10_Tablets;

import java.util.ArrayList;

public class Schueler extends Person{

    private Tablet seinTablet;

    private ArrayList<Tablet> meineTablets = new ArrayList<Tablet>();

    public Schueler(Tablet seinTablet, ArrayList<Tablet> meineTablets) {
        this.seinTablet = seinTablet;
        this.meineTablets = meineTablets;
    }

    public Tablet getTablet() {
        return seinTablet;
    }

    public void setTablet(Tablet pNeuesTablet) {
        seinTablet = pNeuesTablet;
    }

    public ArrayList<Tablet> getMeineTablets() {
        return meineTablets;
    }

    public void setMeineTablets(ArrayList<Tablet> meineTablets) {
        this.meineTablets = meineTablets;
    }
}
