
//Write a program that displays the maximum and minimum elements in an array
public class Array2 {
    public static void main(String[] args) {
        int[] num = { 1, 2, 3, 5, 7};
        int min=num[0];
        int max=num[0];
        //Comparing the minimum and maximum elements
        for(int i =1;i<num.length;i++){
            max=(num[i]>max)?num[i]:max;
            min=(num[i]>min)?num[i]:min;
        }
        System.out.println("Max = "+ max);
        System.out.println("Min = "+ min);
    }
    }

