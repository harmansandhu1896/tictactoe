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

        int unsortedArray[] = new int[max_values];
        System.out.println("enter value");
        for (int i = 0; i < max_values; i++) {

            unsortedArray[i] = get_Value.nextInt();
            System.out.print(", ");
        }

        return unsortedArray;

    }

    static int[] bubble_Sort(int[] sortedarray) {

        int temp;
        for (int i = 0; i < sortedarray.length; i++) {
            for (int j = 1; j < (sortedarray.length - i); j++) {
                if (sortedarray[j - 1] > sortedarray[j]) {
                    temp = sortedarray[j - 1];
                    sortedarray[j - 1] = sortedarray[j];
                    sortedarray[j] = temp;
                }

            }

        }
        return sortedarray;
    }

    public static void main(String[] as){
    
    
    
    
    }
    
    
}
