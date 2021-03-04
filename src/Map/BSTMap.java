package Map;

/**
 * Created by lirui on 2018/12/6.
 */
public class BSTMap<K extends Comparable<K>, V> implements Map<K, V> {

    private Node root;
    private int size;

    public BSTMap(K k, V v) {
        root = new Node(k, v);
        size = 0;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }


    public void add(K k, V v) {
        root = add(root, k, v);
    }

    private Node add(Node node, K k, V v) {
        if (node == null) {
            size++;
            return new Node(k, v);
        }
        if (k.compareTo(node.k) < 0) {
            node.left = add(node.left, k, v);
        } else if (k.compareTo(node.k) > 0) {
            node.right = add(node.right, k, v);
        } else {
            node.v = v;
        }
        return node;
    }

    @Override
    public V remove(K k) {
        Node node = getNode(root, k);
        if (node != null) {
            root = remove(root, k);
            return node.v;
        }
        return null;
    }

    private Node remove(Node node, K k) {
        if (node == null) {
            return null;
        }
        if (k.compareTo(node.k) < 0) {
            node.left = remove(node.left, k);
            return node;
        } else if (k.compareTo(node.k) > 0) {
            node.right = remove(node.right, k);
            return node;
        } else {
            if (node.left == null) {
                Node rightNode = node.right;
                size--;
                node.right = null;
                return rightNode;
            }
            if (node.right == null) {
                Node leftNode = node.left;
                node.left = null;
                size--;
                return leftNode;
            }
            Node successor = miniMum(node.right);
            successor.right = removeMin(node.right);
            successor.left = node.left;
            node.left = node.right = null;
            return successor;
        }
    }

    @Override
    public boolean contains(K k) {
        Node node = getNode(root, k);
        return node != null;
    }

    private Node getNode(Node node, K k) {
        if (node == null) {
            return null;
        }
        if (k.equals(node.k)) {
            return node;
        } else if (k.compareTo(node.k) < 0) {
            return getNode(node.left, k);
        } else {
            return getNode(node.right, k);
        }
    }

    @Override
    public V get(K k) {
        Node node = getNode(root, k);
        return node == null ? null : node.v;
    }

    @Override
    public void set(K k, V v) {
        Node node = getNode(root, k);
        if (node == null) {
            throw new IllegalArgumentException("k is not exist");
        }
        node.v = v;
    }

    private Node removeMin(Node node) {
        if (node.left == null) {
            Node rightNode = node.right;
            size--;
            node.right = null;
            return rightNode;
        }
        node.left = removeMin(node.left);
        return node;
    }

    private Node miniMum(Node node) {
        if (node.left == null) {
            return node;
        }
        return miniMum(node.left);
    }

    class Node {
        private Node left;
        private Node right;
        private K k;
        private V v;

        public Node(K k, V v) {
            this.k = k;
            this.v = v;
            left = null;
            right = null;
        }
    }
}
