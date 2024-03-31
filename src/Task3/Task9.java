package Task3;

import java.util.Random;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scan.nextInt();
        System.out.print("Enter the number of values in the nested arrays: ");
        int m = scan.nextInt();
        int[][] array = new int[n][m];
        Random num = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = num.nextInt();
                System.out.println(array[i][j]);
            }
        }
        int current = 0;
        int total = Math.min(n, m) * 2;
        while (current < total) {
            int row = Math.min(n - 1, current);
            while (row >= 0 && current - row < m) {
                System.out.print(array[row][current - row]);
                System.out.print(" ");
                --row;
            }
            System.out.println();
            ++current;
        }
    }
}
