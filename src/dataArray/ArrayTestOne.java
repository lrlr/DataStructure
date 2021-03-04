package dataArray;

import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;

/**
 * Created by 63024 on 2018/10/29.
 */
public class ArrayTestOne<E> {
    private E[] arr;//数组
    private int size;//数组有效元素长度



    //获得有效长度
   public ArrayTestOne(int capsize){
       arr= (E[]) new Object[capsize];
   }

    //设置默认数组大小
    public ArrayTestOne(){
       this(10);
    }

    //数组是否为空
 public boolean isEmpty(){
        return size==0;
 }
    //添加元素
   public void addLast(E e){
     add(size,e);
   }

    //在指定位置插入元素
    public void add(int index, E e) {
     if (index>size||index<0){
         throw  new IllegalArgumentException("12");
     }
     if (arr.length==size){
         resize(arr.length*2);
     }
     for (int i=size-1;i>=index;i--){
         arr[i+1]=arr[i];
     }
     arr[index]=e;
        size++;
    }

    //获取指定元素
    public E get(int index){
       if (index<0||index>=size){
           throw new IllegalArgumentException("12");
       }
       return arr[index];
    }
    //获取最后一个元素
     public E getLast(){
        return get(size-1);
     }
    //获取第一个元素
  public E getFirst(){
         return get(0);
  }
    //修改指定元素
    public void update(int index,E e){
      if (index<0||index>=size){
          throw new IllegalArgumentException("456");
      }
      arr[index]=e;
    }
    //删除第一个
    public void deleteFirst(){
        delete(0);
    }

    //删除最后一个
    public void deleteLast(){
        delete(size-1);
    }

    //判断是否包含某元素
      public boolean isExist(E e){
       for (int i=0;i<size;i++){
            if (get(i)==e){
                return true;
            }
          }
          return false;
      }

    //获取某元素位置
  public int getAddr(E e){
          for (int i=0;i<size;i++){
              if (arr[i]==e){
                  return i;
              }
          }
          return -1;
  }

    //删除某一个指定位置的元素
     public void delete(int index){
      if (index<0||index>=size){
          throw new IllegalArgumentException("123");
      }
         for (int i = index + 1; i < size; i++) {
             arr[i - 1] = arr[i];
         }
      size--;
         //如果当前数组空闲多于一倍，进行数组锁容操作，空间减小一半
         if (size == arr.length / 2 && arr.length / 2 != 0) {
             resize(arr.length / 4);
         }
     }

    //删除某个元素

    //打印元素


    //数组扩容
   public void resize(int capsize){
     E[] newarr= (E[]) new Object[capsize];
       for (int i=0;i<arr.length;i++){
           newarr[i]=arr[i];
       }
       arr=newarr;
   }
}
