public class VipCustomers {
    private String name;
    private long creditLimit;
    private String emailAddress;

    public VipCustomers() {
        this("default name", 1000, "No email Address");
    }

    public VipCustomers(long creditLimit, String emailAddress) {
        this("default name",creditLimit,emailAddress);


    }

    public VipCustomers(String name, long creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public long getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
