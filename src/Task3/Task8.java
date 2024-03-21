package Task3;

import java.util.Random;
import java.util.Scanner;

public class Task8 {
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
        int result = 0;
        for (int[] ints : array) {
            for (int anInt : ints) {
                result += anInt;
            }
        }
        System.out.println(result);
    }
}
