
import java.util.concurrent.ArrayBlockingQueue;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mathias
 */
public class Producer implements Runnable{

    ArrayBlockingQueue<Long> queue;
    ArrayBlockingQueue<Long> queue2;

    public Producer(ArrayBlockingQueue<Long> queue, ArrayBlockingQueue<Long> queue2) {
        this.queue = queue;
        this.queue2 = queue2;
    }

    @Override
    public void run() {
        try {
            while (!queue.isEmpty()) {
                queue2.put(fib(queue.poll()));
                //System.out.println("yes");
            }
            Main.empty = true;

        } catch (InterruptedException ex) {
            System.out.println("Someting gong wongr");
        }

    }

    private long fib(long n) {
        if ((n == 0 || n == 1)) {
            return n;

        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

}
