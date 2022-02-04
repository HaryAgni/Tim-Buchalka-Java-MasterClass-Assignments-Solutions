import javax.print.DocFlavor;
import java.util.Scanner;

public class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.engine =true;
        this .wheels =4;
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }
    public String startEngine(){
        return "engine started";
    }
    public String accelerate(){
        return "accelerating";
    }
    public String brake(){
        return "stop the car";
    }
}

class Alto extends Car{
    public Alto(int cylinders) {
        super("swift", cylinders);
    }

    @Override
    public boolean isEngine() {
        return super.isEngine();
    }

    @Override
    public String startEngine() {
        return "alto start";
    }


    @Override
    public String accelerate() {
        return "alto accelerate";
    }

    @Override
    public String brake() {
        return "alto brake";
    }
}
class Tata extends Car{

    public Tata(int cylinders) {
        super("tata", cylinders);
    }

    @Override
    public String startEngine() {
        return "tata start";
    }

    @Override
    public String accelerate() {
        return "tata accelarte";
    }

    @Override
    public String brake() {
        return "tata brake";
    }
}
class Scorpio extends Car{

    public Scorpio(int cylinders) {
        super("scorpio", cylinders);
    }

    @Override
    public String startEngine() {
        return "scorpio start";
    }

    @Override
    public String accelerate() {
        return "scorpio accelerate";
    }

}
class Main {
    public static void main(String[] args) {
        Alto alto = new Alto(4);
        Tata tata = new Tata(2);
        Scorpio scorpio = new Scorpio(6);
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter Number");
        int num = scanner.nextInt();
        scanner.nextLine();
        switch (num){
            case 1:
                System.out.println("startEngine= "+alto.startEngine()+" accelerate= "+ alto.accelerate()+" brake= "+ alto.brake());
                System.out.println(alto.getName());
                break;
            case 2:
                System.out.println("startEngine= "+tata.startEngine()+" accelerate= "+ tata.accelerate()+" brake= "+ tata.brake());
                break;
            case 3:
                System.out.println("startEngine= "+scorpio.startEngine()+" accelerate= "+ scorpio.accelerate()+" brake= "+ scorpio.brake());
        }


    }
}