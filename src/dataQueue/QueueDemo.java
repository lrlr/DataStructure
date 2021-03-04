package dataQueue;

/**
 * Created by 63024 on 2018/11/1.
 */
public class QueueDemo {
    public static void main(String[] args) {
//        ArrayQueue<Integer> arrayQueue=new ArrayQueue<>(10);
//        for (int i=0;i<10;i++){
//            arrayQueue.enqueue(i);
//            System.out.println(arrayQueue.toString());
//        }
//    arrayQueue.dequeue();
//        System.out.println(arrayQueue.toString());

        LookQueue<Integer> lookQueue=new LookQueue();
        lookQueue.enqueue(1);
        lookQueue.enqueue(2);
        lookQueue.enqueue(3);
        lookQueue.enqueue(4);
        lookQueue.enqueue(5);
        lookQueue.enqueue(6);
        lookQueue.enqueue(7);
        lookQueue.dequeue();
        lookQueue.enqueue(8);
        lookQueue.enqueue(1);
        lookQueue.enqueue(2);
        lookQueue.enqueue(3);
        lookQueue.dequeue();
        lookQueue.enqueue(4);
        lookQueue.enqueue(5);
        lookQueue.enqueue(6);
        lookQueue.enqueue(7);
        lookQueue.enqueue(8);
        lookQueue.dequeue();
        System.out.println(lookQueue.toString());
    }
}
