package Task3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(100);
        }
        Scanner scan = new Scanner(System.in);
        System.out.println(Arrays.toString(array));
        System.out.print("Enter the number of values in the array:  ");
        int input = scan.nextInt();
        boolean flag = false;
        for (int j : array) {
            if (j == input) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("Number is in the array!");
        } else {
            System.out.println("Number is not found in the array!");
        }
    }
}