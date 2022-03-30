package neu.edu;

public class Consumer implements Runnable{
    private ThreadSafeQueue products;
    private int count;

    public Consumer(ThreadSafeQueue products, int count) {
        this.products = products;
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 1; i <= count; i++) {
            try {
                String product = (String) products.remove();
                System.out.println("Consumed " + product);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
