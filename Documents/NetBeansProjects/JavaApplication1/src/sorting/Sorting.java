/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.Scanner;

/**
 *
 * @author sandhu
 */
public class Sorting {

    static int[] arrayof_Value() {    // method to get values start and end into arrays

        Scanner get_Value = new Scanner(System.in);
        System.out.println("enter how many values");
        int max_values = get_Value.nextInt();

        int array[] = new int[max_values];
        System.out.println("enter value");
        for (int i = 0; i < max_values; i++) {

            array[i] = get_Value.nextInt();
            System.out.print(", ");
        }

        return array;

    }

   static void display_array(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }

    static int[] bubble_Sort(int[] array) {

        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < (array.length - i); j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }

            }

        }
        return array;
    }

    public static void main(String[] as) {

        System.out.println("welcome to sorting program");
        int[] unsorted_Array = arrayof_Value();
        System.out.println("before sorting values in array");
        display_array(unsorted_Array);
        
        int[] sorted_Array=bubble_Sort(unsorted_Array);
        System.out.println("after sorting values in array");
        display_array(sorted_Array);

    }

}
