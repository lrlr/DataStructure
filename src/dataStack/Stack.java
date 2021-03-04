package dataStack;

/**
 * Created by 63024 on 2018/10/30.
 * 栈
 */
public interface Stack<E> {
    //获取栈的有效长度
    int getSize();
    //判断是否为空
    boolean isEmpty();
    //存入元素
    void push(E e);
   //移除栈顶元素
    E pop();
    //获取栈顶元素
    E peek();
}
