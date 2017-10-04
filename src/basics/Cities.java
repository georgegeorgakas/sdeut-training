package basics;

public class Cities {
    public static void main(String[] args){
        //Declare and define an array
        String[] cities = {"New York", "Athens", "Kalamata"};
        System.out.println(cities[0]);

        //Declare the array(only size)
        String[] states = new String[5];
        states[0] = "Athens";
        states[1] = "Ohio";
        states[2] = "Texas";
        states[3] = "Utah";
        states[4] = "cali";

        System.out.println("********************");
        //Declare the array
        String[] countries;

        //Define array
        countries = new String[3];
        countries[0] = "USA";
        countries[1] = "Greece";
        countries[2] = "UK";
        int i=0;

        //Do loop: Enters the loop THEN tests the condition
        do {
            System.out.println(countries[i]);
            i++;
        }while (i<3);

        //While loop: tests condition first then enters loop
        int j = 0;
        while(j<3){
            System.out.println("Countries at " + j + ": " + countries[j]);
            j++;
        }

        System.out.println("\nPrinting with FOR loop\n");
        //For loop: best structure for iterating through an array
        for (int k = 0; k < 3; k++){
            System.out.println(countries[k]);
        }
    }
}
