
//Write a program that displays the sum, product and average of elements of an integer array
public class Array {
    public static void main(String[]args){
        int[] numbers={1,2,8,4,5,7};

        int sum=0;
        int product=1;
        double avg;

        for(int i=0;i<numbers.length;i++){
            sum+=numbers[i];
            product *=numbers[i];
        }
        avg=(double)sum/ numbers.length;

        System.out.println("Sum = " + sum);
        System.out.println("Product = " + product);
        System.out.println("Average = " + avg);
    }
}
