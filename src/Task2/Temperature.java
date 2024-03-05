package Task2;

import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 't': ");
        int t = in.nextInt();
        int num1 = -20;
        int num2 = -5;
        if (t > num2) {
            System.out.println("Warm!");
        } else if ( t > num1 & t <= num2 ) {
            System.out.println("Normal!");
        } else {
            System.out.println("Cold!");
        }
    }
}