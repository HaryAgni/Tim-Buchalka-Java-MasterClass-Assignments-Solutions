public class SecondsAndMinutes {
    private static final String INVALID_INPUT = "Invalid Value";
    public static void getDurationString(int minutes,int seconds){
        if (minutes>=0&&seconds>=0&&seconds<=59){
            int hours =(minutes/60);
            int remMinutes = (minutes%60);
            String print = HSMStrings(hours)+"H "+HSMStrings(remMinutes)+"M "+HSMStrings(seconds)+"S ";
            System.out.println(print);

        }
        else {
            System.out.println(INVALID_INPUT);
        }
    }
    public static void getDurationString(int seconds){
        if(seconds>=0) {
            int minutes = seconds / 60;
            int newSeconds = seconds % 60;
            getDurationString(minutes, newSeconds);
        }
        else {
            System.out.println(INVALID_INPUT);
        }
    }
    public static String HSMStrings(int num){
        String a = num+"";
        if (num<10){
            a = 0+a;
            return a;
        }
        return a;

    }
}
