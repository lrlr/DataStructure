package Set;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
       new Main().Bst();
        new Main().Linked();
    }

    public void Bst(){
        System.out.println("Pride and Prejudice");
        long timesStart=System.currentTimeMillis();
        ArrayList<String> words1 = new ArrayList<>();
        if(FileOperation.readFile("pride-and-prejudice.txt", words1)) {
            System.out.println("Total words: " + words1.size());

            BstSet<String> set1 = new BstSet<String>();
            for (String word : words1)
                set1.add(word);
            System.out.println("Total different words: " + set1.getSize());
        }

        System.out.println();


        System.out.println("A Tale of Two Cities");

        ArrayList<String> words2 = new ArrayList<>();
        if(FileOperation.readFile("a-tale-of-two-cities.txt", words2)){
            System.out.println("Total words: " + words2.size());

            BstSet<String> set2 = new BstSet<String>();
            for(String word: words2)
                set2.add(word);
            System.out.println("Total different words: " + set2.getSize());
        }
        long timeEnd=System.currentTimeMillis();
        System.out.println("BST time"+(timeEnd-timesStart));
    }

    public void Linked(){
        System.out.println("Pride and Prejudice");
        long timesStart=System.currentTimeMillis();
        ArrayList<String> words1 = new ArrayList<>();
        if(FileOperation.readFile("pride-and-prejudice.txt", words1)) {
            System.out.println("Total words: " + words1.size());

            LinkedListSet<String> set1 = new LinkedListSet<String>();
            for (String word : words1)
                set1.add(word);
            System.out.println("Total different words: " + set1.getSize());
        }

        System.out.println();


        System.out.println("A Tale of Two Cities");

        ArrayList<String> words2 = new ArrayList<>();
        if(FileOperation.readFile("a-tale-of-two-cities.txt", words2)){
            System.out.println("Total words: " + words2.size());

            LinkedListSet<String> set2 = new LinkedListSet<String>();
            for(String word: words2)
                set2.add(word);
            System.out.println("Total different words: " + set2.getSize());
        }
        long timeEnd=System.currentTimeMillis();
        System.out.println("LinkedList time"+(timeEnd-timesStart));
    }
}
