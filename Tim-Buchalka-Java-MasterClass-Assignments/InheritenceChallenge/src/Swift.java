public class Swift extends Car{
    private int roadService;

    public Swift(int roadService) {
        super("Swift", "4WD", 4, 5, 6, false);
        this.roadService = roadService;
    }
    public void accelerate(int rate){
        int newVelocity = getCurrentVelocity()+rate;
        if (newVelocity==0){
            stop();
        }
        else if (newVelocity>0&&newVelocity<=10){
            changeGear(1);
        }
        else if (newVelocity>10&&newVelocity<=20){
            changeGear(2);
        }
        else if (newVelocity>20&&newVelocity<=30) {
            changeGear(3);
        }
        else if (newVelocity>30&&newVelocity<=40) {
            changeGear(4);
        }
        else if (newVelocity>40&&newVelocity<=50) {
            changeGear(5);
        }
        else {
            changeGear(6);
        }
        if (newVelocity>0){
            changeVelocity(newVelocity,getCurrentDirection());
        }
    }
}
