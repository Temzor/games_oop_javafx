package ru.job4j.puzzle;

import java.lang.module.FindException;

public class Win {
    public static boolean check(int[][] board) {
        boolean result  = false;
        for (int i = 0; i < board.length - 1; i++) {
                if ( checkHorizontal(board, i) || checkVertical(board, i) ) {
                    result = true;
                    break;
                }
            }
        return  result;
    }

    public static boolean checkHorizontal(int[][] horizontalLine, int row) {
        boolean result = true;
        for (int i = 0; i < horizontalLine.length; i++) {
            if (horizontalLine[row][i] == 0) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean checkVertical(int[][] verticalLine , int cell) {
        boolean result = true;
        for (int i = 0; i < verticalLine.length; i++) {
            if (verticalLine[i][cell]  == 0) {
                result = false;
                break;
            }
        }
            return result;
    }
}

