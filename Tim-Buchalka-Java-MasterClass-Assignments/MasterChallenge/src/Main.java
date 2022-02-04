public class Main {
    public static void main(String[] args) {
        Hamburgers hamburgers = new Hamburgers("delux",1,"unlnown");
        System.out.println(hamburgers.getPrice());
        HealthyBurger healthyBurger = new HealthyBurger(1,true,false);
        System.out.println(healthyBurger.getPrice());
        healthyBurger.isLettuce();
        healthyBurger.isOnion();
        System.out.println(healthyBurger.getPrice());
        DeluxHamburger deluxHamburger = new DeluxHamburger(1,1,1);
        deluxHamburger.isCarrot();
        System.out.println(deluxHamburger.getPrice());
        HealthyBurger healthyBurger1 = new HealthyBurger(1,false,false);
        int a = healthyBurger1.getPrice();
        System.out.println(a);
    }
}
