package MultiThreading;
public class RunnableImpl implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("i : " + i);
        }
    }

    public static void main(String[] args) {
        RunnableImpl r1 = new RunnableImpl();
        Thread t2 = new Thread(r1);
        t2.start();

    }
}