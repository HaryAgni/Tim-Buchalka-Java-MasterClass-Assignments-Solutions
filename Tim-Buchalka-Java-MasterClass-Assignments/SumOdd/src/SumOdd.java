public class SumOdd {
    public static boolean isOdd(int number){
        if (number>0){
            if (number%2!=0){
                return true;
            }
        }
         return false;
    }
    public static int sumOdd(int start, int end){
        int a = 0;
        if ((end>=start)&&start>0&&end>0) {
            for (int i = start; i<=end; i++ ){
                if (isOdd(i)){
                    a+=i;
                }
            }
            return a;
        }
        return -1;
    }
}
