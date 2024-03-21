package Task3;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            Random r = new Random();
            a[i] = r.nextInt(5);
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        for (int i : a) {
            if (num == a[i]) {
                System.out.println("Number is included in array");
                break;
            } else {
                System.out.println("Number is not included in array");
                break;
            }
        }
    }
}
