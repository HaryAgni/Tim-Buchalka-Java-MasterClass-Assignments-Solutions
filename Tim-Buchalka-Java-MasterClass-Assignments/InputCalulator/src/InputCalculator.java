import java.util.Scanner;

public class InputCalculator {
    public static void inputPrintSumAndAverage(){
        int sum = 0;
        int avgCount = 0;
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Enter Number:");
            boolean check = scanner.hasNextInt();
            if (check){
                int number = scanner.nextInt();
                sum = sum+number;
                avgCount++;

            }
            else break;

        }
        double avg = sum/avgCount;
        System.out.println("SUM = "+ sum+" AVG = "+ avg);
    }
}
