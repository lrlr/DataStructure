package string;

public class KMPString {


    public static int[] next(String sub)


    {
         int[] next = new int[sub.length() + 1];
         char[] T = sub.toCharArray();
         int length = sub.length();

         int i, j;
         i = 1;
         j = 0;
         next[1] = 0;//第一个字符的next值是0, 假设数组next是从1开始的算，next[0]不用
         while (i < length)
         {
         if (j == 0 || T[i - 1] == T[j - 1])// 此处T[i]表示后缀单个字符，T[j]表前缀
             {
            ++ i;
            ++ j;
             next[i] = j;//存放当前的next值为此时模式串的游标值

        } else
         j = next[j];// 若字符不同，刚j值回溯
                     //System.out.println("i:" + i + "  j:" + j);

    }
    return next;

    }

    public static int[] nextval(String sub)


    {
         int[] next = new int[sub.length() + 1];
         char[] T = sub.toCharArray();
         int length = sub.length();

         int i, j;
         i = 1;
         j = 0;
        next[1] = 0;
        while (i < length) {
            if (j == 0 || T[i - 1] == T[j - 1])// 此处T[i]表示后缀单个字符，T[j]表前缀
            {
                ++i;
                ++j;

                if (T[i - 1] != T[j - 1]) // 若当前字符与前缀字符不同
                {
                    next[i] = j;

                } else {
                    next[i] = next[j]; // 若相同，刚将前缀字符的next值赋给next在i位置的值

                }
            } else
                j = next[j];// 若字符不同，刚j值回溯
            //System.out.println("i:" + i + "  j:" + j);
        }
        return next;
    }


//    /**
//     * 求出一个字符数组的next数组
//     *
//     * @param t 字符数组
//     * @return next数组
//     */
//    public static int[] getNextArray(char[] t) {
//        int[] next = new int[t.length];
//        next[0] = -1;
//        next[1] = 0;
//        int k;
//        for (int j = 2; j < t.length; j++) {
//            k = next[j - 1];
//            while (k != -1) {
//                if (t[j - 1] == t[k]) {
//                    next[j] = k + 1;
//                    break;
//                } else {
//                    k = next[k];
//                }
//                next[j] = 0;  //当k==-1而跳出循环时，next[j] = 0，否则next[j]会在break之前被赋值
//            }
//        }
//        return next;
//    }

//    /**
//     * 对主串s和模式串t进行KMP模式匹配
//     *
//     * @param s 主串
//     * @param t 模式串
//     * @return 若匹配成功，返回t在s中的位置（第一个相同字符对应的位置），若匹配失败，返回-1
//     */
//    public static int kmpMatch(String s, String t) {
//        char[] s_arr = s.toCharArray();
//        char[] t_arr = t.toCharArray();
//        int[] next = getNextArray(t_arr);
//        int i = 0, j = 0;
//        while (i < s_arr.length && j < t_arr.length) {
//            if (j == -1 || s_arr[i] == t_arr[j]) {
//                i++;
//                j++;
//            } else
//                j = next[j];
//        }
//        if (j == t_arr.length)
//            return i - j;
//        else
//            return -1;
//    }

    public static void main(String[] args) {
        String tmp = "abaabcac";
        int[] ss= KMPString.next(tmp);
//        int[] ss = KMPString.getNextArray(tmp.toCharArray());
        for (int i : ss) {
            System.out.println(i);
        }
//            System.out.println(kmpMatch("abcabaabaabcacb", "abaabcac"));
    }
}
