public class Hamburgers {
    private String name;
    private int price =50;
    private int meat;
    private String rollType;

    public Hamburgers(String name,int meat, String rollType) {
        this.name = name;
        this.meat = meat;
        this.rollType = rollType;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getMeat() {
        return meat;
    }

    public String getRollType() {
        return rollType;
    }

    public void isLettuce(){
        this.price+=10;
    }
    public void isTomato(){
        this.price+=15;
    }
    public void isOnion(){
        this.price+=20;
    }
    public void isCarrot(){
        this.price+=30;
    }
}
