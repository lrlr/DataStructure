package dataQueue;

/**
 * Created by 63024 on 2018/11/2.
 * 循环队列
 */
public class LookQueue<E> implements Queue<E> {
    private E[] e;
    private int front, tail;
    private int size;

    public LookQueue(int capisity) {
        e = (E[]) new Object[capisity + 1];
    }

    public LookQueue() {
        this(10);
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return tail == front;
    }

    public int getCapisity() {
        return e.length - 1;
    }

    @Override
    public void enqueue(E o) {
        if ((tail + 1) % e.length == front) {
            resize(getCapisity() * 2);
        }
        e[tail] = o;
        tail = (tail + 1) % e.length;
        size++;
    }

    @Override
    public E dequeue() {
        if (isEmpty()) {
            throw new IllegalArgumentException("队列已经为空，无法继续删除");
        }
        e[front] = null;
        front = (front + 1) % e.length;
        size--;
        if (size % getCapisity() / 4 == 0 && size % getCapisity() / 2 != 0) {
            resize(getCapisity() / 2);
        }
        return null;
    }

    public E getFront() {
        if (isEmpty()) {
            throw new IllegalArgumentException("队列已经为空");
        }
        return e[front];
    }


    public void resize(int newcapistity) {
        E[] newarr = (E[]) new Object[newcapistity + 1];
        for (int i = 0; i < size; i++) {
            newarr[i] = e[(i + front) % e.length];
        }
        e = newarr;
        front = 0;
        tail = size;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("front[");
        for (int i = front; i != tail; i = (i + 1) % e.length) {
            sb.append(e[i]);
            if ((i + 1) % e.length != tail)
                sb.append(", ");
        }
        sb.append("] tail");
        return sb.toString();
    }
}
