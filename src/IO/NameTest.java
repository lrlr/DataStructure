package IO;

import java.io.*;
import java.util.ArrayList;

/**
 * @author lirui
 * @ClassName:
 * @Description:
 * @date 2019/7/2 17:15
 */
public class NameTest {
    public static void main(String[] args) {
        BufferedReader fileReader= null;
        try {
            fileReader = new BufferedReader(new FileReader("e:\\c.txt"));

            ArrayList<String> list = new ArrayList();

            String len = null;
            while (true) {

                    if (((len = fileReader.readLine()) != null)) {
                        list.add(len);

            }
            for (String ss : list) {
                System.out.println(ss);
            }
        } } catch (Exception e) {
        e.printStackTrace();
    }
    }
}
