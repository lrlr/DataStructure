package HashTable;

import java.util.Map;
import java.util.TreeMap;

public class HashTable<K, V> {

    private static final int upperTol = 10;//哈希冲突向上阀值
    private static final int lowerTol = 2;//哈希冲突向下阀值
    private static final int initCapacity = 7;//初始数组容量

    private TreeMap<K, V>[] hashtable;
    private int size;
    private int M;

    public HashTable(int M) {
        this.M = M;
        size = 0;
        hashtable = new TreeMap[M];
        for (int i = 0; i < M; i++)
            hashtable[i] = new TreeMap<>();
    }


    public HashTable() {
        this(initCapacity);
    }

    //设置哈希值
    private int hash(K key) {
        return (key.hashCode() & 0x7fffffff) % M;
    }

    public int getSize() {
        return size;
    }

    //添加元素
    public void add(K key, V value) {
        TreeMap<K, V> map = hashtable[hash(key)];
        if (map.containsKey(key))
            map.put(key, value);
        else {
            map.put(key, value);
            size++;
            //数组扩容，当元素大于哈希冲突向上阀值与数组容量乘积时，进行扩容
            if (size >= upperTol * M)

                resize(2 * M);
        }
    }

    //删除元素
    public V remove(K key) {
        V ret = null;
        TreeMap<K, V> map = hashtable[hash(key)];
        if (map.containsKey(key)) {
            ret = map.remove(key);
            size--;
            //数组缩容
            if (size <= lowerTol * M && M > initCapacity)
                resize(M / 2);
        }
        return ret;
    }

    //修改value
    public void set(K key, V value) {
        TreeMap<K, V> map = hashtable[hash(key)];
        if (!map.containsKey(key))
            throw new IllegalArgumentException(key + " doesn't exist!");

        map.put(key, value);
    }

    //判断该位置是否有值
    public boolean contains(K key) {
        return hashtable[hash(key)].containsKey(key);
    }

    //获取该位置元素
    public V get(K key) {
        return hashtable[hash(key)].get(key);
    }

    //数组大小调整
    private void resize(int newM) {
        TreeMap<K, V>[] newHashTable = new TreeMap[newM];
        for (int i = 0; i < newM; i++)
            newHashTable[i] = new TreeMap<>();

        for (int i = 0; i < M; i++)
            for (K key : hashtable[i].keySet())
                newHashTable[hash(key)].put(key, hashtable[i].get(key));

        this.M = newM;
        this.hashtable = newHashTable;
    }
}
