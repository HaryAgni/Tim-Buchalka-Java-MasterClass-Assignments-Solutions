import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {
        int sum = 0;
        int counter = 1;
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Enter number #"+counter+":");
            if (scanner.hasNextInt()){
                int number = scanner.nextInt();
                sum = sum+number;
                counter++;
                if (counter>10){
                    break;
                }
            }
            else {
                System.out.println("Please Enter Valid number");
            }
            scanner.nextLine();

        }

        System.out.println("The sum of the numbers you have entered is"+ sum);
        scanner.close();

    }
}
