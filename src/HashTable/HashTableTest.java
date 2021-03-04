package HashTable;

import java.util.TreeMap;

/**
 * Created by lirui on 2019/1/3.
 */
public class HashTableTest<K,V> {
    private static final int upperTol = 10;
    private static final int lowerTol = 2;
    private static final int initCapacity = 7;
    private TreeMap<K,V>[] hashtable;
    private int size;
    private int M;
    public HashTableTest(int M){
        this.M=M;
        size=0;
        hashtable=new TreeMap[M];
    }
    public HashTableTest(){
        this(initCapacity);
    }
    public int getSize(){
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }
    private int hash(K key){
     return (key.hashCode() & 0x7fffffff) % M;
    }
public void add(K k,V v){
      TreeMap<K,V> treeMap=hashtable[hash(k)];
      if (treeMap.containsKey(k)){
          treeMap.put(k,v);
      }else{
          treeMap.put(k,v);
          size++;
          if (size>=upperTol*M){
              resize(M*2);
          }
      }

}
public V remove(K k){
    TreeMap<K,V> treeMap=hashtable[hash(k)];
    V ret=null;
    if (treeMap.containsKey(k)){
       ret= treeMap.remove(k);
       size--;
        if(size <= lowerTol * M && M > initCapacity)
            resize(M / 2);
    }
    return ret;
}

public void set(K k,V v){
    TreeMap<K,V> treeMap=hashtable[hash(k)];
    if (treeMap.containsKey(k)){
        treeMap.put(k,v);
    }else{
        throw new IllegalArgumentException("not exist");
    }
}
public boolean contains(K k){
    return hashtable[hash(k)].containsKey(k);
}
public V get(K k){
    return hashtable[hash(k)].get(k);
}

private void resize(int newM){
    int oldM=M;
    M=newM;
    TreeMap<K,V>[] treeMaps=new TreeMap[newM];
    for (int i=0;i<oldM;i++){
        for (K key:hashtable[i].keySet()){
            treeMaps[hash(key)].put(key,hashtable[i].get(key));
        }
    }
    this.hashtable=treeMaps;
}
}
