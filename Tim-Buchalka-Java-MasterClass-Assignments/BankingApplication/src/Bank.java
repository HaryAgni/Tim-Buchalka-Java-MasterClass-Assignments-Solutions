import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> newBranch;

    public Bank(String name) {
        this.name = name;
        this.newBranch = new ArrayList<>();
    }
    public boolean addNewBranch(String branchName){
        if (findBranch(branchName)==null){
            newBranch.add(new Branch(branchName));
            return true;
        }
        else return false;
    }
    public boolean addNewCustomer(String branchName, String customerName, double initialTransaction){
        Branch existingBranch = findBranch(branchName);
        if (existingBranch!=null){
            return existingBranch.addNewCustomer(customerName,initialTransaction);
        }
        return false;
    }
    private Branch findBranch(String name){
        for (int i =0; i< newBranch.size();i++){
            Branch branch = newBranch.get(i);
            if (branch.getName().equals(name)){
                return branch;
            }
        }
        return null;
    }
    public boolean addBranchCustomerTransaction(String branchName, String customerName, double amountToAdd){
        Branch branch = findBranch(branchName);
        if (branch!=null){
           return branch.addTransactions(customerName,amountToAdd);
        }
        return false;
    }
    public boolean showBranchCustomers(String branchName, boolean transactions){
        Branch branch = findBranch(branchName);
        if (branch!=null){
            System.out.println("Customer details for branch "+branch.getName());
            ArrayList<Customer> customerDetails = branch.getNewCustomer();
            for (int i =0; i<customerDetails.size();i++) {
                Customer customer = customerDetails.get(i);
                System.out.println("[ "+(i+1)+" ] "+customer.getName());
                if (transactions){
                    ArrayList<Double> transactionsDetails = customer.getTransactions();
                    System.out.println("Transactions");
                    for (int j = 0; j<transactionsDetails.size();j++){
                        System.out.println("Transaction: [ "+(j+1)+" ] "+transactionsDetails.get(j));
                    }
                }
            }
            return true;
        }
        else return false;
    }
}
