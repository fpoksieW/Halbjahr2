package PR1.KA4und5.A07_Schulverwaltungssoftware;

public class Tester {
    public static void main(String[] args) {

        Menschen nesim = new Menschen("Nesim", 22);
        Schueler timo = new Schueler("timo", 18, 8);
        Lehrer welli = new Lehrer("Wellstein", 40, "PR1");


        System.out.println(timo.getJahresBeitrag());
    }
}
