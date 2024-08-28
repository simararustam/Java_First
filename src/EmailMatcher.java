import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailMatcher {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your email: ");
        String mail = input.next();

        String pattern = "^[a-zA-Z]+@[\\w.]+\\[a-zA-Z]{2,6}$";

        Pattern compiledPattern = Pattern.compile(pattern);
        Matcher matcher = compiledPattern.matcher(mail);

        if (matcher.matches()) {
            System.out.println("Valid email adress");
        } else {
            System.out.println("Invalid email adress");
        }
    }
}

//duzgun islemir
