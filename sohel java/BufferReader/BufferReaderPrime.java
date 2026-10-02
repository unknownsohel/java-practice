package BufferReader;

import java.io.*;

public class BufferReaderPrime {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(isr);
        System.out.println("enter a no to check prime number");
        String input = bf.readLine();
        int num = Integer.parseInt(input);
        if (isPrime(num)) {
            System.out.println("it is a prime no.");
        } else {
            System.out.println("it is not prime");
        }

    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }

        }
        return true;

    }
}
