/*
•	Write a function that prints the numbers from 1 to 100; for multiples of
three print “Fizz” instead of the number, for multiples of five print “Buzz” 
instead of the number, and for numbers which are multiples of both three and 
five print “FizzBuzz”.
 */
package fizzbuzz;

import java.util.Scanner;

/**
 *
 * @author sandhu
 */
public class FizzBuzz {

    static int[] start_End_Value() {    // method to get values start and end into arrays

        int final_Info[] = new int[2];
        Scanner get_Value = new Scanner(System.in);

        System.out.println("enter start value");
        final_Info[0] = get_Value.nextInt();

        System.out.println("enter end value");
        final_Info[1] = get_Value.nextInt();

        return final_Info;

    }

    static boolean check_Values(int v1, int v2) {  // method to check if values are ok to be used
        boolean result = false;
        if (v1 >= 0 && v2 != 0 && v1 < v2) {
            result = true;
        }
        return result;
    }

    private static void fizzBuzz(int i) {     // method to figure out which values qualifies for fizzbuzz 
        if (i % 15 == 0) {
            System.out.println("FizzBuzz");
        } else if (i % 5 == 0) {
            System.out.println("Buzz");
        } else if (i % 3 == 0) {
            System.out.println("Fizz");
        } else {
            System.out.println(i);
        }
    }

    public static void main(String[] as) {                // main method to start and intiate program
        System.out.println("welcome to fizzbuzz");
        int values[] = start_End_Value();

        if (check_Values(values[0], values[1]) != false) {
            for (int i = values[0]; i < values[1]; i++) {
                fizzBuzz(i);
            }
        } else {
            System.out.println("something went wrong with values try again");

        }

    }
}
