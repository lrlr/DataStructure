package string;

/**
 *
 * 串普通模式匹配
 */
public class CommonStringTest {
    public static int indexOf(String s, String t) {
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        int sLength = ss.length;
        int tLength = tt.length;
        /**
         * 1. 校验主串和子串为0的情况
         * 2. 校验子串和主串的长度大小
         * 3. for循环找是否能找到完全匹配的子串
         */
        if (sLength <= 0) {
            return tLength == 0 ? sLength : -1;
        } else {
            if (tLength <= 0) {
                return 0;
            }
            /**
             * 控制for循环长度，两者差值加1，加1就是为了如果两者相等也要比较
             * 例如 两者长度差是3，那么就要循环四次
             */
            int fsize = sLength - tLength + 1;
            for (int i = 0; i < fsize; i++) {
                //找到主串和子串第一个位置相同的char
                if (ss[i] != tt[0]) {
                    do {
                        ++i;
                    } while (i < fsize && ss[i] != tt[0]);
                }
                /**
                 * 找到后继继续遍历即可，后续遍历就是主串和子串都按顺序递增往后一一比对
                 */
                if (i < fsize) {
                    //得到下一个要匹配的位置
                    int next = i + 1;
                    int var11 = next + tLength - 1;
                    /**
                     * 遍历，其余【目标字符串】，从var12开始
                     * 如果var10不越界，（小于var11，表示其余【目标字符串】的范围）
                     * 同时【源字符串】==【目标字符串】，则
                     * 自增，继续查找匹配
                     */

                    for (int var12 = 0 + 1; next < var11 && ss[next] == tt[var12]; ++var12) {
                        ++next;
                    }
                    //源字符串中匹配到目标字符串，匹配结束，返回索引位置
                    if (next == var11) {
                        return i;
                    }
                }
            }

        }


        return -1;
    }

    public static void main(String[] args) {
        System.out.println(indexOf("12345678","456"));
    }
}
