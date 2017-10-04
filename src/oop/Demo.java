package oop;

class Person{
    String name;
    String email;
    String phone;

    void walk(){
        System.out.println(name + "is walking");
    }

    void eat(){
        System.out.println(email);
    }

    void sleep(){
        System.out.println(name + "is sleeping");
    }
}

public class Demo {
    public static void main(String[] args){

        //Instantiating an object
        Person person1 = new Person();

        //Define properties
        person1.name = "George";
        person1.email = "gege@gma.com";
        person1.phone = "645446";

        //Abstraction
        person1.eat();
        person1.sleep();
        person1.walk();

        /*
        //Person-

        //Attributes, variables, objectives, descriptions
        String name = "George";
        String email = "george@gmail.com";
        String phone = "6946422214";

        //Action, activity, behavior
        System.out.println(name + "is walking");
        System.out.println(name + "is eating");
    }

    //Enhance by adding functions to minimize code
    static void walking(String name){
        System.out.println(name + "is walking");
     */

    }
}
