package PR1.Nachhilfe.AufgabenPrivat;

import java.util.Scanner;

public class RekursionFakultät {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int f = sc.nextInt();
            System.out.println(fakultaet(f));
            sc.close();
        }

        public static int fakultaet(int n){
            int erg = 0;
            if(n==1){
                erg = 1;
            }else{
                erg = n*fakultaet(n-1);
            }
            return erg;
        }
}
