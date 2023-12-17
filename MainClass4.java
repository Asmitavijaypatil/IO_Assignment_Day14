// Write a program that will copy content of one file to another. Use input.txt file as
// input.

import java.io.*;

public class MainClass4 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("input.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        FileOutputStream fos = new FileOutputStream("output.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        
        String line ;
        while((line = br.readLine()) != null ) {
            osw.write(line + "\n");
            System.out.println();
        }
        br.close();
        osw.close();
    }
 }