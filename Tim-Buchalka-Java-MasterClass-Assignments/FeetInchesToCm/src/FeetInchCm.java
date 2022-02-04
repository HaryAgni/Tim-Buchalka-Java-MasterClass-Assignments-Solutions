public class FeetInchCm {
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if (feet>=0&&inches>=0&&inches<=12){
            double newInch = inches * 2.45;
            double newFeet = feet * 30.48;
            double centimeters = newInch + newFeet;
            System.out.println(feet+" Feet and "+ inches+ " inches into centimeters are = "+ centimeters+" cm");
            return centimeters;
        }
        else {
            System.out.println("Invalid");
            return -1;
        }
    }
    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches>=0){
            double feet = (int)inches/12;
            double newInches = (int)inches%12;
            System.out.println(inches+" inches are equal to "+ feet +" feet and " +newInches +" inches");
            return calcFeetAndInchesToCentimeters(feet,newInches);
        }
        else {
            System.out.println("Invalid");
            return -1;
        }
    }


}
