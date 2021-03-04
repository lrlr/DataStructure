package dataArray;

/**
 * Created by 63024 on 2018/11/5.
 */
public class ArrayTest<E> {
    //数组
    private E[] arr;
    //数组有效长度
    private int size;
    public ArrayTest(){
        arr=(E[])new Object[10];
    }
    public ArrayTest(int capisity){
        arr=(E[])new Object[capisity];
    }
    //获得有效数组长度
    public int getSize(){
        return size;
    }
    //判断数组是否为空
    public boolean isEmpty(){
        return size==0;
    }
    //添加元素
    public void addLast(E e){
        add(size,e);
    }
    //在指定位置插入
    public void add(int index,E e){
        if (index<0||index>size){
            throw new IllegalArgumentException("sa");
        }
        if (size==arr.length){
            resize(arr.length/4);
        }
        for (int i=size-1;i>=index;i--){
            arr[i+1]=arr[i];
        }
        arr[index]=e;
        size++;
    };
    //获取指定元素
    public E get(int index){
        if (index<0||index>=size){
            throw new IllegalArgumentException("sa");
        }
        return arr[index];
    }
    //获取第一个元素
    public E getFirst(){
        return arr[0];
    }
    //获取最后一个元素
    public E getLast(){
        return arr[size-1];
    }
    //修改指定元素
    public void set(int index,E e){
        if (index<0||index>=size){
            throw new IllegalArgumentException("sa");
        }
        arr[index]=e;
    }
    //删除指定位置元素
    public E delete(int index){
        if (index<0||index>size){
            throw new IllegalArgumentException("sa");
        }
      E e=  arr[index];
      for (int i=size-1;i>index;i--){
          arr[i-1]=arr[i];
      }
      size--;
        if (size==arr.length/2){
            resize(arr.length/2);
        }
        return  e;
    }
    //删除第一个元素
    public E deleteFirst(){
        E e = delete(0);
        return e;
    }
    //删除最后一个元素
    public E deleteLast(){
        E e = delete(size);
        return e;
    }
    //删除某元素
    public E deleteElement(E e){

        int index = getIndex(e);
        E s = delete(index);
        return s;
    }

    //判断是否包含某元素
    public boolean contains(E e){
        boolean ss=false;
        for (int i=0;i<size;i++){
            if (arr[i]==e){
                ss=true;
            }
        }
        return ss;
    }
    //获取某元素指定位置
    public int getIndex(E e){
        int index=0;
        for (int i=0;i<size;i++){
            if (arr[i]==e){
                index=i;
            }
        }
        return index;
    }
    //打印
    //数组扩容
    public void resize(int capisity){
       E[] arrNew=(E[])new Object[capisity];
        for (int i=0;i<size;i++){
            arrNew[i]=arr[i];
        }
        arr=arrNew;
    }
}
