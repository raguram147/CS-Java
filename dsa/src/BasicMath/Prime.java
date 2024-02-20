package BasicMath;

public class Prime {
    public static void main(String[]args){
        System.out.println(GivenPrime(4));
    }
    public static Boolean GivenPrime(int a){

        for(int i=2;i<a/2;i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
}
