package dataTree;

/**
 * 二叉树实现
 *
 * @param <E>
 */
public class TwoTreeTest2<E extends Comparable<E>> {
    public static void main(String[] args) {
        TwoTreeTest2 test2 = new TwoTreeTest2();
        test2.add(8);
        test2.add(7);
        test2.add(5);
        test2.add(4);
        test2.add(10);
        test2.add(6);
        test2.add(3);
        System.out.println("-=-=-=-=-=-=前序遍历-=-=--=-=-=-=");
        test2.preOrder();
        System.out.println("-=-=-=-=-=-=中序遍历-=-=--=-=-=-=");
        test2.initOrder();
        System.out.println("-=-=-=-=-=-=后序遍历-=-=-=-=-=-=-=");
        test2.backOrder();
    }

    private Node root;
    private int size;

    public TwoTreeTest2() {
        root = null;
        size = 0;
    }

    /**
     * 添加结点
     *
     * @param e
     */
    public void add(E e) {
        root = add(root, e);
    }

    /**
     * 前序遍历，先访问根节点，再访问左子树，然后再访问右子树
     */
    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.e);
        preOrder(node.left);
        preOrder(node.right);
    }

    /**
     * 先遍历左子树，然后访问根结点，最后遍历右子树
     */
    public void initOrder() {
        initOrder(root);
    }

    private void initOrder(Node node) {
        if (node == null) {
            return;
        }
        initOrder(node.left);
        System.out.println(node.e);
        initOrder(node.right);
    }

    /**
     * 后序遍历，从左到右先叶子后结点的方式遍历访问左右子树，最后访问根结点
     */
    public void backOrder() {
        backOrder(root);
    }

    private void backOrder(Node node) {
        if (node == null) {
            return;
        }
        backOrder(node.left);
        backOrder(node.right);
        System.out.println(node.e);
    }

    private Node add(Node node, E e) {
        if (node == null) {
            Node newNode = new Node(e);
            size++;
            return newNode;
        }
        if (node.e.compareTo(e) > 0) {
            node.left = add(node.left, e);
        } else if (node.e.compareTo(e) < 0) {
            node.right = add(node.right, e);
        }
        return node;
    }

    /**
     * 获取二叉树长度
     */
    public int getSize() {
        return size;
    }

    /**
     * 判断是否为空
     *
     * @return
     */
    public boolean getEmpty() {
        return size == 0;
    }

    /**
     * 是否包含某结点
     *
     * @param e
     * @return
     */
    public boolean contains(E e) {
        return contains(root, e);
    }

    private boolean contains(Node node, E e) {
        if (node == null) {
            return false;
        }
        if (node.e.compareTo(e) == 0) {
            return true;
        } else if (node.e.compareTo(e) > 0) {
            contains(node.left, e);
        } else if (node.e.compareTo(e) < 0) {
            contains(node.right, e);
        }
        return false;
    }

    /**
     * 查找最小的元素
     *
     * @return
     */
    public E findMin() {
        if (size == 0) {
            throw new IllegalArgumentException("BST IS NULL");
        }
        return findMin(root).e;
    }

    private Node findMin(Node node) {
        if (node.left == null) {
            return node;
        }
        return findMin(node.left);
    }

    /**
     * 查找最大元素
     */
    public E findMax() {
        if (size == 0) {
            throw new IllegalArgumentException("BST IS NULL");
        }
        return findMax(root).e;
    }

    private Node findMax(Node node) {
        if (node.right == null) {
            return node;
        }
        return findMax(node.right);
    }

    /**
     * 删除最大元素
     * @return
     */
   public E deleteMax(){
        E findMax=findMax();
        deleteMax();
        return findMax;
   }

   private Node deleteMax(Node node){
       if (node.right==null){
           node=node.left;
       }
       node.right=deleteMax(node.right);
       return node;
   }
    /**
     * 删除最小的元素
     *
     * @return
     */
    public E deleteMin() {
        E findMin = findMin();
        deleteMin(root);
        return findMin;
    }

    private Node deleteMin(Node node) {
        if (node.left == null) {
            node = node.right;
            return node;
        }
        node.left = deleteMin(node.left);
        return node;
    }

    //删除结点值都为e的结点
    public void remove(E e){
        root= remove(root,e);
    }

    private Node remove(Node node,E e){
        if (node==null){
            return null;
        }
        if (e.compareTo(node.e)<0){
            node.left=remove(node.left,e);
            return node;
        }else if (e.compareTo(node.e)>0){
            node.right=remove(node.right,e);
            return node;
        }else {
            if (node.left==null){
                Node right=node.right;
                node.right=null;
                size--;
                return right;
            }
            if (node.right==null){
                Node left=node.left;
                node.left=null;
                size--;
                return left;
            }
            //待删除结点左右子树都不为空
            //找到比待删除结点大的最小结点，即待删除结点右子树的最小结点
            // 用这个结点顶替待删除结点的位置
           Node succNode= findMin(node.right);
            succNode.right=deleteMin(node.right);
            succNode.left=node.left;
            return succNode;
        }
    }
    class Node {
        public E e;
        public Node left;
        public Node right;

        public Node(E e) {
            this.e = e;
            left = null;
            right = null;
        }
    }
}
