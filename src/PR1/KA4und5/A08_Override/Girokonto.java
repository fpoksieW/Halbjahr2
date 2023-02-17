package PR1.KA4und5.A08_Override;

public class Girokonto extends Bankkonto{

        private double gebuehr;

        public Girokonto(double kontostand, double gebuehr) {
            super(kontostand);
            this.gebuehr = gebuehr;
        }
        @Override
        public void einzahlen(double betrag) {
            kontostand += (betrag - gebuehr);
        }
        @Override
        public void abheben(double betrag) {
            kontostand -= (betrag + this.gebuehr);
        }
}
