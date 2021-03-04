package test;

/**
 * Created by lirui on 2018/12/12.
 */
public class ObjectTest1 {
    private  Integer size;
    private String name;
    private String des;
   public ObjectTest1(String name){
       this.name=name;
   }
    public ObjectTest1(){
    }
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    @Override
    public boolean equals(Object obj) {
        if (this==obj){
            return true;
        }
        if (obj.getClass()==this.getClass()){
            ObjectTest1 objectTest1=(ObjectTest1) obj;
            return name.equals(objectTest1.name);
        }else{
            return false;
        }
    }

//    @Override
 /*   public int hashCode() {
        return name.hashCode()+des.hashCode()+size.hashCode();
    }*/
}
