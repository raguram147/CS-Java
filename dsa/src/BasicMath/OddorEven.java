package BasicMath;

import java.io.*;

public class OddorEven {
    public static void main(String[]args){
        System.out.println(TwoOddEven(4));
    }
    public static Boolean TwoOddEven(int a){
        if(a==0){
            System.out.println("Please enter the number");
            try {
                a=System.in.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if(a%2==0) return true;
        else return false;
    }
}
