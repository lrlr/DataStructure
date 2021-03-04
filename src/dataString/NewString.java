package dataString;

/**
 * Created by 63024 on 2018/11/8.
 */
public class NewString implements MString {
    private char[] strvalue;
    //记录当前串的长度
    private int size;
    public NewString(){
        this.strvalue=new char[0];
        this.size=0;

    }
    public NewString(int maxSize){
        this.strvalue=new char[maxSize];
        this.size=0;
    }
    public NewString(String str){
        strvalue=str.toCharArray();
        size=strvalue.length;
    }
    public NewString(char[] value){
        strvalue=new char[value.length];
        for (int i=0;i<value.length;i++){
            strvalue[i]=value[i];
        }
        size=strvalue.length;
    }
    @Override
    public void clear() {
         for (int i=0;i<strvalue.length;i++){
             strvalue[i]=0;
             size=0;
         }
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public int length() {
        return strvalue.length;
    }

    @Override
    public char charAt(int index) {
        if (index<0||index>=size){
            throw new StringIndexOutOfBoundsException("越界");
        }

        return strvalue[index];
    }

    @Override
    public MString subString(int begin, int end) {
        if (begin<0){
            throw new StringIndexOutOfBoundsException("越界");
        }
        if (end>size){
            throw new StringIndexOutOfBoundsException("越界");
        }
        if (begin>end){
            throw new StringIndexOutOfBoundsException("越界");
        }
        if (begin==0 && end==size){
            return this;
        }else{
            char[] buffer=new char[end-begin];
            for (int i=0;i<buffer.length;i++){
            buffer[i]=strvalue[i+begin];
            }
            return new NewString(buffer);
        }

    }

    @Override
    public MString insert(int offset, MString str) {
        if (offset<0||offset>size){
            throw new StringIndexOutOfBoundsException("越界");
        }
        int len=str.length();
        int newleng=len+size;
        if (newleng>strvalue.length){
            resize(newleng);
        }
        for (int i =size-1;i>=offset;i--){
            strvalue[len+i]=strvalue[i];
        }
        for (int i=0;i<size;i++){
            strvalue[offset+i]=str.charAt(i);
        }
        return null;
    }

    @Override
    public MString delete(int begin, int end) {
        return null;
    }

    @Override
    public MString concat(MString str) {
        return null;
    }

    @Override
    public int compareTo(MString str) {
        return 0;
    }

    @Override
    public int indexOf(MString str, int begin) {
        return 0;
    }
    public void resize(int capisity){
       char[] tem=this.strvalue;
        strvalue=new char[capisity];
        for (int i=0;i<size;i++){
            strvalue[i]=tem[i];
        }

    }
}
