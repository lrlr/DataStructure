package dataStack;

/**
 * Created by 63024 on 2018/10/23.
 */
public class StackDemo1 {
    public static void main(String[] args) {
      StackArray<Integer> stackArray=new StackArray();
      stackArray.push(1);
      stackArray.push(2);
        System.out.println(stackArray.toString());
        stackArray.pop();
        System.out.println(stackArray.toString());
    }
}
