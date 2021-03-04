package dataLink;

/**
 * Created by lirui on 2018/11/12.
 */
public class LeetCodeTestOne {
public DataLink removeElement(DataLink dataLink,int val){
     while (dataLink!=null&&dataLink.val==val){
         DataLink preData=dataLink;
         preData=dataLink.next;
         dataLink.next=null;
     }
     if (dataLink==null){
         return dataLink;
     }
     DataLink dataLink1=dataLink;
     while (dataLink.next!=null) {
         if (dataLink.next.val == val) {
             DataLink dataLink2 = dataLink.next;
             dataLink1.next = dataLink2.next;
             dataLink2.next =null;
         } else {
             dataLink1 = dataLink1.next;
         }
     }
         return dataLink;

}
}
