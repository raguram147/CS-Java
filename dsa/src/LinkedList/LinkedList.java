package LinkedList;
import java.util.*;
public class LinkedList {
    Node head;
    static class Node{
        int data;
        Node next;

        Node(int d){
            this.data=d;
            this.next=null;
        }
    }

    public LinkedList Insert(LinkedList list,int d){
        Node newnode=new Node(d);
        newnode.next=null;

        if(list.head==null)list.head=newnode;
        else{

            Node last=list.head;
            // traversing till last
            while(last.next!=null){
                last=last.next;
            }
            //inserting the element at the last
            last.next=newnode;
        }
        return list;
    }

    public void Display(LinkedList list){
        Node h=list.head;
        while(h!=null){
            System.out.println(h.data);
            h=h.next;
        }
    }
    public LinkedList Delete(LinkedList list,int t){
        Node h=list.head;
        if(h.data==t){
            h=h.next;
            return list;
        }
        while(h!=null){
            if(h.next.data==t){
                Node temp=h.next.next;
                h.next=temp;
                return list;
            }
            h=h.next;
        }
        return list;
    }

    public LinkedList Remove(LinkedList list,int d){
        Node h=list.head;
        if(h!=null&&h.data==d){
            h=h.next;
        }
        while(h.next!=null&&h!=null){
            if(h.next.data==d){
                h.next=h.next.next;
            }
            else{
                h=h.next;
            }
        }
        return list;
    }
    public LinkedList RemoveDup(LinkedList list){
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        Node cur=list.head;
        Node prev=null;
        while(cur!=null){
            if(!map.containsKey(cur.data)){
                map.put(cur.data,1);
                prev=cur;
            }
            else{
                prev.next=cur.next;
            }
            cur=cur.next;
        }
        return list;
    }
    public void Search(LinkedList list, int key){
        Node cur=list.head;
        int index=0;
        while(cur!=null){
            if(cur.data==key){
                System.out.println("The element "+key+" found in "+index+"th index");
                return;
            }
            cur=cur.next;
        }
        System.out.println("The element "+key+ " is not found");
        return;

    }
    public void Sort(LinkedList list){
        Node cur=list.head;

        System.out.println(mid(list));
    }
    private int mid(LinkedList list){
        Node cur=list.head;
        int midd=0;
        while(cur!=null){
            midd++;
            cur=cur.next;
        }
        cur=list.head;
        midd=midd/2;
        while(cur!=null){
            midd--;
            if(midd==0) return cur.next.data;
            cur=cur.next;
        }
        return -1;
    }
}
