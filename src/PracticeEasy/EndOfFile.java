package PracticeEasy;
import java.io.*;
import java.util.*;


public class EndOfFile {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);

        int counter = 1;

        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            System.out.println(counter + " " + line);
            counter++;
        }
    }
}
