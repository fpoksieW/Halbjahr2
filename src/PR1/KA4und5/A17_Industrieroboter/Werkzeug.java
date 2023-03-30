package PR1.KA4und5.A17_Industrieroboter;

public class Werkzeug {

    private String art;
    protected int verschleiss = 0;

    public Werkzeug(String art, int verschleiss) {
        this.art = art;
        if(verschleiss < 0) {
            this.verschleiss = 0;
        } else if (verschleiss > 100) {
            this.verschleiss = 100;
        } else {
            this.verschleiss = verschleiss;
        }
    }

}
