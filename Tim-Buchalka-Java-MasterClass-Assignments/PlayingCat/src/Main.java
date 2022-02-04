public class Main {
    public static void main(String[] args) {
        boolean b = PlayingCat.isCatPlaying(true,10);
        System.out.println(b);
        b = PlayingCat.isCatPlaying(false,36);
        System.out.println(b);
        b = PlayingCat.isCatPlaying(true,35);
        System.out.println(b);

    }

}
