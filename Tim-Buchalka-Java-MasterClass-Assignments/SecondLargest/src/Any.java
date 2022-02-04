public class Any {
    public static void second(int a, int b, int c) {
        int largest = 0;
        int secondLargest = 0;
        int smallest = 0;
        if (a > b && a > c && a!=b&&a!=c) {
            largest = a;
            if (b > c&&b!=c) {
                secondLargest = b;
                smallest = c;
            } else {
                secondLargest = c;
                smallest = b;
            }
            System.out.println("Largest = " + largest);
            System.out.println("Second Largest = " + secondLargest);
            System.out.println("Smallest = " + smallest);
        }
        else if (b > a && b > c&&b!=a&&b!=c) {
            largest = b;
            if (a > c&&a!=c) {
                secondLargest = a;
                smallest = c;
            } else {
                secondLargest = c;
                smallest = a;
            }
            System.out.println("Largest = " + largest);
            System.out.println("Second Largest = " + secondLargest);
            System.out.println("Smallest = " + smallest);
        }
        else if (c > a && c > b&&c!=a&&c!=b) {
            largest = c;
            if (b > a&&b!=a) {
                secondLargest = b;
                smallest = a;
            } else {
                secondLargest = a;
                smallest = b;
            }
            System.out.println("Largest = " + largest);
            System.out.println("Second Largest = " + secondLargest);
            System.out.println("Smallest = " + smallest);
        }else if (a==b||b==c||a==c){
                System.out.println("any of the two numbers are equal");
            }
        }
    }