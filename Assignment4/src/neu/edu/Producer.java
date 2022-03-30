package neu.edu;

import java.util.Random;

public class Producer implements Runnable {
    private ThreadSafeQueue products;
    private int count;

    public Producer(ThreadSafeQueue products, int count) {
        this.products = products;
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 1; i <= count; i++) {
            try {
                String product = Thread.currentThread().getName() + " " + i + " product";
                products.add(product);
                System.out.println("Produced " + product);
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
