public class ThreadSleep {
    public static void main(String[] args) {
        Thread T= new Thread(new Runnable() {
            public void run()
            {
                Thread.sleep(10);
            }
        });
        T.setName("Test Thread");
  
        // Start the thread
        T.start();
    }
}
