package Task2;

import java.util.Scanner;

public class TimeOfYearByNumberOfMonth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the month number: ");
        int monthNumber = in.nextInt();
        if ((monthNumber == 12) || (monthNumber == 1) || (monthNumber == 2)) {
            System.out.println("It’s winter!");
        } else if ((monthNumber == 3) || (monthNumber == 4) || (monthNumber == 5)) {
            System.out.println("It's spring!");
        } else if ((monthNumber == 6) || (monthNumber == 7) || (monthNumber == 8)) {
            System.out.println("It's summer");
        } else if ((monthNumber == 9) || (monthNumber == 10) || (monthNumber == 11)) {
            System.out.println("It's fall");
        } else {
            System.out.println("Incorrect month number");
        }
    }

}

