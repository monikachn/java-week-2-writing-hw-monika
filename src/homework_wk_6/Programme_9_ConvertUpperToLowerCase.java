package homework_wk_6;
/**
 *  Write a program to convert the upper case to lower case.
 */

import java.util.Scanner;

public class Programme_9_ConvertUpperToLowerCase {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
      Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the upper case string : ");
        String uppercase = scanner.nextLine();
        Programme_9_ConvertUpperToLowerCase t = new Programme_9_ConvertUpperToLowerCase();
        t.convertUppercaseToLowerCase(uppercase);
        // closing the scanner.
    }
    //Conversion of Uppercase to Lower case method
    public void convertUppercaseToLowerCase(String text) {
        System.out.println("The Lowercase value is = " + text.toLowerCase());
    }

}
