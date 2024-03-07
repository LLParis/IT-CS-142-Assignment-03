// London Paris
// IT-CS-142-Assignment-03
import java.util.*;
import java.io.*;

public class Sum {
    private static final String DATA = "src/sum.txt";
    private static final int ARRAY_SIZE = 25;

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File(DATA));
        processFile(input);
    }

    private static void processFile(Scanner input) {

        int lineCount = 0;

        while (input.hasNextLine()) {
            String line = input.nextLine();
            Scanner lineScanner = new Scanner(line);

            while (lineScanner.hasNext()) {
                String token = lineScanner.next();
            }

        }
    }

    private static int[] stringToDigitArray() {

        for (int i = ARRAY_SIZE - 1; i >= 0; i--) {

        }
    }

    private static int addLargeNumbers() {

        int carry = sum % 10;
        return carry;
    }

    private static void printSum() {

    }
}