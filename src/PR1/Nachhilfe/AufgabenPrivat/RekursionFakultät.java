package PR1.Nachhilfe.AufgabenPrivat;

public class RekursionFakultät {

        public static void main(String[] args) {

            System.out.println(fakultaet(3));
        }

        public static int fakultaet(int n){
            if(n==1){
                return 1;
            }else{
                return n*fakultaet(n-1);
            }
        }
}
