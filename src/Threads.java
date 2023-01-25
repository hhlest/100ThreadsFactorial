
public class Threads {

    public static void start(Thread[] t) {
        for (int i = 0; i < t.length; i++) {
            t[i] = new Thread(new FactorialThread());
            t[i].setName(String.valueOf(i));
        }

        for (int i = 0; i < t.length; i++) {
            t[i].start();
        }
    }
}
