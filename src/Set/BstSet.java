package Set;

/**
 * Created by lirui on 2018/12/4.
 */
public class BstSet<E extends Comparable<E>> implements Set<E> {
    private TwoTree twoTree;
    public BstSet(){
        twoTree=new TwoTree();
    }
    @Override
    public void add(E e) {
     twoTree.add(e);
    }

    @Override
    public void remove(E e) {
    twoTree.remove(e);
    }

    @Override
    public boolean contains(E e) {
        return twoTree.contains(e);
    }

    @Override
    public boolean isEmpty() {
        return twoTree.isEmpty();
    }

    @Override
    public int getSize() {
        return twoTree.getSize();
    }
}
