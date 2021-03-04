package dataString;

/**
 * Created by 63024 on 2018/11/8.
 */
public interface MString {
    //将字符串清空
    public void clear();
    //判断是否为空
    public boolean isEmpty();
    //求字符串的长度
    public int length();
    //取字符串某个下标的字符
    public char charAt(int index);
    //截取字符串
    public MString subString(int begin,int end);
    //根据下标将字符串插入到指定位置
    public MString insert(int offset,MString str);
    //删掉串中某一个部分
    public MString delete(int begin,int end);
    //将一个字符串连接到该字符串的末尾
    public MString concat(MString str);
    //两个字符串进行比较
    public int compareTo(MString str);
    //在本字符串从begin位置开始，检索某一个字符
    public int indexOf(MString str,int begin);

}
