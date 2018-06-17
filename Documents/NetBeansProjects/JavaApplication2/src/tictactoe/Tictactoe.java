package tictactoe;

import java.util.Scanner;

/**
 *
 * @author sandhu
 */
public final class Tictactoe {

    private final char[][] board;
    private String currentPmark;
    private String currentAimark;

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

    public Tictactoe() {
        Scanner input = new Scanner(System.in);
        System.out.print("enter your symbol");
        this.currentPmark = (input.next());

        System.out.print("enter AI's symbol");
        this.currentAimark = (input.next());

        board = new char[3][3];
        intializeGameMark(currentPmark, currentAimark);
        intializeBoard();
        printBoard();
    }

    private void intializeGameMark(String currentPmark, String currentAimark) {
        setCurrentAimark(currentAimark);
        setCurrentPmark(currentPmark);
        System.out.println(" you selected " + currentAimark + " and " + currentPmark);
    }

    public void intializeBoard() {
        int j, i;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {

                board[i][j] = '-';

            }

        }


    }
    public void printBoard(){
    
        for (int i = 0; i < 3; i++) {
            
            for (int j = 0; j < 3; j++){
                if(j!=2){
            System.out.print(board[i][j]+" | " );
               }
                else{
                   
                    System.out.print(board[i][j]);
                    
                    }
            } System.out.println();
            }
            }
    
    public boolean boardFull(){
    boolean isTrue=true;
    for(int i=0;i<3;i++){
    for(int j=0;j<3;j++){
    if(board[i][j]=='-'){
    isTrue=false;
    
    }
    
    }
    }
    
    return isTrue;
    }
        
    
    
    

    public static void main(String as[]) {
        Tictactoe ttt = new Tictactoe();
    }
}
