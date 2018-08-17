import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter something");
        String userInput = sc.nextLine();
        System.out.println("You entered " + "\"" + userInput + "\"");
        System.out.println("\"" + userInput + "\"" + " " + returnNumMessage(userInput));
        System.out.println("Flipped case: " + StringUtils.swapCase(userInput));
        System.out.println("Reversed: " + StringUtils.reverse(userInput));
    }

    public static String returnNumMessage(String input) {
        return (StringUtils.isNumeric(input)) ? "is a number" : "is not a number";
    }
}


//    Enter Something: Life, The Universe, and Everything
//    You Entered: "Life, The Universe, and Everything"
//    "Life, The Universe, and Everything" is not a number
//    Flipped Case: lIFE, tHE uNIVERSE, AND eVERYTHING
//    Reversed: gnihtyrevE dna ,esrevinU eht ,efiL