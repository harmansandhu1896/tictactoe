
package tictactoe;

import java.util.Scanner;

/**
 *
 * @author sandhu
 */
public class Tictactoe {
    
    private char[][] board;
    private  String currentPmark;
    private  String currentAimark;

    public String getCurrentAimark() {
        return currentAimark;
    }

    public void setCurrentPmark(String currentPmark) {
        this.currentPmark = currentPmark;
    }

    public void setCurrentAimark(String currentAimark) {
        this.currentAimark = currentAimark;
    }
 
    public String getCurrentPmark() {
        return currentPmark;
    }
    
    
    public Tictactoe()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("enter your symbol");
        this.currentPmark = (input.next());
        System.out.print("enter AI's symbol");
        this.currentAimark = (input.next());
        board = new char[3][3];
        intializeGameMark(currentPmark, currentAimark);
        intializeBoard();
    }
    


    private void intializeGameMark(String currentPmark,String currentAimark) {
       
    
    }

    private void intializeBoard() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
