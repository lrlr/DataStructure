package string;

import java.util.Arrays;

/**
 *next数组前后缀概念
 * 前缀"和"后缀"。 "前缀"指除了最后一个字符以外，一个字符串的全部头部组合；
 */
public class KMP {
    /*
     * 返回字符串的next数组
     */
    public int[] getNext(String str) {
        int length = str.length();
        int[] next = new int[length];  //别忘了初始化
        int i = 0;   //i为后缀的指针
        int j = -1;  //j为前缀的指针
        next[0] = -1;
        while (i < length - 1) {         // 因为后面有next[i++],所以不是i<length
            if (j == -1 || str.charAt(i) == str.charAt(j)) { // j == -1代表前后缀没有相等的部分,i+1位置的next值为0
                next[++i] = ++j;  //等于前缀的长度
            } else {
                j = next[j];
            }
        }
        return next;
    }

    /*
     * 返回子串t在主串s中第pos个字符后的位置(包含pos位置)。若不存在返回-1
     */
    public int index_KMP(String s, String t, int pos) {
        int i = pos;  //主串的指针
        int j = 0;    //子串的指针
        int[] next = getNext(t);  //获取子串的next数组
        while (i < s.length() && j < t.length()) {
            if (j == -1 || s.charAt(i) == t.charAt(j)) {
                // j==-1说明了子串首位也不匹配，它是由j=next[0]=-1得到的。
                i++;
                j++;
            } else {
                j = next[j];
            }
        }
        if (j == t.length())
            return i - j;
        return -1;
    }

    public static void main(String[] args) {
        KMP aKmp = new KMP();
        String s="abaabcac";
        System.out.println(Arrays.toString(aKmp.getNext(s)));
        System.out.println(aKmp.index_KMP("abaabcabaabcac",s,0));
    }
}
