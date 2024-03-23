package LinkedList;
import java.util.Scanner;
public class LinkedListDesign {
    
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);

        LinkedList list=new LinkedList();
        while(true){
        System.out.println("Operations of Linked List please select from below:");
        System.out.println("1. Insertion");
        System.out.println("2. Deletion");
        System.out.println("3. Sorting");
        System.out.println("4. Display");
        System.out.println("5. Seraching");
        System.out.println("6. Remove All");
        System.out.println("7. Remove duplicates");

        
        int ch=scan.nextInt();

        switch(ch){
            case 1:
                System.out.println("Please enter the size of the element");
                int size=scan.nextInt();
                for(int i=0;i<size;i++){
                    int num=scan.nextInt();
                    list.Insert(list,num);
                }
                break;
            case 2:
                System.out.println("Please enter the element to be deleted");
                int t=scan.nextInt();
                list.Delete(list,t);
                break;
            case 3:
                // System.out.println("Please enter the element to be search");
                // int s=scan.nextInt();
                list.Sort(list);
                break;
                
            case 4:
                list.Display(list);
                break;
            case 5:
                System.out.println("Please enter the element to serach");
                int key=scan.nextInt();
                list.Search(list,key);
                break;
            case 6:
                System.out.println("Please enter the element to be removed from the list");
                int d=scan.nextInt();
                list.Remove(list,d);
                break;
            case 7:
                System.out.println("Please enter the element to be removed from the list");
                // int dup=scan.nextInt();
                list.RemoveDup(list);
                break;
        }
        System.out.println("Continue 1/0?");
        int c=scan.nextInt();
        if(c==0)break;
        }
    }
}
