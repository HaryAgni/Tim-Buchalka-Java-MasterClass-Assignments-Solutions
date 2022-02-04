public class Main {
    public static void main(String[] args) {
        for (double i = 2.0; i<=8.0;i++){
            System.out.println("10,000 at "+ i+"% interest = "+ String.format("%.2f",Interest.calulateInterest(10000.0,i)));
        }
        System.out.println("*********************************");
        for (double i = 8.0; i>=2.0;i--){
            System.out.println("10,000 at "+ i+"% interest = "+ String.format("%.2f",Interest.calulateInterest(10000.0,i)));
        }
    }
}
