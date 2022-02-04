// Print Sum of first n natural numbers.

public class Main {
    public static int sum =0;
    public static void printSum(int n){
        if (n==0){
            System.out.println(sum);
            return;
        }
        sum =sum+n;
        printSum(n-1);
    }
    public static void main(String[] args) {
        int n =5;
        printSum(n);
    }
}
