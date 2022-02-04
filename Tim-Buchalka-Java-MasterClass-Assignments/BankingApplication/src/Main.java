public class Main {
    // You job is to create a simple banking application.
    // There should be a Bank class
    // It should have an arraylist of Branches
    // Each Branch should have an arraylist of Customers
    // The Customer class should have an arraylist of Doubles (transactions)
    // Customer:
    // Name, and the ArrayList of doubles.
    // Branch:
    // Need to be able to add a new customer and initial transaction amount.
    // Also needs to add additional transactions for that customer/branch
    // Bank:
    // Add a new branch
    // Add a customer to that branch with initial transaction
    // Add a transaction for an existing customer for that branch
    // Show a list of customers for a particular branch and optionally a list
    // of their transactions
    // Demonstration autoboxing and unboxing in your code
    // Hint: Transactions
    // Add data validation.
    // e.g. check if exists, or does not exist, etc.
    // Think about where you are adding the code to perform certain actions
    public static void main(String[] args) {
        Bank bank = new Bank("State Bank of India");
        bank.addNewBranch("Mainpuri");
        bank.addNewBranch("Bhongaon");
        bank.addNewCustomer("Mainpuri","Ankit",22.6);
        bank.addNewCustomer("Mainpuri","ankur",76.7);
        bank.addNewCustomer("Bhongaon","Harshit",100.6);
        bank.addBranchCustomerTransaction("Mainpuri","Ankit", 45.9);
        bank.addBranchCustomerTransaction("Mainpuri","Ankit", 90.9);
        bank.addBranchCustomerTransaction("Mainpuri","Ankit", 45.9);
        bank.showBranchCustomers("Mainpuri",true);
        bank.showBranchCustomers("Bhongaon",true);
    }
}
