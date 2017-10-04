package oop;

public class CDAccount extends BankAccount implements Irate{
    String interestRate;

    void compount(){
        System.out.println("Compounding interest");
    }
}
