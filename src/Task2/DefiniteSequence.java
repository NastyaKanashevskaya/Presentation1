package Task2;

public class DefiniteSequence {
    public static void main(String[] args) {
        int num = 7;
        while (num <= 98) {
            System.out.print(num + " ");// почему важно, чтобы сложение было после sout? потому что там тогда другое число получается
            num += 7;
        }
    }
}

