package dataArray;

/**
 * Created by 63024 on 2018/10/29.
 */
public class Array<E> {
    private E[] arr;//数组
    private int size;//数组有效元素长度

    public Array(int capySize) {
        arr = (E[]) new Object[capySize];
        size = 0;
    }

    //获得有效长度
    public int getSize() {
        return size;
    }

    //设置默认数组大小
    public Array() {
        this(10);
    }

    //数组是否为空
    public boolean isEmpty() {
        return size == 0;
    }

    //添加元素
    public void addLast(E e) {
        add(size, e);
//        if (arr.length==size){
//            throw new IllegalArgumentException("数组大小不够，无法添加新的元素");
//        }
//        arr[index]=e;
//        size++;
    }

    //在指定位置插入元素
    public void add(int index, E e) {
        if (index < 0 || index >size) {
            throw new IllegalArgumentException("数组越界");
        }
        if (arr.length == size) {
            //扩容两倍
            resize(arr.length * 2);
        }
        for (int i = size - 1; i >= index; i--) {
            arr[i + 1] = arr[i];
        }
        arr[index] = e;
        size++;
    }

    //获取指定元素
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("数组越界");
        }
        return arr[index];
    }
    //获取最后一个元素
    public E getLast() {
        return get(size-1);
    }
    //获取第一个元素
    public E getFirst() {
        return get(0);
    }
    //修改指定元素
    public void set(int index, E e) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("数组越界");
        }
        arr[index] = e;
    }

    //删除第一个
    public E removeFirst() {
        E flag = remove(0);
        return flag;
    }

    //删除最后一个
    public E removeLast() {
        E flag = remove(size - 1);
        return flag;
    }

    //判断是否包含某元素
    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == e) {
                return true;
            }
        }
        return false;
    }

    //获取某元素位置
    public int getAddr(E e) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == e) {
                return i;
            }
        }
        return -1;
    }

    //删除某一个指定位置的元素
    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("数组越界");
        }
        E res = arr[index];
        for (int i = index + 1; i < size; i++) {
            arr[i - 1] = arr[i];
        }
        size--;
        //如果当前数组空闲多于一倍，进行数组锁容操作，空间减小一半
        if (size == arr.length / 2 && arr.length / 2 != 0) {
            resize(arr.length / 4);
        }
        return res;
    }

    //删除某个元素
    public void removeElement(E e) {
        int flag = getAddr(e);
        if (flag != -1) {
            remove(flag);
        }
    }

    //打印元素
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i < size; i++) {
            builder.append(arr[i]);
            if (i != size - 1) {
                builder.append(",");
            }
        }
        builder.append("]");
        return builder.toString();
    }

    //数组扩容
    public void resize(int capicity) {
        E[] newarr = (E[]) new Object[capicity];
        for (int i = 0; i < size; i++) {
            newarr[i] = arr[i];
        }
        arr = newarr;
    }
}
