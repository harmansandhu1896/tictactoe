/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverseSentence;

import java.util.Scanner;

/**
 *
 * @author sandhu
 */
public class Reverse {

    static String get_Expression() { // method to get expression from user

        Scanner get_Value = new Scanner(System.in);
        System.out.println("enter expression");

        String input_Expression = get_Value.next();

        return input_Expression;
    }

    static String[] split_Function(String str) {

        String[] str_Split = str.split("\\s");

        return str_Split;
    }

    static String[] reverse_sentence(String[] str) {
        for (int i = 0; i < str.length / 2; i++) {
            String temp = str[i];
            str[i] = str[str.length - 1 - i];
            str[str.length - 1 - i] = temp;
        }
        return str;
    }

    static void reverse_string(String[] str) {
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + " ");
        }

    }

    public static void main(String[] as) {
        String input_String = get_Expression();
        String[] after_split = split_Function(input_String);
        String[] after_reverse = reverse_sentence(after_split);
        reverse_string(after_reverse);
    }
}
