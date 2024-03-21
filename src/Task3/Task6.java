package Task3;

import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            array[i] = r.nextInt();
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
        for (int i = 1; i < array.length; i += 2) {
            array[i] = 0;
        }
        System.out.println();
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}


