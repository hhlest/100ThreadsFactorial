import java.math.BigInteger;

public class FactorialThread implements Runnable {

    public FactorialThread() {
    }

    public BigInteger factorial(BigInteger n) {
        if (n.compareTo(BigInteger.valueOf(1)) < 0)
            return BigInteger.valueOf(1);
        else
            return n.multiply(factorial(n.subtract(BigInteger.valueOf(1))));
    }

    @Override
    public void run() {
        Thread th = Thread.currentThread();
        try {
            String output = th.getName() + "!" + " = ";
            System.out.println(output + factorial(BigInteger.valueOf(Long.parseLong(th.getName()))));
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread-" + th.getName() + " stopped.");
    }
}
