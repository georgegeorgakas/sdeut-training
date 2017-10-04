package oop;

public class BankAccount implements Irate{
    //Define variables
    String accountNumber;

    //static >> belongs to the CLASS not the object instance
    //final >> constant (often static final)
    private static final String routingNumber = "0948842";
    private String name;
    private String SSN;
    String accountType;
    double balance;

    //Constructor definitions: unique methods
        //1. they are used to define and setup and initialize properties of an object
        //2. constructors are IMPLICITLY called upon INSTANTIATION
        //3. The same name as the class itself
        //4. Constructors have NO return type
    BankAccount(){
        System.out.println("New account created!!!");
    }

    //Overloading: call same method name with different arguments
    BankAccount(String accountType){
        System.out.println("New account: " + accountType);
    }

    BankAccount(String accountType, double initDeposit){
        System.out.println("New account: " + accountType);
        System.out.println("Initial Deposit of: " + initDeposit);
        if(initDeposit < 1000){
            String errorMsg= "ERROR: Minimum deposit must be at least 1000$";
            System.out.println(errorMsg);
        }
        balance = initDeposit;

    }

    //Getters / setters

    //Allow the user to define the name
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public String getSSN() {
        return SSN;
    }

    //Interface methods
    public void setRate(){
        System.out.println("SETTING RATE");
    }

    public void increaseRate(){
        System.out.println("INCREASE RATE");
    }

    //Define methods
    public void deposit(double amount){
        balance = balance + amount;
        showActivity("DEPOSIT");

    }

    void withdraw(double amount){
        balance = balance - amount;
        showActivity("WITHDRAW");
    }

    void checkBalance(){
        System.out.println("Balance: " + balance);
    }

    //Private: can only be called from within the class
    private void showActivity(String activity){
        System.out.println("Your recent transaction " +activity);
        System.out.println("Your new balance is: $" + balance);
    }

    void getStatus(){

    }

    @Override
    public String toString(){
        return "[NAME:" + name + ". ACCOUNT #" + accountNumber + ". ROUTING #" + routingNumber + ". Balance: $" + balance  + " ]";
    }
}
