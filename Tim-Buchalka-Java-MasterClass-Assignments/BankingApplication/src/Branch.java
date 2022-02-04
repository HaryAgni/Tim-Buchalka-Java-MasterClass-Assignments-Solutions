import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> newCustomer;

    public Branch(String name) {
        this.name = name;
        this.newCustomer = new ArrayList<>();
    }

    public ArrayList<Customer> getNewCustomer() {
        return newCustomer;
    }

    public String getName() {

        return name;
    }
     public boolean addNewCustomer(String customerName, double transactionAmount){
        if (findCustomer(customerName)==null){
            this.newCustomer.add(new Customer(customerName,transactionAmount));
            return true;
        }
        return false;
     }
     public boolean addTransactions(String customerName, double transactionAmount){
        Customer existingCustomer = findCustomer(customerName);
        if (existingCustomer!=null){
            existingCustomer.addTransaction(transactionAmount);
            return true;
        }
        return false;

     }
     private Customer findCustomer(String customerName){
        for (int i =0; i<newCustomer.size(); i++){
            Customer checkCustomer = newCustomer.get(i);
            if (checkCustomer.getName().equals(customerName)){
                return checkCustomer;
            }
        }
        return null;
     }
}
