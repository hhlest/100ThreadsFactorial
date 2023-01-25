
public class FactorialThread implements Runnable {

    public FactorialThread() {
    }

    public int factorial(int n) {
        if (n < 1)
            return 1;
        else
            return n * factorial(n - 1);
    }

    @Override
    public void run() {
        Thread th = Thread.currentThread();
        try {
            String output = th.getName() + "!" + " = ";
            System.out.println(output + factorial(Integer.parseInt(th.getName())));
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread-" + th.getName() + " stopped.");
    }
}
