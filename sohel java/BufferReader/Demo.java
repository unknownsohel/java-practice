package BufferReader;

import java.io.*;

public class Demo {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(isr);
        String input = bf.readLine();
        System.out.println(input);
        bf.close();

    }

}
