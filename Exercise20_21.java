import java.util.Arrays;
import java.util.Scanner;

//This will be our main class for this exercise

public class Exercise20_21 {
    //Our main caller
    public static void main(String[] args) {

        //Creates the scanner to use for user input
        Scanner scan = new Scanner(System.in);

        //Creates the array list and caps it at 6 strings
        String[] sixStrings = new String[6];

        //Add welcome message
        System.out.println("Please enter 6 strings to sort by their last character.");

        //Add a for loop to repeadetly ask for input from the user while indexing
        //the string and adding it to the array. Also let them know what number they are on.
        for (int i = 0; i < 6; i++) {
            //Displays message for indexing
            System.out.println("Please enter string "+ (i+1) );

            //Adds users input into array at position in for loop
            sixStrings[i] = scan.next();
        }

        //Create the sort method using charAt and placement of (-1) for last char. Next create
        //the two strings to use in the comparator.compare method using s1 and s2.
        Arrays.sort(sixStrings, (s1, s2) -> s1.charAt(s1.length()-1) - s2.charAt(s2.length() -1));

        //Print out the new sorted list
        System.out.println("Your sorted list of strings by their last character is listed below: ");

        //Create a for loop to print out the new sorted list
        for (String sortedStrings : sixStrings) {
            System.out.print(sortedStrings + " ");

        }
        scan.close();
    }
}