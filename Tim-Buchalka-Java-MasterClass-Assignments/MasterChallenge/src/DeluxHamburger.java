public class DeluxHamburger extends Hamburgers{
    private int chips;
    private int drinks;
   private int totalPrice;
    public DeluxHamburger(int meat,int chips,int drinks) {
        super("Delux Hamburger", meat, "Crunchy");
        int PriceOfChips = chips *5;
        int drinksPrice = drinks *25;
        totalPrice = super.getPrice()+PriceOfChips+drinksPrice;
    }

    @Override
    public int getPrice() {
        return totalPrice;
    }

    @Override
    public void isLettuce() {
        totalPrice = totalPrice+10;
    }

    @Override
    public void isTomato() {
        totalPrice = totalPrice+15;
    }

    @Override
    public void isOnion() {
        totalPrice=totalPrice+20;
    }

    @Override
    public void isCarrot() {
        totalPrice=totalPrice+30;
    }
}
