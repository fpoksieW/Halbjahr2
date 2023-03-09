package PR1.KA4und5.A12_InterfaceA1;

import java.util.Vector;

public class Vermittler {

    Vector <Vermittler> MeineVermittlerObj = new Vector <Vermittler>();

    @Override
    public void anmelden(NachrichtenEmpfaenger empfaenger) {
        //neue Zuhörer werden in die Liste aufgenommen
        MeineVermittlerObj.add(empfaenger);
    }

    public void abmelden(NachrichtenEmpfaenger empfaenger) {
        //Zuhörer werden aus der Liste entfernt
        MeineVermittlerObj.remove(empfaenger);
    }

    @Override
    public void empfangeNachricht(String nachricht) {
        //alle Zuhörer werden benachrichtigt
        System.out.println("_____Vermittler empfaengt Nachricht und sendet sie weiter_____");
        sendeNachricht(nachricht);
    }

    @Override
    public void sendeNachricht(String nachricht) {
        //alle Zuhörer werden benachrichtigt
        for (int i = 0; i < MeineVermittlerObj.size(); i++) {
            MeineVermittlerObj.get(i).empfangeNachricht(nachricht);
        }
    }


}
