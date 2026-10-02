package BufferReader;

import java.io.*;

public class BufferReaderEvenOdd {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(isr);
        System.out.println("enter a no to check even and odd");
        String input = bf.readLine();
        int num = Integer.parseInt(input);
        if (num % 2 == 0) {
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }

    }

}
