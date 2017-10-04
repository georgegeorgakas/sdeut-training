package basics;

public class Strings {
    public static void main(String[] args){
        String bookTitle;
        String wordChoice = "rings";
        bookTitle = "The Lord of the rings";
        if(bookTitle.contains(wordChoice)){
            System.out.println("The book contains the word " + wordChoice);
        }

        String browser = "Chrome";
        if(browser.equalsIgnoreCase("chrome")){
            System.out.println("The browser is chrome");
        }

        String firstName = "George";
        String lastName = "Georgakas";
        String SSN = "582846484";

        System.out.println("There are " + SSN.length() + " digits in your SSN.\n");
        //Print the initials plus last 4 digits of SSN
        System.out.print(firstName.substring(0, 1));
        System.out.print(lastName.substring(0, 1));
        System.out.print(SSN.substring(5));
    }
}
