import java.time.Duration;

public class MultiThread extends Thread{
    public void run() {
        for (int i = 1; i < 100; i += 2) {
            System.out.println(i);

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
