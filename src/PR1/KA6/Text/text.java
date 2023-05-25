package PR1.KA6.Text;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class text {
    public static void main(String[] args)
    {
        Path debug_info_path = Paths.get("C:/tmp/DEBUG", "DebugWa3.info");
        Charset charset = Charset.forName("UTF-8");
        String text = "OS Build : 18362.720";
        try (BufferedWriter writer = Files.newBufferedWriter(debug_info_path, charset,
                StandardOpenOption.APPEND)) {
            writer.write(text);
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
