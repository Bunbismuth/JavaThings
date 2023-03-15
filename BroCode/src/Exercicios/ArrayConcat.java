package Exercicios;

import java.util.Arrays;

public class ArrayConcat {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {2, 3, 4, 5};

        int[] arrayTotal = arrayConcat(array1, array2);

        System.out.println(Arrays.toString(arrayTotal));
    }

    public static int[] arrayConcat(int[] array1, int[] array2){
        int[] arrayConcat = new int[array1.length+array2.length];
        for(int i = 0; i < array1.length; i++){
            arrayConcat[i] = array1[i];
            for (int j = 0; j < array2.length; j++){
                arrayConcat[j+array1.length] = array2[j];
            }
        }
        return arrayConcat;
    }
}
