import java.util.Scanner;
public class Switch{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the NUmber For the Day : ");
        int day = input.nextInt();

        //____________Legacy Syntax For Switch Case_______________

        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Number!!!");
                break;
        }


        //Enhanced Switch Statements----------->

        switch(day){
            case 1 -> System.out.println("monday");
            case 2 -> System.out.println("tuesday");
            case 3 -> System.out.println("wednesday");
            case 4 -> System.out.println("thursday");
            case 5 -> System.out.println("friday");
            case 6 -> System.out.println("saturday");
            case 7 -> System.out.println("sunday");
            default -> System.out.println("Invalid Number!!");
        }

        switch(day){
            case 2 -> System.out.println("Week Day");
            case 3 -> System.out.println("Week Day");
            case 4 -> System.out.println("Week Day");
            case 5 -> System.out.println("Week Day");
            case 6 -> System.out.println("Week End");
            case 7 ->  System.out.println("Week End");
            default -> System.out.println("Invalid Number!!!");
        }

    }
}