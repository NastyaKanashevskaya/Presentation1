package Task2;

import java.util.Scanner;

public class MonthsOfTheYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the month number: ");
        int monthNumber = in.nextInt();
        switch (monthNumber) {
            case 1,2,12:
                System.out.println("Winter");
                break;
            case 3,4,5:
                System.out.println("Spring");
                break;
            case 6,7,8:
                System.out.println("Summer");
                break;
            case 9,10,11:
                System.out.println("Fall");
                break;
            default:
                System.out.println("Incorrect month number");
                break;
        }
    }
}

