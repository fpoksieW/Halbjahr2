package PR1.KA6.Lamda;

public class LambdaTestDrucker{
    public static void main(String[] args) {
        Drucker p = (s, t) -> {
            t = t.toUpperCase();
            System.out.println(s + " " + t);
        };
        p.drucken("ADVler sind", "auch in Krisen ruhig und gelassen");
    }


}
