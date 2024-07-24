public class Loops1 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;

        while (i != 101) {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        }
        System.out.println("1. Sum of even numbers : " + sum);

    }
}
