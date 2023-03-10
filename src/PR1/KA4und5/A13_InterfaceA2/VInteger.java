package PR1.KA4und5.A13_InterfaceA2;

public class VInteger extends Integer implements Vergleichbar {


    public VInteger(int w) {
        super(w);
    }

    @Override
    public int vergleichenMit(Vergleichbar obj) {
        return 0;
    }
}
