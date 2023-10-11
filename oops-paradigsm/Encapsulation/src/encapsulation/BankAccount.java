package encapsulation;

/*Encapsulation is a mechanism of wrapping the data (instance variables) and code acting on the data
(instance methods) together as a single unit(i.e. class).*/

//Class is representation of objects-
//Each object has properties/field and behaviour/method
//fields -> private
//for each field has public getter and setter
//Now class is like protected shield.
//The object's fields are not directly accessible to other classes of same package or outside package.
//Encapsulation is also called data hiding
public class BankAccount {

    // Private fields - encapsulated data
   private String accountNumber;//data hiding
    private double balance;
    private String ownerName;
    private String ownerAddress;

    // Public constructor
    public BankAccount() {

    }

    // Public getter methods - providing controlled access to private fields


    public String getAccountNumber() {

        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerAddress() {
        return ownerAddress;
    }

    public void setOwnerAddress(String ownerAddress) {
        this.ownerAddress = ownerAddress;
    }


    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", ownerName='" + ownerName + '\'' +
                ", ownerAddress='" + ownerAddress + '\'' +
                '}';
    }

}