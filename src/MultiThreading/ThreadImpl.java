package MultiThreading;

public class ThreadImpl extends Thread {

    public void run(){
        for(int i = 1; i <= 10; i++){
            System.out.println("i :" + i);
        }
    }

    public static void main(String[] args) {
        ThreadImpl t1 = new ThreadImpl();
        t1.start();
    }
}
