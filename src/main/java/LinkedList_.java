import org.junit.Test;

/**
 * Created by abeey on 28/07/2019.
 */
public class LinkedList_ {
    Node head;

    static class Node {
        Node next;
        int data;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static LinkedList_ insert(LinkedList_ list , int data){
        Node newNode = new  Node(data);
        if(list.head == null){
            list.head = newNode;
        }

        else{
            Node last = list.head;
            while(last.next != null){
                last = last.next;
            }
            last.next = newNode;
        }
        return list;
    }

    public static void  print(LinkedList_ lis){
        Node curreNode = lis.head;
        while(curreNode!= null){
            System.out.println(curreNode.data + " ");
               curreNode = curreNode.next;
        }
    }



    @Test
    public void test(){
        LinkedList_ lis = new LinkedList_();
        for(int i = 0; i<100 ;i+=3){
            lis = insert(lis ,i);
        }
    }





}