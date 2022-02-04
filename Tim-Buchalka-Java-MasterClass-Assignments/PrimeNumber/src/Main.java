public class Main {
    public static void main(String[] args) {
        int count = 0;
        for (int i=1; i<=50; i++){
            if (Prime.isPrime(i)){
                count++;
                System.out.println("Number "+ i+" is a prime number");
                if (count==10){
                    System.out.println("Exiting the Loop");
                    break;

                }

            }
        }
        System.out.println(count);

    }
}
