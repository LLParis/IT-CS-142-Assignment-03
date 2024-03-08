// London Paris
// IT-CS-142-Assignment-03
import java.util.*;
import java.io.*;

// program class
public class Sum {
    // Constants for file path and array size
    private static final String DATA = "src/sum.txt";
    private static final int ARRAY_SIZE = 25;

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File(DATA));
        processFile(input);
        input.close();
    }

    // Processes the file line by line to compute the sums of large numbers
    private static void processFile(Scanner input) {

        int lineCount = 1;

        while (input.hasNextLine()) {
            String line = input.nextLine();
            Scanner lineScanner = new Scanner(line);
            int[] sum = new int[ARRAY_SIZE];
            boolean firstNumber = true;

            while (lineScanner.hasNext()) {
                String numberStr = lineScanner.next();
                if (firstNumber) {
                    firstNumber = false;
                    System.out.print(numberStr);
                } else {
                    System.out.print(" + " + numberStr);
                }
                int[] numberArray = stringToDigitArray(numberStr);
                sum = addLargeNumbers(sum, numberArray);
            }
            System.out.print(" = " );
            printSum(sum);
            lineCount++;
        }
        System.out.println("Total lines = " + lineCount);
    }

    // String conversion to numerical digits
    private static int[] stringToDigitArray(String number) {
        int[] digits = new int[25];
        int index = ARRAY_SIZE - number.length();
        for (int num : number.toCharArray()) {
            digits[index++] = Character.getNumericValue(num);
        }
        return digits;
    }
    // Places the addition of two integer arrays into one array
    private static int[] addLargeNumbers(int[] number1, int[] number2) {
        int[] result = new int[ARRAY_SIZE];
        int carry = 0;
        int sum = 0;
        int index = ARRAY_SIZE - number1.length;
        for (int i = ARRAY_SIZE - 1; i >= 0; i--) {
             sum = number1[i] + number2[i] + carry;
            result[i] = sum % 10;
              carry = sum / 10;
        }
        return result;
    }

    // Calculation display
    private static void printSum(int[] sum) {
        boolean leadingZero = true;
        for (int digit : sum) {
            if (leadingZero && digit == 0) {
                continue;
            }
            leadingZero = false;
            System.out.print(digit);
        }
        if (leadingZero) {
            System.out.print(0);
        }
        System.out.println();
    }
}