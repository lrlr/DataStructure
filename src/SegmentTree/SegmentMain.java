package SegmentTree;

/**
 * Created by lirui on 2018/12/17.
 */
public class SegmentMain {
    public static void main(String[] args) {

        Integer[] nums={1,2,3};
        SegmentTree<Integer> segTree = new SegmentTree<Integer>(nums,
                (a, b) -> a + b);
        System.out.println(segTree.toString());
    }
}
