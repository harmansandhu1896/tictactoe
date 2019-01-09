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

        int final_Info[] = new int[max_values];
        for (int i = 0; i < max_values; i++) {
            System.out.println("enter start value");
            final_Info[i] = get_Value.nextInt();
        }

        return final_Info;

    }
}
