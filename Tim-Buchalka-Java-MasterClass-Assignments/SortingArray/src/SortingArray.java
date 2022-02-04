import java.util.Scanner;

public class SortingArray {
    private static Scanner scanner = new Scanner(System.in);
    public static int[] inputArray(int size){
        int[] values = new int[size];
        System.out.println("Enter numbers");
        for (int i =0; i<values.length;i++){
            values[i]= scanner.nextInt();
        }
        return values;

    }
    public static void printArray(int[] values){
        System.out.println("Elements in order of highest to lowest are");
        for (int i =0; i<values.length;i++){
            System.out.println(values[i]);
        }
    }
    public static int[] sortArray(int[] values){
        int temp;
        for (int i =0; i<values.length; i++){
            for (int j = i; j<values.length;j++){
                if (values[i]<values[j]){
                    temp = values[i];
                    values[i]= values[j];
                    values[j]=temp;
                }
            }
        }
        return values;
    }

}
