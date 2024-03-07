// London Paris
// IT-CS-142-Assignment-3
import java.util.*;
import java.io.*;

public class Sum {
    private static final String DATA = "src/sum.txt";
    public static void main(String[] args) throws FileNotFoundException {
        lineScanner(DATA);
    }

    public static String lineScanner(String txt) throws FileNotFoundException {
        Scanner line = new Scanner(new File(txt));
        String[] array = new String[25];


        // checking for line existence
        while (line.hasNextLine()) {

            // scanning the tokens
            Scanner lineScanner = new Scanner(line.nextLine());
            while (lineScanner.hasNext()) {

            }

        }
    }
}