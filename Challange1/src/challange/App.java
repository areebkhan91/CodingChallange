package challange;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class App {

    static BlockingQueue<Integer> queue = new LinkedBlockingQueue <>();
    static BlockingQueue<Result> results=new LinkedBlockingQueue <>();

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(new Runnable() {
            public void run() {
            	Randomizer r = new Randomizer();
                try {
                    r.fillRandom();

                } catch (InterruptedException ignored) {}
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
            	Prime p = new Prime();
                try {
                    p.print();
                } catch (InterruptedException ignored) {}
            }
        });
        t1.start();
        t2.start();
//        t1.join();
//        t2.join();

        // Quit automatically after 3 seconds
        Thread.sleep(3000);
        System.exit(0);
    
    }
}