package Queue;

import java.util.Stack;
public class QueueusingStack {
    // Stack<Integer> s1,s2=new Stack< >();
    
    Stack < Integer > s1 = new Stack < > ();
    Stack < Integer > s2 = new Stack < > ();
    /** Initialize your data structure here. */
    public QueueusingStack() {
        
    }
    public void Enque(int n){
        while(s1.empty()==false){
                s2.push(s1.peek());
                s1.pop();
            }
            s1.push(n); 
            while(s2.empty()==false){
                s1.push(s2.peek());
                s2.pop();
            }
    }
    public int Deque(){
        if(s1.empty()==false)
            return s1.pop();
        return -1;
    }
}
