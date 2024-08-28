public class Main {
    public static void main(String[] args) {
        MultiThread multi = new MultiThread();
        Multi2 multi2 = new Multi2();

        multi.start();

        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        multi2.start();
    }
}