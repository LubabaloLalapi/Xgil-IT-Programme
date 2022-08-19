
//Write a program with a valid month (from month 1 to 12) that will display the month and the season of that month
import java.util.Scanner;

public class Seasons {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int month;
        System.out.println("Enter number from 1 to 12 ");
        month=in.nextInt();
        //Months
        switch(month){
            case 1:
                System.out.println("January, Summer");
                break;
            case 2:
                System.out.println("February, Summer");
                break;
            case 3:
                System.out.println("March, Autumn");
                break;
            case 4:
                System.out.println("April, Autumn");
                break;
            case 5:
                System.out.println("May, Autumn");
                break;
            case 6:
                System.out.println("June, Winter");
                break;
            case 7:
                System.out.println("July, Winter");
                break;
            case 8:
                System.out.println("August, Winter");
                break;
            case 9:
                System.out.println("September, Spring");
                break;
            case 10:
                System.out.println("October, Spring");
                break;
            case 11:
                System.out.println("November, Spring");
                break;
            case 12:
                System.out.println("December, Summer");
                break;
            default:
                System.out.println("Invalid Month");

        }

    }
}
