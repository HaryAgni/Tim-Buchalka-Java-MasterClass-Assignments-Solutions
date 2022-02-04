public class EvenSum {
    public static int getEvenDigitSum(int number){
        int sum =0;
        int temp = 0;
        if (number<0){
            return -1;
        }
        for (sum =0; number!=0; number = number/10){
            temp = number%10;
            if (temp%2==0){
                sum = sum + temp;
            }

        }
        return sum;
    }
}
