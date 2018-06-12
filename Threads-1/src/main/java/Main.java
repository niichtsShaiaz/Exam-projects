
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mathias
 */
public class Main {
    static public volatile boolean empty = false;
    public static void main(String[] args) {
        start(4);
        
        
    }

    private static void start(int n) {
        try {
        ArrayBlockingQueue<Long> SP1 = new ArrayBlockingQueue(40);
        ArrayBlockingQueue<Long> SP2 = new ArrayBlockingQueue(40);
        SP1.add(4L);
        SP1.add(5L);
        SP1.add(8L);
        SP1.add(12L);
        SP1.add(21L);
        SP1.add(22L);
        SP1.add(34L);
        SP1.add(35L);
        SP1.add(36L);
        SP1.add(37L);
        SP1.add(42L);
        ExecutorService executor = Executors.newFixedThreadPool(n);
        ExecutorService executor2 = Executors.newFixedThreadPool(1);
        Producer producer = new Producer(SP1, SP2);
        Consumer consumer = new Consumer(SP2);
        executor.execute(producer);
        
        //Thread.sleep(2000);
            while (!empty) {                
                
            }
        executor2.execute(consumer);
        
        
        executor.shutdown();
        executor2.shutdown();
        } catch(Exception ex){
            System.out.println("error was made");
        }
    }
    private static long fib(long n){
        if ((n == 0 || n == 1)){
            return n;
        } else {    
        return fib(n-1) + fib(n-2);
        }
    }
}
