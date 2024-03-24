package BasicMath;

public class NearestPrime {
    public static void main(String[]args){
        System.out.println(Nearprime(8));
    }
    public static int Nearprime(int a){
        if(Prime.GivenPrime(a))return a;
        int left=a-1;
        int right=a+1;
        while(true){
            if(Prime.GivenPrime(left))return left;
            if(Prime.GivenPrime(right))return right;

            left--;
            right++;
        }
    }
}
