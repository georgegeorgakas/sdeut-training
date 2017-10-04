package basics;

public class NumbersCalc {
    public static void main(String[] args){
        printName();
        int numA = 10;
        int numB = 20;
        addNumbers(numA, numB);
        int product = multipleNumbers(numA, numB);
        //System.out.println("The product of numbers is " + multipleNumbers(numA, numB));
        System.out.println("The product of numbers is " + product);
    }
    static void printName(){
        System.out.println("My name is Tim");
    }

    static void addNumbers(int nubmerA, int nubmerB){
        //This function will add 2 numbers
        int sum = nubmerA + nubmerB;
        System.out.println("The sum of numbers " + nubmerA + " and " + nubmerB + " is " + sum);
    }

    static int multipleNumbers(int valueA, int valueB){
        int product = valueA * valueB;
        addNumbers(product,product);
        return product;
    }
}
