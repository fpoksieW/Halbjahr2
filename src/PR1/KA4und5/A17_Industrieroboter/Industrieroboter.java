package PR1.KA4und5.A17_Industrieroboter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Industrieroboter {

    private final int maxAnzahlWerkzeuge = 10;
    ArrayList<Werkzeug> werkzeuge = new ArrayList<Werkzeug>();

    public Industrieroboter() {
        for (int i = 0; i < maxAnzahlWerkzeuge; i++) {
            werkzeuge.add(null);
        }
    }


    public boolean werkzeugHinzufuegen(int platz, Werkzeug neuWerkzeug) {
        if (platz >= 0 && platz < maxAnzahlWerkzeuge && werkzeuge.get(platz) == null) {
            werkzeuge.add(platz, neuWerkzeug);
            return true;
        }
        return false;
    }

    public boolean werkzeugEntfernen(int platz) {
        if (platz >= 0 && platz < maxAnzahlWerkzeuge && werkzeuge.get(platz) != null) {
            werkzeuge.remove(platz);
            return true;
        }
        return false;
    }
}
