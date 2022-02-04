public class YearsandDays {
    private static final String errorMessage ="Invalid Value";
    public static void printYearsAndDays(long minutes){
        if (minutes<0){
            System.out.println(errorMessage);
        }
        else {
            long minutesInday = 24 * 60;
            long minutesInaYear = minutesInday * 365;
            long years = minutes/minutesInaYear;
            long remDaysInMinutes = minutes%minutesInaYear;
            long days = remDaysInMinutes/minutesInday;
            System.out.println(minutes + " min = "+ years +" y and "+ days+ " d");
        }
    }
}
