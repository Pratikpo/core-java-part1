package encapsulation;

public class Driver {
    public static void main(String[] args) {
        // Creating an instance of the BankAccount class
        BankAccount account = new BankAccount();

        // Accessing and modifying data using public methods
        account.setAccountNumber("1234567890");
        account.setBalance(20000);
        account.setOwnerName("pratik powar");
        account.setOwnerAddress("kolhapur");
        System.out.println(account.getOwnerName());

        // Printing account details
        System.out.println(account);

    }
}