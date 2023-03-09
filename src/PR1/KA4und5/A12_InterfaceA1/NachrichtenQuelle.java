package PR1.KA4und5.A12_InterfaceA1;

public interface NachrichtenQuelle {


    // Interessierte können sich bei der Quelle anmelden
// (falls sie noch nicht angemeldet sind)
    public void anmelden(NachrichtenEmpfaenger empf);


    // Angemeldete können sich bei der Quelle wieder abmelden
// (falls sie angemeldet sind)
    public void abmelden(NachrichtenEmpfaenger empf);


    // neue Nachricht wird an alle angemeldeten
// Empfaenger uebergeben
// (Aufruf deren Methode empfangeNachricht)
    public void sendeNachricht(String nachricht);
}
