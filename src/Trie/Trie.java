package Trie;

import java.util.TreeMap;

/**
 * 字典树
 * Created by lirui on 2018/12/19.
 */
public class Trie{
    private class Node {
        private boolean isWord;
        public TreeMap<Character, Node> next;

        public Node(boolean isWord) {
            this.isWord = isWord;
            next = new TreeMap<>();
        }

        public Node() {
            this(false);
        }
    }

    private Node root;
    private int size;
    public Trie(){
        root=new Node();
        size=0;
    }

    public int getSize(){
        return size;
    }
    //向Trie中添加一个新的单词数量
    public void add(String word){
        Node cur=root;
        for (int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if (cur.next.get(c)==null){
                cur.next.put(c,new Node());
            }
            cur=cur.next.get(c);
        }
        if (!cur.isWord){
            cur.isWord=true;
            size++;
        }
    }
    //查询单词是否存在
    public boolean contains(String word){
        Node cur=root;
        for (int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if (cur.next.get(c)==null){
                return false;
            }
            cur=cur.next.get(c);
        }
        return cur.isWord;
    }
}
