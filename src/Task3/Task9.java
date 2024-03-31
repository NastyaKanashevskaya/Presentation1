package Task3;
import java.util.Random;
import java.util.Scanner;
public class Task9 {
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
        int n = array.length;
        int m = array[0].length;
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
