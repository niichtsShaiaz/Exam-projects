
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mathias
 */
public class Consumer implements Runnable{

    private long sum = 0L;
    ArrayBlockingQueue<Long> queue;

    
    public Consumer(ArrayBlockingQueue<Long> queue) {
        this.queue = queue;
    }
    
    

    @Override
    public void run() {
        try {
            while (!queue.isEmpty()) {      
                long temp = queue.peek();
                    queue.take();
                System.out.println(temp);
                sum += temp;
            }
            System.out.println("Sum: " + sum);
            
        } catch (InterruptedException ex) {
            System.out.println("He deaded");
        }
    }
    
}
