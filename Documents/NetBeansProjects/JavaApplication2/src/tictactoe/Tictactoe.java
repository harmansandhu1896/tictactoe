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
    private String currentTurn;

    public String getCurrentTurn() {
        return currentTurn;
    }

    public void setCurrentTurn(String currentTurn) {
        this.currentTurn = currentTurn;
    }

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

    public void printBoard() {

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                if (j != 2) {
                    System.out.print(board[i][j] + " | ");
                } else {

                    System.out.print(board[i][j]);

                }
            }
            System.out.println();
        }
    }

    public boolean boardFull() {
        boolean isTrue = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {// see if the - still exist means place is empty and full board is traversed

                    isTrue = false;

                }

            }
        }
        return isTrue;
    }

    public boolean winCriteria() {
        return (rowCheck() || columnCheck() || diagonalCheck());
    }


    private boolean rowCheck() {
        for (int i = 0; i < 3; i++) {
            if (checkCondition(board[i][0], board[i][1], board[i][2]) == true) {
                return true;
            }
        }
        return false;
    }

    private boolean diagonalCheck() {
        return (checkCondition(board[0][0], board[1][1], board[2][2]) == true
        ||(checkCondition(board[0][2], board[1][1], board[2][0])==true));
    }

    private boolean columnCheck() {
        for (int i = 0; i < 3; i++) {
            if (checkCondition(board[0][i], board[1][i], board[2][i]) == true) {
                return true;
            }
        }
        return false;
    }

    private boolean checkCondition(char cn1, char cn2, char cn3) {
        return (cn1 != '-') && (cn1 == cn2) && (cn2 == cn3);
    }
    
    public void switchPlayer(){
    if(currentTurn.equals(getCurrentPmark()))
    {
    currentTurn=getCurrentAimark();
    }
    else
        currentTurn=getCurrentPmark();
    
    }
        public static void main(String as[]) {
        Tictactoe ttt = new Tictactoe();
    }
}
