public class Secondlargestnumber {
    public static void secondLargest(long a, long b, long c) {
        long larger1 = 0;
        long larger2 = 0;
        if (secondLargest(a,b)) {
            larger1 = a;
            larger2 = b;

        }
        else{
            larger1 = b;
            larger2 =a;
        }
        if (secondLargest(larger2,c)){
            System.out.println(larger2);
        }
        else if (!secondLargest(larger2,c)){
            System.out.println(c);
        }
    }

    public static boolean secondLargest(long a, long b) {
        long largest = 0;
        if (a > b && a != b) {
            largest = a;
            return true;
        } else if (b > a && b != a) {
            largest = b;
            return false;
        } else {
            System.out.println("Any of the two numbers are equal");
            return false;
        }
    }

}
