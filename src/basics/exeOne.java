package basics;

public class exeOne {
    public static void main(String[] args){
        int i = 5;
        System.out.println("The sum from 1 to " + i + " is " + sum(i) );
    }

    public static int sum(int n){
        int k = n;
        for(int i=1; i<n; i++){
            k = k + i;
        }
        return k;
    }
}
