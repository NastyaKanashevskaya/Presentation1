package Task3;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Task7 {
    public static void main(String[] args){
        String[][] array = new String[8][8];
        for (int i = 1; i < array.length + 1; i++) {
            for (int j = 1; j < array.length + 1; j++) {
                if ((i + j) % 2 == 0)
                    System.out.print("W");
                else
                    System.out.print("B");
            }
            System.out.println();
        }
    }
}