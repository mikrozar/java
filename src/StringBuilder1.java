import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringBuilder1 {

    public static void main(String[] args) {
        StringBuilder globa = generatorString();
        finding(globa);
    }

    static StringBuilder generatorString() {
        StringBuilder c = new StringBuilder();
        Pattern pattern = Pattern.compile("(\\d{3})(\\d{4})");
        for (int j = 1000000; j < 9999999; j++) {
            Matcher matcher = pattern.matcher(Integer.toString(j));
            if (matcher.find()) {
                c = c.append("7(926)").append(matcher.group(1)).append("-").append(matcher.group(2)).append(";");
            }
            j += 1;
        }
        return c;
        //branch1
    }

    static void finding(StringBuilder stroka) {
        StringBuilder c = new StringBuilder();
        Pattern pattern = Pattern.compile("(..........777)");
        Matcher matcher = pattern.matcher(stroka);
        while (matcher.find()) {
            c = c.append(matcher.group(1)).append("; ");
        }
        System.out.println(c);
    }

}
