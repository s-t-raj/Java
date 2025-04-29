package Functions;
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.print("enter a number : ");
    int val = in.nextInt();
    Boolean result = armstrong(val);
    System.out.println("It is a Armstrong NUmber : " + result);
    }
    static Boolean armstrong(int num){
        int result = 0;
        int original = num;
        while (num>0) {
            int mod = num % 10;
            int cube = mod*mod*mod;
            result = result + cube ;
            num = num/10;
        }
        return original == result;
    }
}

