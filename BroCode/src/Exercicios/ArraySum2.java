package Exercicios;

import java.util.Arrays;

public class ArraySum2 {
    public static void main(String[] args) {
        int[][] a = {
                {2, 3, 2},
                {2, 1, 2, 3, 5},
                {2, 5, 6},
                {1, 2, 5}
        };

        int[][] b = {
                {0, 1, 2},
                {0, 1, 2, 5},
                {0, 1, 2},
        };

        int[][] sumArray = arraySum(a,b);

        System.out.println(Arrays.deepToString(sumArray));
    }
    public static int maxRows(int[][] list1, int[][] list2){
        int maxRows = 0;
        for (int[] rows : list1){
            maxRows = Math.max(rows.length, maxRows);
        }
        for (int[] rows : list2){
            maxRows = Math.max(rows.length, maxRows);
        }
        return maxRows;
    }

    public static int[][] arraySum(int[][] list1, int[][] list2){
        int[][] sumArray = new int[Math.max(list1.length, list2.length)][maxRows(list1, list2)];

        for (int i = 0; i < list1.length; i++){
            for (int j = 0; j < list1[i].length; j++){
                sumArray[i][j] += list1[i][j];
            }
        }

        for (int i = 0; i < list2.length; i++){
            for (int j = 0; j < list2[i].length; j++){
                sumArray[i][j] += list2[i][j];
            }
        }
        return sumArray;
    }
}
