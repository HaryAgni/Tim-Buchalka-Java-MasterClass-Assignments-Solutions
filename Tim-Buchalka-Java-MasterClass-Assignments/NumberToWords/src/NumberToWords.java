public class NumberToWords {
    public static void numberToWords(int number){
       int num = 0;
      if (number<0){
           System.out.println("Invalid Value");
       }
       else {
           int revNumber = reverse(number);
         for (int i = getDigitCount(number); i>0;i--){
               num = revNumber%10;
               revNumber = revNumber/10;
                switch (num){
                    case 0:
                        System.out.println("ZERO");
                        break;
                    case 1:
                        System.out.println("ONE");
                        break;
                    case 2:
                        System.out.println("TWO");
                        break;
                    case 3:
                        System.out.println("THREE");
                        break;
                    case 4:
                        System.out.println("FOUR");
                        break;
                    case 5:
                        System.out.println("FIVE");
                        break;
                    case 6:
                        System.out.println("SIX");
                        break;
                    case 7:
                        System.out.println("SEVEN");
                        break;
                    case 8:
                        System.out.println("EIGHT");
                        break;
                    case 9:
                        System.out.println("NINE");
                        break;
                }
            }
        }
    }
    public static int reverse(int number){
        int rev = 0;
        int rem = 0;
        for (rem = 0; number!=0; number/=10){
            rem = number%10;
            rev = rev * 10 +rem;
        }
        return rev;

    }
    public static int getDigitCount(int number){
        int count =0;
        if (number<0)return -1;
        for (int i =0; number!=0; number/=10){
            count++;
        }
        return count;
    }
    
}
