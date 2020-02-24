import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Add value (from 100-999)");
            Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            if (a <= 99 && a >= 10) {
                int lastNumber = a % 10;
                int secondNumber = (a / 10) % 10;
                System.out.println(lastNumber + "" + secondNumber);
                System.out.println("*********************************************");

            } else if (a >= 100 && a <= 999) {
                int lastNumber = a % 10;
                int secondNumber = (a / 10) % 10;
                int firstNumber = a / 100;
                System.out.println(lastNumber + "" + secondNumber + "" + firstNumber);
                System.out.println("*********************************************");
            } else
                System.out.println("Dzig es jogum brat? beranaci asinq (Add value (from 100-999))");
               // System.out.println("*********************************************");

        }
    }
}