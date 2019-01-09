/*
•	Write a function that prints the numbers from 1 to 100; for multiples of
three print “Fizz” instead of the number, for multiples of five print “Buzz” 
instead of the number, and for numbers which are multiples of both three and 
five print “FizzBuzz”.
 */
package miipe;

import java.util.Scanner;

/**
 *
 * @author sandhu
 */
public class FizzBuzz {

    static int[] start_End_Value() {

        int final_Info[] = new int[1];
        Scanner get_Value = new Scanner(System.in);

        System.out.println("enter start value");
        final_Info[0] = get_Value.nextInt();

        System.out.println("enter end value");
        final_Info[1] = get_Value.nextInt();

        return final_Info;

    }

    static boolean check_Values(int v1, int v2) {
        boolean result = false;
        if (v1 >= 0 && v2 != 0 && v1 < v2) {
            result = true;
        }
        return result;
    }

    public static void main(String[] as) {
        int values[] = start_End_Value();

        if (check_Values(values[0], values[1]) != false) {
            for (int i = values[0]; i < values[1]; i++) {
             fizzBuzz(i);
            }

        }

    }

    private static void fizzBuzz(int i) {
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
}
