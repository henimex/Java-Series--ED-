package hendev.threadingUsage;

public class Main {
    public static void main(String[] args) {
      System.out.println("Threading Usage");

        StopwatchThread thread1 = new StopwatchThread("Core 1");
        StopwatchThread thread2 = new StopwatchThread("Core 2");
        StopwatchThread thread3 = new StopwatchThread("Core 3");

        thread1.trigger();
        thread2.trigger();
        thread3.trigger();
    }
}
