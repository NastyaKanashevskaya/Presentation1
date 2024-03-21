package Task3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int a = scan.nextInt();
        System.out.print("Enter the number of values in the nested arrays: ");
        int b = scan.nextInt();
        int[][] array = new int[a][b];
        Random num = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = num.nextInt();
            }
        }
        for (int[] i : array) {
            Arrays.sort(i);
            System.out.println(Arrays.toString(i));
        }
    }
}

