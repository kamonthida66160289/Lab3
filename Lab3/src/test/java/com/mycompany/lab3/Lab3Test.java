/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.lab3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Admin
 */
public class Lab3Test {
    
    public Lab3Test() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of main method, of class Lab3.
     */
    @Test
    public void switchTurn_X_O() {
        char turn = 'X';
        char result = Lab3.swithTurn(turn);
        assertEquals('O', result);
        
    }
    @Test
    public void switchTurn_O_X() {
        char turn = 'O';
        char result = Lab3.swithTurn(turn);
        assertEquals('X', result);
        
    }
    @Test
    public void checkRow_Row0_true_ByX() {
        char[][] table = {{'X', 'X', 'X'}, {'-', '-', '-'}, {'-', '-', '-'}};
        char turn = 'X';
        int row = 0;
        boolean result = Lab3.checkRow(table, turn, row);
        assertTrue(result);
    }

    @Test
    public void checkRow_Row0_false_ByX() {
        char[][] table = {{'X', 'X', '-'}, {'-', '-', '-'}, {'-', '-', '-'}};
        char turn = 'X';
        int row = 0;
        boolean result = Lab3.checkRow(table, turn, row);
        assertFalse(result);
    }

    @Test
    public void checkRow_Row1_true_ByO() {
        char[][] table = {{'O', 'O', 'O'}, {'-', '-', '-'}, {'-', '-', '-'}};
        char turn = 'O';
        int row = 0;
        boolean result = Lab3.checkRow(table, turn, row);
        assertTrue(result);
    }

    @Test
    public void checkRow_Row1_false_ByO() {
        char[][] table = {{'-', '-', '-'}, {'O', 'O', '-'}, {'-', '-', '-'}};
        char turn = 'O';
        int row = 0;
        boolean result = Lab3.checkRow(table, turn, row);
        assertFalse(result);
    }

    @Test
    public void checkX1_True_ByX() {
        char[][] table = {{'X', '-', '-'}, {'-', 'X', '-'}, {'-', '-', 'X'}};
        char turn = 'X';
        boolean result = Lab3.checkX1(table,turn);
        assertTrue(result);
    }
    @Test
    public void checkX2_True_ByX() {
        char[][] table = {{'-', '-', 'X'}, {'-', 'X', '-'}, {'X', '-', '-'}};
        char turn = 'X';
        boolean result = Lab3.checkX2(table,turn);
        assertTrue(result);
    }
    @Test
    public void checkCol1_true_ByO() {
        char[][] table = {{'O', '-', '-'}, {'O', '-', '-'}, {'O', '-', '-'}};
        char turn = 'O';
        int col = 0;
        assertTrue(Lab3.checkCol(table,turn,col));
    }
    @Test
    public void checkDraw_true_ByO() {
        assertTrue(Lab3.checkDraw(9));
        
    }
    @Test
    public void checkDraw_true_ByX() {
        assertTrue(Lab3.checkDraw(9));
        
    }

}
