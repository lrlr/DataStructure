package test;

import javax.jws.soap.SOAPBinding;

/**
 * 字符串字符大小写转换
 * Created by lirui on 2018/11/30.
 */
public class CharChange {
    public static void main(String[] args) {
        String s="AsdfHyDFgd1AjkPn";
        StringBuilder builder=new StringBuilder();
        for (int i=0;i<s.length()-1;i++){
            char c;
            if (s.charAt(i)>='a'&&s.charAt(i)<='z'){
                c= (char) (s.charAt(i)-32);
            }else if (s.charAt(i)>='A'&&s.charAt(i)<='Z'){
                c=(char)(s.charAt(i)+32);
            }else if (s.charAt(i)>='0'&&s.charAt(i)<='9'){
                c=s.charAt(i);
            }else{
                c='*';
            }
            builder.append(c);
        }
        String j=builder.toString();
        System.out.println(j);
        String s1 = s.toUpperCase();

    }
}

