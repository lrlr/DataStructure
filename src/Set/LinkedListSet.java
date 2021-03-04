package Set;

/**
 * Created by lirui on 2018/12/4.
 */
public class LinkedListSet<E extends  Comparable<E>> implements Set<E> {

    private LinkedList linkedList;
    public LinkedListSet(){
        linkedList=new LinkedList();
    }
    @Override
    //添加元素，元素不能重复
    public void add(E e) {
        //判断元素是否已经存在
        if (!contains(e)){
            linkedList.addFirst(e);
        }
    }

    @Override
    //删除元素
    public void remove(E e) {
       linkedList.removeElement(e);
    }

    @Override
    //判断是否包含某元素
    public boolean contains(E e) {
        return linkedList.contains(e);
    }
    //判断集合元素是否为空
    @Override
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }
    //获取集合元素个数
    @Override
    public int getSize() {
        return linkedList.getSize();
    }
}
