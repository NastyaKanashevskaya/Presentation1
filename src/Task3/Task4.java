package Task3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        Random rc = new Random();
        for (int i = 0; i < 5; i++) {
            array1[i] = rc.nextInt();
            array2[i] = rc.nextInt();
        }
        double counter1 = 0;
        double counter2 = 0;
        for (int i = 0; i < 5; i++) {
            counter1 += array1[i];
            counter2 += array2[i];
        }
        double res1 = counter1 / 5;
        double res2 = counter2 / 5;
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        if (res1 > res2) {
            System.out.println("The arithmetic value of the sum of the values of array 1 is greater");
        } else if (res1 < res2) {
            System.out.println("The arithmetic value of the sum of the values of array 2 is greater");
        } else {
            System.out.println("Their arithmetic values are equal");
        }
    }
}