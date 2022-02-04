public class BankAccount {
    private long accountNumber;
    private long balance;
    private String customerName;
    private String email;
    private long phoneNumber;

    public BankAccount() {
        this(123,000,"Harshit","haryagni123@gmail.com", 93689161);
    }

    public BankAccount(long accountNumber, long balance, String customerName, String email, long phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double amountToBeDeposited){
        this.balance+=amountToBeDeposited;
        System.out.println("Balance has been updated and current balance is: "+balance);
    }
    public void widthraw(double amount){
        if (balance<amount){
            System.out.println("Insufficient Balance");
        }
        else {
            balance-=amount;
            System.out.println(amount+" of amount has been widhrawed and current balance is: "+balance);
        }
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
