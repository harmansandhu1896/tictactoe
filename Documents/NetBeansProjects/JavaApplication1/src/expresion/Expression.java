/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expresion;

import java.util.Scanner;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 *
 * @author sandhu
 */
public class Expression {

   static String get_expression() {

        Scanner get_Value = new Scanner(System.in);
        System.out.println("enter expression");
        String input_Expression = get_Value.next();

        return input_Expression;
    }

    public static void main(String[] args) throws ScriptException {
        try {
            ScriptEngineManager mgr = new ScriptEngineManager();
            ScriptEngine engine = mgr.getEngineByName("JavaScript");
            String value =get_expression();
            System.out.println(engine.eval(value));

        } catch (ScriptException ae) {
        }

    }
}
