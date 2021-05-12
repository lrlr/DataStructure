package Map;

import java.util.ArrayList;

/**
 * Created by lirui on 2018/12/5.
 */
public class Main {
    public static void main(String[] args) {
        long timesStart=System.currentTimeMillis();
        ArrayList<String> words1 = new ArrayList<>();
        if(FileOperation.readFile("pride-and-prejudice.txt", words1)) {
            System.out.println("Total words: " + words1.size());

            LinkedListMap<String,Integer> listMap=new LinkedListMap<String, Integer>();
            for (String word : words1) {
                if (listMap.contains(word)) {
                    listMap.set(word, listMap.get(word) + 1);
                }
                listMap.add(word, 1);
            }
            System.out.println("Total different words: " + listMap.getSize());
        }
    }
}
