package Task2;

import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 't': ");
        int t = in.nextInt();
        if (t > -5) {
            System.out.println("Warm!");
        } else if ( t <=-20 && t < -5 ) {
            System.out.println("Normal!");
        } else {
            System.out.println("Cold!");
        }
    }
}