package PR1.KA4.A10_Tablets;

import java.util.ArrayList;

public class Schueler {

    private Tablet seinTablet;
    private ArrayList<Tablet> meineTablets = new ArrayList<Tablet>();


    public Tablet getSeinTablet() {
        return seinTablet;
    }

    public void setSeinTablet(Tablet seinTablet) {
        this.seinTablet = seinTablet;
    }
}
