package Exercicios;

import java.util.ArrayList;

public class ArraySum {
    public static void main(String[] args) {
        int[][] a = {
                    {2, 3, 2},
                    {2, 1, 2, 3},
                    {2, 5, 6}
                    };

        int[][] b = {
                    {0, 1, 2},
                    {0, 1, 2, 5},
                    {0, 1, 2},
        };
        ArrayList<ArrayList<Integer>> total = new ArrayList<>();
        ArrayList<Integer> arraySum = new ArrayList<>();

        for(int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++){
                System.out.println(a[i][j]+b[i][j]);
                arraySum.add(a[i][j]+b[i][j]);
            }
            total.add(new ArrayList<>(arraySum));
            arraySum.clear();
        }
        System.out.println(total);
    }
}
