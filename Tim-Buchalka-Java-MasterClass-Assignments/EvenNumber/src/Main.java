public class Main {
    public static void main(String[] args) {
        int number =4;
        int finishNumber = 22;
        int count=0;
        while (number<=finishNumber){
            number++;
            if (!EvenNumber.isEvenNumber(number)){
                continue;
            }
            System.out.println(number+" is a Even Number");
                count++;
                if (count==5){
                    break;
                }

        }
        System.out.println(count);
    }
}
