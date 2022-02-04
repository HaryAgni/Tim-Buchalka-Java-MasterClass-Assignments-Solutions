public class MilesPerHour {
    public static long toMilesPerHour(double KilometersPerHour){
        if (KilometersPerHour<0){
            return -1;
        }
        double milesPerHour = KilometersPerHour * 0.621;
        long convertedMiles = Math.round(milesPerHour);
        return convertedMiles;

    }
    public static void printConversion(double Kilometers){
        if (Kilometers<0){
            System.out.println("Invalid Input");
        }
        else {
            long conversion = toMilesPerHour(Kilometers);
            System.out.println(Kilometers + "km/h = "+ conversion + "mi/h ");
        }
    }

}
