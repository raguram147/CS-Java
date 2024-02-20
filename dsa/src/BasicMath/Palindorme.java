package BasicMath;

public class Palindorme {
    public static void main (String[] args){
        System.out.println(givenPlaindormeInt(10));
    }
    
    public static Boolean givenPlaindormeInt(int a){
        int temp=a,rev=0,remainder;
        while(a>0){
            remainder=a%10;
            rev=rev*10+remainder;
            a=a/10;
        }
        if(rev==temp)return true;
        else return false;
    }
    
}
