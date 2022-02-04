public class Main {
    public static void main(String[] args) {
        boolean b = FlourProblem.canPack(1,0,40);
        System.out.println(b);
        b = FlourProblem.canPack(1,0,5);
        System.out.println(b);
        b = FlourProblem.canPack(0,5,4);
        System.out.println(b);
        b = FlourProblem.canPack(2,2,11);
        System.out.println(b);
        b = FlourProblem.canPack(-3,2,12);
        System.out.println(b);

    }
}
