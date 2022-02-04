public class CommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second){
        if (first<10 ||second<10)return -1;
        int gcd=-1;
        int largest=first>second?first:second;
        for(int i=1;i<=largest;i++){
            if(first%i==0 && second%i==0){
                if(gcd<i)gcd=i;
            }
        }
        return gcd;
    }
}
