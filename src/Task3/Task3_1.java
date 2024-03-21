package Task3;

import java.util.Scanner;

public class Task3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int num = sc.nextInt();
        int[] array = new int[num];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 1000));
        }
        for (int k : array) {
            System.out.print(k + " ");
        }
        System.out.println();
        int av = 0;
        int max = array[0];
        int min = array[0];
        for (int j : array) {
            if (j > max) {
                max = j;
            }
            if (j < min) {
                min = j;
            }
            av += j;
        }
        av /= array.length;
        System.out.println("Max Number : " + max);
        System.out.println("Min Number : " + min);
        System.out.println("Average : " + av);
    }
}
