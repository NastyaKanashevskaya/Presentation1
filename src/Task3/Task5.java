package Task3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scan.nextInt();
        while (size < 6 || size > 10) {
            System.out.println("Array size should be from 6 to 10 inclusive");
            size = scan.nextInt();
        }
        int[] array = new int[size];
        Random r = new Random();
        for (
                int i = 0;
                i < array.length; i++) {
            array[i] = r.nextInt();
        }
        int count = 0;
        for (
                int i = 0;
                i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[count] = array[i];
                count++;
            }
        }
        int[] newArray = Arrays.copyOf(array, count);
        System.out.println(Arrays.toString(newArray));
    }
}
