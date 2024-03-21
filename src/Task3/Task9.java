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
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j || (m - i - 1 == j))
                    System.out.print(array[i][j]);
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }
}
