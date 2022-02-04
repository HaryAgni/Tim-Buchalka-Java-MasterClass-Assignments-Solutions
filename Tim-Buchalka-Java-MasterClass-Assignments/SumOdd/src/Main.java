public class Main {
    public static void main(String[] args) {
        int print = SumOdd.sumOdd(1,100);
        System.out.println(print);
        print = SumOdd.sumOdd(-1,100);
        System.out.println(print);
        print = SumOdd.sumOdd(100,100);
        System.out.println(print);
        print = SumOdd.sumOdd(13,13);
        System.out.println(print);
        print = SumOdd.sumOdd(100,-100);
        System.out.println(print);
        print = SumOdd.sumOdd(100,1000);
        System.out.println(print);
    }
}
