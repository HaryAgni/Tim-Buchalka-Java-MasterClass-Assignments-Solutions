import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int big=0;int small=0;int number2 =0;
        boolean temp = true;
        while (true){
            System.out.println("Enter Number");
            boolean check = scanner.hasNextInt();
            if (check){
               int number1 =scanner.nextInt();
               if (temp){
                   temp = false;
                   number2 =number1;
               }
                if (smallOrBig(number1,number2)){
                    big = number1;
                }
                if (!smallOrBig(number1,number2)){
                    small = number1;
                }
                number2 = number1;

            }
            else {
                System.out.println("Invalid Number");
                break;
            }
            scanner.nextLine();

        }
        System.out.println("Largest = "+ big+ " Smallest = "+ small);
    }
    public static boolean smallOrBig(int number1, int number2){
        if (number1>number2)return true;
        else return false;
    }
}
