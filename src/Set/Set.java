package Set;

/**
 * Created by lirui on 2018/12/4.
 */
public interface Set<E> {
    //添加元素,元素去重
    void add(E e);
    //删除元素
    void  remove(E e);
    //判断是否包含某个元素
    boolean contains(E e);
    //判断是否为空
    boolean isEmpty();
    //获取长度
    int getSize();
}
