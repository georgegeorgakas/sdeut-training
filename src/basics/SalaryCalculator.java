package basics;

public class SalaryCalculator {
    public static void main(String[] args){
        //Let's create a variable to define our career

        //Declare a variable
        String career;
        System.out.println("Program is starting");

        //Define a variable
        career = "Software Developer";
        System.out.println("My career is: " + career);

        //Declare and Define
        int hourPerWeek = 40;
        int weekPerYear = 50;
        double rate = 42.50;

        double salary = hourPerWeek * weekPerYear * rate;
        System.out.println("My salary as a " + career + " at the rate of $" + rate + " per hour is $" + salary + " per year.");

        //Computer our annual salary
        //rate*hoursPerWeek * weeksPerYear
    }
}
