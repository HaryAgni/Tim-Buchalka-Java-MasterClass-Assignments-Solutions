public class Palindrome {
    public static boolean isPalindrome(int number){
        int rem = 0;
        int rev = 0;
        if (number<0)number=-1*number;
        int temp = number;
        for (rev=0;number!=0;number/=10){
            rem =number%10;
            rev = rev * 10 +rem;
            if (number==temp){
                return true;
            }
        }

        return false;
    }
}
//    if(number<0)number=-number;
//        int rem=0,rev=0,temp=number;
//        while(number>0){
//        rem=number%10;
//        rev=rev*10+rem;
//        number=number/10;
//        }
//        if(rev==temp){
//        return true;
//        }
//        return false;
//        }