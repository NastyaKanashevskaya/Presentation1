package Task3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            Random r = new Random();
            array[i] = r.nextInt(7);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println(Arrays.toString(array));
        System.out.print("Enter a number to remove from the array:  ");
        int num = sc.nextInt();
        int num1 = 0;
        for (int j : array) {
            if (j == num) {
                num1++;
            }
        }
        if (num1 == 0) {
            System.out.println("This number is not found in the array.");
        } else {
            int[] array2 = new int[array.length - num1];
            int num2 = 0;
            for (int j : array) {
                if (j != num) {
                    array2[num2] = j;
                    num2++;
                }
            }
            System.out.println("New array without removed number" + num + ": " + Arrays.toString(array2));
        }
    }
}