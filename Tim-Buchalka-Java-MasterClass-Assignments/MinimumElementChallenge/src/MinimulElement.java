import java.util.Scanner;

public class MinimulElement {
    private static Scanner scanner = new Scanner(System.in);
    public static int[] readIntegers(){
        System.out.println("Enter No of integers you want to enter");
        int input = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter "+input+" integers");
        int[] arr = new int[input];
        for (int i = 0; i<arr.length;i++){
            arr[i]= scanner.nextInt();
        }
        return arr;
    }
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
           if (min>arr[i])min=arr[i];
        }
        System.out.println("The minimum integer in the array was");
        return min;
    }
}
