/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Lab3 {
    public static char[][] table = {{'-','-','-'},{'-','-','-'},{'-','-','-'}};
    public static char turn = 'O';
    public static int row;
    public static int col;
    public static Scanner sc = new Scanner(System.in);
    public static int count = 0;
    

    public static void main(String[] args) {
        printWelcome();
        while (true){
            printshowTable();
            printshowTurn();
            inputRowCol();
            if(isFinish()) {
                printshowTable();
                showResult();
                break;
            }
            turn = swithTurn(turn);
        
        }
        
    }
    public static void printWelcome() {
        System.out.println(" Welcome to the OX Game");
        
    }
    public static void printshowTable() {
        for (int r=0;r<3;r++) {
            for (int c = 0; c <3;c++){
                System.out.print(table[r][c]+" "); 
            }
            System.out.println();
        }
       
        
    }
    public static void printshowTurn() {
        System.out.println(" Turn " + turn);
        
    }
    public static void  inputRowCol() {
        boolean ErrorInput = false;
        while (!ErrorInput) {
            System.out.print("Plaese input row,col: ");
            row = sc.nextInt() - 1;
            col = sc.nextInt() - 1;
 //       System.out.println("" + row +" "+ col);
 
        if (row < 0 || row > 2 || col < 0 || col > 2) {
              System.out.println("Please enter a number between 1 and 3.");
          } else if (table[row][col] != '-') {
              System.out.println("Choose another one.");
          } else {
              table[row][col] = turn;
              count++;
              ErrorInput = true;
        }
    }
}
    public static char swithTurn(char turn) {
        if(turn == 'X') {
            return 'O';
        } else{
            return 'X';
        }
    }

    public static boolean isFinish() {
        if(checkWin()) {
            return true;
        }
        if(checkDraw(count)){
            return true;
        }
        return false;
        
    }
    public static boolean checkWin() {
        if(checkRow(table, turn, row)){
            return true;
        }
        if(checkCol(table, turn, col)){
            return true;
        }
        if(checkX(table, turn)){
            return true;
        }
        return false;
        
    }
    public static boolean checkDraw(int count) {
        if(count==9) {
            return true;
        }
        return false;
        
    }

    public static boolean checkRow(char[][] table, char turn, int row) {
        
        if(table[row][0] == turn && table[row][1] == turn && table[row][2] == turn) {
            return true;
        }
        return false;
    }

    public static boolean checkCol(char[][] table, char turn, int col) {
        if(table[0][col] == turn && table[1][col] == turn && table[2][col] == turn) {
            return true;
        }
        return false;
    }

    public static boolean checkX(char[][] table, char turn) {
        if(checkX1(table, turn)) {
            return true;
        }
        if(checkX2(table, turn)) {
            return true;
        }
        return false;
    }

    public static void showResult() {
        if(checkWin()) {
            System.out.println(turn + " Win!");
            
        }
        if(checkDraw(count)) {
            System.out.println("Draw!");
            
        }
    }

    public static boolean checkX1(char[][] table, char turn) {
        if (table[0][0] == turn && table[1][1] == turn && table[2][2] == turn) {
        return true;
        }
        return false;
    }

    public static boolean checkX2(char[][] table, char turn) {
        if (table[0][2] == turn && table[1][1] == turn && table[2][0] == turn) {
            return true;
        }
        return false;
       
    }
         
}
