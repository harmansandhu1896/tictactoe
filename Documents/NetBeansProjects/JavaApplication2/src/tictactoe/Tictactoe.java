
package tictactoe;

/**
 *
 * @author sandhu
 */
public class Tictactoe {
    
    private char[][] board;
    private char currentPmark;

    public char getCurrentPmark() {
        return currentPmark;
    }
    
    
 public Tictactoe(){
 board= new char[3][3];
 intializeGameMark();
 intializeBoard();
 }

    private void intializeGameMark() {
       
    
    }

    private void intializeBoard() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
