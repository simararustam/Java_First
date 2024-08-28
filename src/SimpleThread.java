class SimpleThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getId() + " - Count: " + i);
        }
    }


    public static void main(String args[]) {
        // Create two threads
        SimpleThread thread1 = new SimpleThread();
        SimpleThread thread2 = new SimpleThread();

        // Start the threads
        thread1.start();
        thread2.start();
    }
}
