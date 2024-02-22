package BasicMath;

public class ArmStrong {
    public static void main(String[]args){
        System.out.println(isArmStrong(1634));
    }
    private static Boolean isArmStrong(int a){
        int n=0,rem,res=0,temp=a;
        // count the number digits!
        while(temp!=0){
            temp/=10;
            n++;
        }
        temp=a;
        while(temp!=0){
            rem=temp%10;
            res=res+(int)Math.pow(rem,n);
            temp/=10;
        }
        if(res==a)return true;
        return false;
    }
}
