public class Main {
    public static void main(String[] args) {
        int a = LargestPrime.getLargestPrime(21);
        System.out.println(a);
        a = LargestPrime.getLargestPrime(217);
        System.out.println(a);
        a = LargestPrime.getLargestPrime(0);
        System.out.println(a);
        a = LargestPrime.getLargestPrime(45);
        System.out.println(a);
        a = LargestPrime.getLargestPrime(-1);
        System.out.println(a);
        boolean b = LargestPrime.getPrime(15);
        System.out.println(b);
    }
}
