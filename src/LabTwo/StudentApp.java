package LabTwo;

public class StudentApp {
    public static void main(String[] args){
      Student stud1 = new Student("545685870","George");
      stud1.setCity("Athens");
      stud1.setPhone("6945686875");
      stud1.setState("Greece");
      System.out.println(stud1.toString());
      stud1.pay(2400.56);
      stud1.showCourses();
    }
}

class Student implements ICourses{
    //Properties of Student
    private static int iD = 1000;
    private String userId;          //ID + random 4-digit number + 4 last SSN numbers
    private String SSN;
    private String name;
    private String email;
    private String phone;
    private String state;
    private String city;
    double balance = 5000;     //The total number that a student should pay until the end of semester

    //Constructor
    public Student(String SSN, String name){
        this.SSN = SSN;
        this.name = name;
        this.email = setEmailId();
        setUserId();
        System.out.println("New account created with email: " + email);
        iD++;
    }

    private String setEmailId(){
        return name.substring(0,2) + "_" + iD + "@stud.data.com";

    }

    private void setUserId(){
        int random = (int) (Math.random() * 8001 +1000);
        int length = SSN.length();
        userId = iD + "" + random + SSN.substring(length-4,length);
        //System.out.println("Your User Id is: " + userId);
    }

    //Setters
    public void setPhone(String number){this.phone = number;}
    public void setState(String state){this.state = state;}
    public void setCity(String city){this.city = city;}

    public void pay(double amount){
        balance = balance - amount;
        checkBalance();
    }

    public void checkBalance(){
        System.out.println("Your balance is $" + balance);
    }

    @Override
    public void showCourses(){
        int i = courses.length;
        System.out.print("The available courses are: " + courses[0]);
        for (int j=1; j < i; j++) {
            System.out.print(", " + courses[j]);
        }
    }

    @Override
    public String toString(){
        return "[Name: " + name + "]\n[User ID: " + userId + "]\n[Email: " + email + "]\n[Phone: " + phone + "]\n[State: " + state + "]\n[City: " +city + "]";
    }

}
