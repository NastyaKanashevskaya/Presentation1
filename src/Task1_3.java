import java.util.Scanner;

public class  Task1_3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int firstNumber = in.nextInt();
        System.out.print("Enter second number : ");
        int secondNumber = in.nextInt();

        System.out.println(firstNumber == secondNumber);
        in.close();
    }
}

