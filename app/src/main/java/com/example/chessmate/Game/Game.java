package com.example.chessmate.Game;

import com.example.chessmate.Activity.GameActivity;
import com.example.chessmate.Activity.StartActivity;
import com.google.android.material.textfield.TextInputEditText;

import java.util.Scanner;

public class Game {

    StartActivity stAct = new StartActivity();
    GameActivity gameAct = new GameActivity();

    public int fromRow, fromCol, toRow, toCol;
    public boolean stopTheGame = false;
    public char playerTurn = Values.WHITE;

    public Grid grid = new Grid();
    public Pieces pieces = new Pieces(this);

    public boolean whiteKingNotMoved = true;
    public boolean blackKingNotMoved = true;
    public boolean whiteRookNotMovedA = true;
    public boolean whiteRookNotMovedH = true;
    public boolean blackRookNotMovedA = true;
    public boolean blackRookNotMovedH = true;

    public void nextTurn() {
        if (playerTurn == Values.WHITE) {
            playerTurn = Values.BLACK;
        } else {
            playerTurn = Values.WHITE;
        }
        gameAct.setPiecesOnBoard();
    }

    public void print() {

        int defineNumber = 1;
        for (int i = 0; i < 8; i++) {
            String plus = "+----";
            for (int k = 0; k < 8; k++) {
                System.out.print(plus);
            }
            System.out.print("+");
            System.out.println();
            System.out.print("| ");

            for(int j = 0; j < 8; j++) {
                System.out.print(grid.chessGrid[i][j] + " | ");
            }

            System.out.println(defineNumber);
            defineNumber++;
        }

        for (int i = 1; i <= 8; i++) {
            System.out.print("+----");
        }
        System.out.println("+");
        char defineLetter = Values.UPPERCASE_A;
        for (int i = 1; i <= 8; i++) {
            System.out.print("  " + defineLetter + "  ");
            defineLetter++;
        }
        System.out.println();
    }

    public void move(int inputColFrom, int inputRowFrom, int inputColTo, int inputRowTo) {

//        while (stopTheGame == false) {

            if (playerTurn == Values.WHITE) {
                System.out.println();
                System.out.println("White players turn!");
            } else if (playerTurn == Values.BLACK) {
                System.out.println();
                System.out.println("Black players turn!");
            }

            // Insert column :
            fromCol = inputColFrom;

            // Insert row :
            fromRow = inputRowFrom;

            // Insert column :
            toCol = inputColTo;

            // Insert row :
            toRow = inputRowTo;

            pieces.grid(fromRow, fromCol, toRow, toCol);
            // 3.1.1.2 -> game continiue -> switch players + display info window + return to 1st step
            // 3.2 -> invalid move
            // 3.2.1 -> display invalid move error + return to 2nd step
            print();
            // 3.1.1.1 -> game over -> display info window + return to start activity + clear player names
            isGameOver();

//        }
    }

    private int inputCol(String message) {
        int col;
        while (true) {
            Scanner insert = new Scanner(System.in);
            System.out.print(message);
            String c = insert.nextLine();
            if (c.length() > 1) {
                System.out.println("Invalid input!");
            } else {
                col = c.charAt(0);
                if (col >= Values.LOWERCASE_A && col <= Values.LOWERCASE_H) {
                    col = col - Values.LOWERCASE_A + 1;
                    break;
                } else if (col >= Values.UPPERCASE_A && col <= Values.UPPERCASE_H) {
                    col = col - Values.UPPERCASE_A + 1;
                    break;
                } else {
                    System.out.println("Invalid input!");
                }
            }
        }
        col -= 1;
        return col;
    }

    private int inputRow(String message) {
        int row;
        while (true) {
            Scanner insert = new Scanner(System.in);
            System.out.print(message);
            String r = insert.nextLine();
            if (r.length() > 1) {
                System.out.println();
                System.out.println("Invalid input!");
            } else {
                row = r.charAt(0) - Values.ASCI_1 + 1;
                if (row < 1 || row > Values.ROWS) {
                    System.out.println();
                    System.out.println("Invalid input!");
                } else {
                    break;
                }
            }
        }
        row -= 1;
        return row;
    }

    public void isGameOver() {

        boolean whiteKingAlive = false;
        boolean blackKingAlive = false;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (grid.getPiece(grid.chessGrid[i][j]) == Values.KING) {
                    if (grid.isWhite(grid.chessGrid[i][j])) {
                        whiteKingAlive = true;
                    } else {
                        blackKingAlive = true;
                    }
                }
            }
        }
        if (blackKingAlive == false) {
            System.out.println("End of the game!");
            System.out.println("White won!");

            // Clear player names
            stAct.firstPlayer = "";
            stAct.secondPlayer = "";
            stAct.firstPlayerInput.setText("");
            stAct.secondPlayerInput.setText("");

            // TODO: return back to the main view

            grid.boardClear();
            print();

        } else if (whiteKingAlive == false) {
            System.out.println("End of the game!");
            System.out.println("Black won!");

            // Clear player names
            stAct.firstPlayer = "";
            stAct.secondPlayer = "";
            stAct.firstPlayerInput.setText("");
            stAct.secondPlayerInput.setText("");

            // TODO: return back to the main view

            grid.boardClear();
            print();

        }
    }

}
