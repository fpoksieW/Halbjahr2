package PR1.KA4und5.A15_Generics;

import java.util.List;
import java.util.Vector;

public class MAddierer {
    public static void main(String[] args) {
        Integer zahl1 = 100;
        String name = "eins";
        List<Integer> myList = new Vector<Integer>();

        myList.add(zahl1);
        myList.add(10);
        myList.add(15);
        //myList.add(name);

        //Addition aller Werte in der Liste
        int summe = 0;

        /*for (int i = 0; i < myList.size(); i++) {
            Object o = myList.get(i);
            if (o instanceof Integer) {
                Integer i1 = (Integer) o;
                summe += i1;
            }
        }*/
        for (Object o : myList) {
            summe += ((Integer)o).intValue();
        }
        System.out.println("Summe: " + summe);

    }

    private static int addiere(List myList) {
        int result = 0;
        for (Object timoobject : myList) {
            if (timoobject instanceof Integer) {
                Integer i1 = (Integer) timoobject;
                result += i1;
            } else {
                throw new ClassCastException("Falscher Datentyp in der Liste");
            }
        }
        return result;
    }
}
