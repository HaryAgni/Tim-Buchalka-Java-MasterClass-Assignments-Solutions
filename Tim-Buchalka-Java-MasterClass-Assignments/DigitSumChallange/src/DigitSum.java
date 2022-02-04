public class DigitSum {
    public static int sumDigits(int number) {
        int temp = 0;
        int sum = 0;
        if (number <= 9) {
            return -1;

        } else {
            for (sum = 0; number != 0; number = number / 10) {
                temp = number % 10;
                sum += temp;
            }
            return sum;

        }
    }
}
