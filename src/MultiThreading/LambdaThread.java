package MultiThreading;
public class LambdaThread {

    public static void main(String[] args) {

        Runnable r = () -> {
            System.out.println("Lambda DEMO Thread");
        };

        Thread t = new Thread(r);
        t.start();

        Runnable t1 = new Runnable() {

            @Override
            public void run() {
                System.out.println("Anonymous class Thread");
            }
        };

        Thread t2 = new Thread(t1);
        t2.start();

         Thread t3 = new Thread(() -> System.out.println("New Thread"));
         t3.start();

        Thread anonymous = new Thread() {
            @Override
            public void run(){
                System.out.println("Hello from anonymous thread run method.");
            }
        };
        anonymous.start();
    }
}
