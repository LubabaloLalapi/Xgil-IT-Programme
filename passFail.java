import java.util.Scanner;

public class passFail {
    //Write a program that promts for final mark and if the final mark is greater or equal than 50, they Pass else display Fail
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int finalMark;
        System.out.println("Enter final mark");
        finalMark=in.nextInt();
        if(finalMark>=50){ //If final mark greater or equal to 50, display "PASS" else display "FAIL"
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
    }
}
