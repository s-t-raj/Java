import java.util.Scanner;
public class Fibo{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the count of Fibo Number :");
        int inputNumber = in.nextInt();
        int first = 0;
        int second = 1;
        int count = 2;
        while(count<=inputNumber){
            int temp = second ;
            second = first+second;
            first=temp;
            count++;
        }
        System.out.println("Your Fibo Output Is : " + second);
    }
}