public class FirstAndLast {
    public static int sumFirstAndLAstDigit(int number){
        int lastDigit = number%10;
        int first =0;
        int sum =0;
        for (first = 0; number!=0;number = number/10){
            first = number%10;
            }
        sum= lastDigit+first;
        return sum;
        }

    }
