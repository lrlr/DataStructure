package Map;

/**
 * Created by lirui on 2018/12/5.
 */
public interface Map<K,V>{
    int getSize();
    boolean isEmpty();
    void add(K k,V v);
    V remove(K k);
    boolean contains(K k);
    V get(K k);
    void set(K k,V v);
}
