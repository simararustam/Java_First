import java.util.Scanner;

public class Wrapper {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter integer: ");
        int num = input.nextInt();

        Integer wrappedNum = num;
        int doubledValue = wrappedNum * 2;

        System.out.print("Double of Wrapped integer: " +  doubledValue);

        input.close();
    }
}
