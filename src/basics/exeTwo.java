package basics;

public class exeTwo {
    public static void main(String[] args){
        int k = 5;
        System.out.println("The factorial number of " + k + " is " + fac(k));
    }

    public static int fac(int f){
        if(f == 0){
            return 1;
        }
        else if (f == 2){
            return 2;
        }
        return fac(f-1) * f;
    }
}
