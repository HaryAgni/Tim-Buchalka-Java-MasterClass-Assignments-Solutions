public class Secondlargest {
    public static void second(int a, int b, int c){
        int largest = 0;
        int secondLargest = 0;
        int smallest = 0;
        if(a>b&&a>c){
            largest = a;
            if (b>c){
                secondLargest = b;
                smallest = c;
            }
            else {
                secondLargest = c;
                smallest = b;
            }
        }
        if(b>a&&b>c){
            largest = b;
            if (a>c){
                secondLargest = a;
                smallest = c;
            }
            else {
                secondLargest = c;
                smallest = a;
            }
        }
    }
}
