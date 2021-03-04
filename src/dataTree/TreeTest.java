package dataTree;

/**
 * @author lirui
 * @ClassName:
 * @Description:
 * @date 2019/7/4 14:15
 */
public class TreeTest<E extends Comparable<E>>{

    class Node{
        private Node left;
        private Node right;
        public E e;

        public Node(E e){
            this.left=null;
            this.right=null;
            this.e=e;
        }
    }

    private Node root;
    private int size;
    public TreeTest(){
        root=null;
        size=0;
    }

    public void add(E e){
       root= add(root,e);
    }
    private Node add(Node node,E e){
        if (node==null){
            return new Node(e);
        }
       if (e.compareTo(node.e)<0){
          node.left=add(node.left,e);
       }else if (e.compareTo(node.e)>0){
           node.right=add(node.right,e);
       }
       return node;
    }

    public void preOrder(){

    }
    //前序遍历
    private void preOrder(Node node){
        if (node==null){
            return;
        }
        System.out.println(node.e);
        preOrder(node.left);
        preOrder(node.right);
    }
    //中序遍历
    private void midOrder(Node node){
        if (node==null){
            return;
        }
        preOrder(node.left);
        System.out.println(node.e);
        preOrder(node.right);
    }

    private void afterOrder(Node node){
        if (node==null){
            return;
        }
        preOrder(node.left);
        preOrder(node.right);
        System.out.println(node.e);
    }
}
