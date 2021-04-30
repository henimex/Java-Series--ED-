package hendev.threadingUsage;

public class StopwatchThread implements Runnable {

    private Thread thread;
    private String threadName;

    //Almost Standard
    public StopwatchThread(String threadName) {
        this.threadName = threadName;
        System.out.println("Creating T \t: " + threadName);
    }

    //Your Logic
    @Override
    public void run() {
        System.out.println("Running T \t: " + threadName);

        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(threadName + " : " + i);
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("Broke Thread : " + threadName);
            e.printStackTrace();
        }
        System.out.println("Thread Ended : " + threadName);
    }

    //Standard
    public void trigger(){
        System.out.println("Thread Object Triggered");
        if (thread == null){
            thread = new Thread(this,threadName);
            thread.start();
        }
    }
}
