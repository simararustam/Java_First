public class Fibonacci {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;
        int next = first + second;

        System.out.println(first);
        System.out.println(second);

        while (next <= 30) {
            System.out.println(next);
            first = second;
            second = next;
            next = first + second;
        }
    }
}
