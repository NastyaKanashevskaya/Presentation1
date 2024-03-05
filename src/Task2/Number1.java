package Task2;

import java.util.Scanner;

public class Number1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num1 = in.nextInt();
        int sum = 0;
        for (int i = 0; i <= num1; i++) {
            sum = sum + i;
        }
            System.out.println(sum);
    }
}
