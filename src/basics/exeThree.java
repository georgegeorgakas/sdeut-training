package basics;

public class exeThree {
    public static void main(String[] args){
        int array[] ={45,24,76,34,51};
        System.out.println("The smallest number of the array is " + min(array));
        System.out.println("The average number of the array is " + ave(array));
        System.out.println("The largest number of the array is " + max(array));
    }

    public static int min (int arr[]){
        int x = arr.length;
        int minimum = arr[0];
        for(int i=1; i<x; i++){
            if(minimum > arr[i]){
                minimum = arr[i];
            }
        }
        return minimum;
    }

    public static int ave (int arr[]){
        int x = arr.length;
        int average = arr[0];
        for(int j=1; j<x; j++){
            average = average + arr[j];
        }
        return average = average / 5;
    }

    public static int max (int arr[]){
        int x = arr.length;
        int maximum = arr[0];
        for(int i=1; i<x; i++){
            if(maximum < arr[i]){
                maximum = arr[i];
            }
        }
        return maximum;
    }
}
