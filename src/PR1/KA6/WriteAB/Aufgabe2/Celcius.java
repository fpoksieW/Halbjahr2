package PR1.KA6.WriteAB.Aufgabe2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Celcius {

    //erstellen einer textdatei die im ordner H:\PR1\text\Demo_together-20230525\ gespeichert wird
    private static String speicherort = "H:\\PR1\\text\\Demo_together-20230525\\Aufgabe2.txt";
    static String filename = "H:\\PR1\\text\\Demo_together-20230525\\gradcelcius.txt";


    public static void main(String[] args) throws IOException {
        Charset charset = Charset.forName("UTF-8");
        BufferedWriter writer = null;
        BufferedReader reader = null;
        String [] datenArray = null;
        int arraylength = 0;
        String trennzeichen = "\t";
        String line;

        try {
            reader = Files.newBufferedReader(Path.of(filename));

            // Get the file
            File f = new File(speicherort);

            // Create new file
            // Check if it does not exist
            if (f.createNewFile())
                System.out.println("File created");
            else
                System.out.println("File already exists");


            //array füllen
            while((line = reader.readLine()) != null) {
                arraylength++;
            }
            reader.reset();
            datenArray = new String[arraylength];

            StringBuilder sb = new StringBuilder();
            sb.append("Grad in Celcius\t Grad in Kelvin\n");
            sb.append("-----------------------------\n");

            for (int i = 0; i < datenArray.length; i++) {
                datenArray[i] = reader.readLine();
                sb.append(datenArray[i]);
                sb.append(" °C\t\t\t");
                double kelvin = Double.parseDouble(datenArray[i]) + 273.15;
                sb.append(kelvin);
                sb.append(" K\n");
            }

            String ausgabe = sb.toString();

            //buffered Writer
            writer = Files.newBufferedWriter(Path.of(speicherort), charset, StandardOpenOption.WRITE);
            writer.write(ausgabe);

            System.out.println("***********************************");



        } catch (NoSuchFileException nsfe) {
            System.out.println(nsfe.getMessage());

        } catch (IOException ioe) {
            //System.out.println(ioe.getMessage());

        } catch (Exception e) {

        } finally {
        }
        if (reader != null)
            reader.close();
            writer.close();
    }
}
