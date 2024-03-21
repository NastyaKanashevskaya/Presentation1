package Task2;

import java.util.Scanner;

public class Rainbow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter color number: ");
        int colorNumber = in.nextInt();
        switch (colorNumber) {
            case 1:
                System.out.println("Red");
                break;
            case 2:
                System.out.println("Orange");
                break;
            case 3:
                System.out.println("Yellow");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("Green");
                break;
            case 6:
                System.out.println("Blue");
                break;
            case 7:
                System.out.println("Indigo");
                break;
            case 8:
                System.out.println("Violet");
                break;
            default:
                System.out.println("Incorrect color number");
                break;
        }
    }
}
