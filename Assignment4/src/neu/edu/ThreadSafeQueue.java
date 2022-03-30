package neu.edu;

import java.util.Iterator;

public class ThreadSafeQueue<T>{
    private Node head, tail;
    private int size;
    private int currMaxSize;
    private static final int MAX_SIZE = Integer.MAX_VALUE;

    public ThreadSafeQueue(int size){
        this.currMaxSize = size;
    }

    public synchronized boolean isEmpty() {
        return size == 0;
    }

    public synchronized boolean isFull(){
        return size == currMaxSize;
    }

    public synchronized void add (T data) throws InterruptedException {
        // when reaching the MAX_SIZE, blocking adding till there's space available.
        while (isFull()) {
            System.out.println("Queue is full, waiting...");
            wait();
        }

        // add new Node to the curr tail
        Node<T> lastNode = tail;
        tail = new Node<T>();
        tail.data = data;
        tail.next = null;


        if (size == 0) {
            head = tail;
        } else {
            lastNode.next = tail;
        }

        // update the queue size
        size += 1;
        notifyAll();
    }

    public synchronized T remove() throws InterruptedException {
        // when nothing in queue, blocking removing till there's sth to remove.
        while (isEmpty()) {
            System.out.println("Nothing in the queue, waiting...");
            wait();
        }

        // remove the head Node from the beginning of the queue
        T data = (T) head.data;
        head = head.next;

        size -= 1;
        if (size == 0) {
            tail = null;
        }
        notifyAll();
        return data;
    }

    public synchronized T peek() throws InterruptedException {
        // when nothing in queue, blocking peek till there's sth to peek.
        while (isEmpty()) {
            wait();
        }

        // return the head of the queue
        T data = (T) head.data;
        return data;
    }



}
