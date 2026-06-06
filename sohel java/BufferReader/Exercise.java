package BufferReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(isr);
        System.out.println("Welcome to Arithmetic Operations using BufferedReader!");
        while (true) {
            System.out.print("Please enter the first number: ");
            String input1 = bf.readLine();
            int num1 = Integer.parseInt(input1);
            System.out.print("Please enter the second number: ");
            String input2 = bf.readLine();
            int num2 = Integer.parseInt(input2);
            System.out.println("Which operation would you like to perform?");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.print("Enter your choice (1/2/3/4): ");
            String input3 = bf.readLine();
            int x = Integer.parseInt(input3);

            if (x == 1) {
                int y = num1 + num2;
                System.out.println("num1 = " + num1 + ", num2 = " + num2 + ", choice = " + x + " -> Result = " + y);
            } else if (x == 2) {
                int y = num1 - num2;
                System.out.println("num1 = " + num1 + ", num2 = " + num2 + ", choice = " + x + " -> Result = " + y);
            } else if (x == 3) {
                int y = num1 * num2;
                System.out.println("num1 = " + num1 + ", num2 = " + num2 + ", choice = " + x + " -> Result = " + y);
            } else {
                int y = num1 / num2;
                System.out.println("num1 = " + num1 + ", num2 = " + num2 + ", choice = " + x + " -> Result = " + y);
            }
            System.out.println("click 0 to end");
            String input4 = bf.readLine();
            int z = Integer.parseInt(input4);
            if (z == 0) {
                break;
            }
            continue;
        }

    }

}