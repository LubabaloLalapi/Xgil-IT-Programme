//Write a program that prints numbers like a pyramid
public class Pattern {

    public static void main(String[]args){
        int rows=5;
        //Outer loop
        for(int i=1;i<=rows;i++){
            //Inner loop to print the numbers
            for(int j=1;j<=i;j++){
                System.out.print(j+ "");
            }
            System.out.println("");
        }

    }
}
