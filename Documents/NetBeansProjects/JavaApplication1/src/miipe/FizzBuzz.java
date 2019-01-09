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
    
int[] start_End_Value(){
    
    int final_Info[]=new int[1];
    Scanner get_Value=new Scanner(System.in);
    
        System.out.println("enter start value");
        final_Info[0]=get_Value.nextInt(); 
        
        System.out.println("enter end value");
        final_Info[1]=get_Value.nextInt(); 
        
    return final_Info;

}     
public static void main(String[] as)
{
int a[]=new int[1];



}
}
