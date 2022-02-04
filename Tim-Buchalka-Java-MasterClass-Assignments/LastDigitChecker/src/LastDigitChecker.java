public class LastDigitChecker {
    public static boolean hasSameLastDigit(int a, int b, int c){
        int ld1 =0;
        int ld2=0;
        int ld3 =0;
        if (a<10||a>1000||b<10||b>1000||c<10||c>1000){
            return false;
        }
        else {
            ld1 = a%10;
            ld2 = b%10;
            ld3 = c%10;
            if (ld1==ld2||ld1==ld3||ld2==ld3){
                return true;
            }
            else return false;
        }

    }
}
