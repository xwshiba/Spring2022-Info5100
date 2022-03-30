package neu.edu;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class Main {

    public static void main(String[] args) {
//        Create a class of Thread safe Queue
//
//        The methods of queue would be following:
//
//        1.  void add(T data)
//
//        2. T remove()
//
//        3. T peek()
//
//        4. boolean isEmpty()
        ThreadSafeQueue queue = new ThreadSafeQueue(2);
        int THREADS = 2;


        // This test will wait infinitely when the queue is full.
        for (int i = 0; i < THREADS; i++) {
            Producer pr = new Producer(queue, 10);
            Consumer cr = new Consumer(queue, 2);

            Thread thread1 = new Thread(pr);
            Thread thread2 = new Thread(cr);

            thread1.start();
            thread2.start();

        }
    }
}
