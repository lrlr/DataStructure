package test;

/**
 * Created by lirui on 2018/12/13.
 */
public class ObjectTestChild extends ObjectTest1{
    String test;
    public ObjectTestChild(String name,String test) {
        super(name);
        this.test=test;
    }
    public String getTest() {
        return test;
    }
    public void setTest(String test) {
        this.test = test;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj==this)
        return true;
        if (obj.getClass()==this.getClass()){
            ObjectTestChild objectTestChild=(ObjectTestChild) obj;
            return super.equals(objectTestChild)&&objectTestChild.test==test;
        }
        return false;
    }
}
