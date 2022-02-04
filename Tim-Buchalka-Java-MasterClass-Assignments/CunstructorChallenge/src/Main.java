public class Main {
    public static void main(String[] args) {
        VipCustomers customer1 = new VipCustomers();
        System.out.println(customer1.getName());
        VipCustomers customer2 = new VipCustomers(100000,"haryagni123@gmail.com");
        System.out.println(customer2.getName()+" "+customer2.getCreditLimit()+" "+customer2.getEmailAddress());
        VipCustomers customer3 = new VipCustomers("Harshit",500,"harshit@gmail.com");
        System.out.println(customer3.getName());
        System.out.println(customer3.getCreditLimit());
        System.out.println(customer3.getEmailAddress());

    }
}
