public class HealthyBurger extends Hamburgers{
    private boolean cabbage;
    private boolean cuccumber;
    private int healthyPrice = super.getPrice();
    public HealthyBurger(int meat,boolean cabbage,boolean cuccumber) {
        super("Healthy Burger", meat, "Brown Bread");
        if (isCabbage(cabbage)){
            healthyPrice= super.getPrice()+20;
        }
        if (isCuccumber(cuccumber)){
            healthyPrice = super.getPrice()+30;
        } 

    }
    public boolean isCuccumber(boolean cuccumber){
        return cuccumber;
    }
    public boolean isCabbage(boolean cabbage){
        return cabbage;
    }

    @Override
    public int getPrice() {
        return healthyPrice;
    }

    @Override
    public void isLettuce() {
        healthyPrice = healthyPrice+10;
    }

    @Override
    public void isTomato() {
        healthyPrice= healthyPrice+15;
    }

    @Override
    public void isOnion() {
        healthyPrice = healthyPrice+20;
    }

    @Override
    public void isCarrot() {
        healthyPrice = healthyPrice+30;
    }
}
