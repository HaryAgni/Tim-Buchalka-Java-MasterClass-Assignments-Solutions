public class Main {
    public static void main(String[] args) {
        BankAccount harshit = new BankAccount();
        harshit.setBalance(100);
        harshit.deposit(500);
        harshit.widthraw(200);
        BankAccount dhawan = new BankAccount();
        dhawan.setCustomerName("Dhawan");
        System.out.println(dhawan.getCustomerName()+" has "+dhawan.getBalance()+" balance in his account");
    }
}
