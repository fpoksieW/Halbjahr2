package PR1.KA6.Text2;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;

public class Text2 {

    static String filename = "H:\\PR1\\text\\Demo_together-20230525\\daten.txt";

    public static void main(String[] args) throws IOException {
    BufferedReader reader = null;
    String [] datenArray = null;
    String trennzeichen = "\t";
    String line, ersteZeile = "", zweiteZeile = "";
    double zahl = 0.0, quadratzahl = 0.0, wurzelzahl = 0.0;
    double ergebniszahl1 = 0.0, ergebniszahl2 = 0.0, ergebniszahl3 = 0.0;

    try {
        reader = Files.newBufferedReader(Path.of(filename));

        ersteZeile = reader.readLine();
        System.out.println(ersteZeile);
        zweiteZeile = reader.readLine();
        System.out.println(zweiteZeile);

        while((line = reader.readLine()) != null) {
            System.out.println(line);
            datenArray = line.split(trennzeichen);

            zahl = Double.parseDouble(datenArray[0]);
            quadratzahl = Double.parseDouble(datenArray[1]);
            wurzelzahl = Double.parseDouble(datenArray[2].replace(",", "."));

            ergebniszahl1 += zahl;
            ergebniszahl2 += quadratzahl;
            ergebniszahl3 += wurzelzahl;
        }
        System.out.println("***********************************");
        System.out.println(ergebniszahl1 + "\t" + ergebniszahl2 + "\t" + ergebniszahl3);

    } catch (NoSuchFileException nsfe) {
        System.out.println(nsfe.getMessage());

    } catch (IOException ioe) {
        System.out.println(ioe.getMessage());

    } catch (Exception e) {

    } finally {
        }
    if (reader != null)
            reader.close();
    }
}
