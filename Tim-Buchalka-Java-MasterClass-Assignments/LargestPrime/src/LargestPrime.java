public class LargestPrime {
    public static int getLargestPrime(int number){
        int largestPrime = 0;
        if (number<0)return -1;
        for (int i =1; i<=number/2; i++){
            if (number%i==0&&getPrime(i)){
                largestPrime = i;
            }
            else continue;
        }if (largestPrime!=0) {
            return largestPrime;
        }
        else return -1;
    }

    public static boolean getPrime(int number){
        for (int i =2; i<=number/2; i++){
            if (number%i==0){
                return false;

            }
        }
        return true;
    }
}
