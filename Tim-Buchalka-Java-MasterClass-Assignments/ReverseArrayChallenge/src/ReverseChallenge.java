import java.util.Arrays;
import java.util.Scanner;

public class ReverseChallenge {
    private static Scanner scanner = new Scanner(System.in);
    public static int[] inputArray(){
        System.out.println("Enter no of elements you want to enter:");
        int input = scanner.nextInt();
        scanner.nextLine();
        int[] arr = new int[input];
        System.out.println("Enter Elements");
        for (int i =0; i<arr.length;i++){
            arr[i]= scanner.nextInt();
        }
        return arr;
    }
    public static void reverse(int[] arr){
        int[] newArray = new int[arr.length];
        int temp = arr.length-1;
        for (int i=0;i<arr.length;i++){
            newArray[i]=arr[temp];
            temp--;
        }
        System.out.println("Array in entered order "+Arrays.toString(arr));
        System.out.println("Array in reverse order "+Arrays.toString(newArray));
    }

}
