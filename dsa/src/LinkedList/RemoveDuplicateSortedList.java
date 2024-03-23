package LinkedList;
import java.util.*;

import LinkedList.LinkedList.Node;
public class RemoveDuplicateSortedList {
    public static void main(String[]args){
        LinkedList list=new LinkedList();
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the size of the element");
        int size=scan.nextInt();
        for(int i=0;i<size;i++){
            int num=scan.nextInt();
            list.Insert(list,num);
        }
        RemoveDuplicateSorted(list);
        list.Display(list);
    }
    private static LinkedList RemoveDuplicateSorted(LinkedList list){
        Node prev=list.head;
        Node cur=list.head.next;
        while(cur!=null){
            if(prev.data==cur.data){
                cur=cur.next;
                prev.next=cur;
            }
            else{
                cur=cur.next;
                prev=prev.next;
            }
        }
        return list;
    }
}
