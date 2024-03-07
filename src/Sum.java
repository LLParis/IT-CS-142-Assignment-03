// London Paris
// IT-CS-142-Assignment-03
import java.util.*;
import java.io.*;
import java.lang.*;


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
            int[] sum = new int[ARRAY_SIZE];
            while (lineScanner.hasNext()) {
                String numberStr = lineScanner.next();
                int[] numberArray = stringToDigitArray(numberStr);
            }
        }
    }

    private static int[] stringToDigitArray(String number) {
        int[] digits = new int[25];
        int index = ARRAY_SIZE - number.length();
        for (int num : number.toCharArray()) {
            digits[index++] = Character.getNumericValue(num);
        }
        return digits;
    }

    private static int addLargeNumbers(int number1, int number2) {
        int[] result = new int[ARRAY_SIZE];
        int sum = number1 + number2;

        return sum;
    }

    private static void printSum(String[] nums) {
        for (String num : nums) {
            num.split("");
        }

    }
}