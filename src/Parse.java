import java.util.Scanner;

public class Parse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age as str: ");
        String userAge = input.next();

        int parsedAge = Integer.parseInt(userAge);

        int years = 18 - parsedAge;

        if (years > 0) System.out.println(years + " years later you will turn 18");
        else System.out.println(-years + " years before you turned to 18");
    }
}
