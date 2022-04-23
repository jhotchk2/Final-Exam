package exercise21_9.java;

import java.util.Map;
import java.util.Scanner;

public class Exercise21_9 {
    public static void main(String[] args) {
        // Create a scanner
        Scanner input = new Scanner(System.in);
        mapData mapdata = new mapData();

        // Store 50 states and their capitals from getData();
        Map<String, String> statesAndCapitals = mapdata.getData();

        // Prompt the user to enter a state
        System.out.print("Enter a state: ");
        String state = input.nextLine();

        // Display the capital for the state
        if (statesAndCapitals.get(state) != null) {
            System.out.println("The capital of " + state + " is " + statesAndCapitals.get(state));
        }
    }

}