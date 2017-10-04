package oop;

public class BankAccountApp{
    public static void main(String[] args){
        //Creating a new bank account >> thins instantiate an object

        BankAccount acc1 = new BankAccount();

        //acc1.name = "George";
        //With Encapsulation : public API methods
        acc1.setName("Roger Hue");
        System.out.println(acc1.getName());

        acc1.accountNumber = "54867650";
        acc1.balance = 10000;

        acc1.setSSN("3434343");
        System.out.println(acc1.getSSN());

        acc1.setRate();
        acc1.increaseRate();

        acc1.deposit(1500);
        acc1.deposit(1500);
        acc1.deposit(1500);
        acc1.withdraw(2000);

        //Polymorphism through overriding
        System.out.println(acc1.toString());


        //Polymorphism through overloading
        BankAccount acc2 = new BankAccount("Checking account");

        BankAccount acc3 = new BankAccount("Saving account", 5000);

        /*
        //Demo for inheritance
        CDAccount cd1 = new CDAccount();
        cd1.balance = 3000;
        cd1.interestRate = "4.5";
        cd1.name = "juan";
        cd1.accountType = "CD acount";
        System.out.println(cd1.toString());
        cd1.compount();
        */
    }
}
