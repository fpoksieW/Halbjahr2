package PR1.KA6.WriteAB.Aufgabe3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;


public class Kopierer {
    static String filename = "H:\\PR1\\text\\Demo_together-20230525\\daten.txt";
    private static String speicherort = "H:\\PR1\\text\\Demo_together-20230525\\kopie.txt";

    public static void main(String[] args) throws IOException {

        Charset charset = Charset.forName("UTF-8");
        BufferedWriter writer = null;
        BufferedReader reader = null;
        StringBuilder sb2 = new StringBuilder();
        String line;

        try {
            reader = Files.newBufferedReader(Path.of(filename));


            int zaehler = 0;
            while((line = reader.readLine()) != null) {
                System.out.println(line);
                sb2.append(line);
                sb2.append("\n");
                zaehler++;
            }

            // Get the file
            File f = new File(speicherort);

            // Create new file
            // Check if it does not exist
            if (f.createNewFile())
                System.out.println("File created");
            else
                System.out.println("File already exists");

            String ausgabe = sb2.toString();

            //buffered Writer
            writer = Files.newBufferedWriter(Path.of(speicherort), charset, StandardOpenOption.WRITE);
            writer.write(ausgabe);

            writer.close();





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
