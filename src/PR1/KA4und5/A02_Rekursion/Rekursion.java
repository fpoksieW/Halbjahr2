package PR1.KA4und5.A02_Rekursion;

import java.util.Scanner;

public class Rekursion {

    public static void lieszeichen() {
        Scanner sc = new Scanner(System.in);
        char z;
        z= sc.nextLine().charAt(0);
        if (z != '_') {
            lieszeichen();
        }
        System.out.println(z);
        sc.close();

    }
    public static void main(String[] args) {
        //Methode lieszeichen
        System.out.println("Geben sie eine Zeile ein, solange die Zeile nicht mit _ anfängt, wird sie wiederholt ausgegeben.");
        lieszeichen();
        System.out.println("Ende der Rekursion");


    }
}
