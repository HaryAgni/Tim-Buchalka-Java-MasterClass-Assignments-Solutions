import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] myArray = SortingArray.inputArray(5);
       int[] sortArray = SortingArray.sortArray(myArray);
        SortingArray.printArray(sortArray);

    }
}
