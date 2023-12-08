package DayOne;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TxtFileReaderV1_2 {
    private static final Map<String, String> wordToNumberMap = createWordToNumberMap();

    public int readTxtFile(String fileName) {
        int sum = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Process the line.
                line = replaceWordsWithNumbers(line);
                // Convert the line to a char array.
                char[] charArray = line.toCharArray();
                // Iterate over the char array from index 0 until a number is found.
                int firstValue = extractFirstDigit(charArray);
                // Iterate over the char array from behind until a number is found.
                int lastValue = extractLastDigit(charArray);
                // Concatenate the two numbers.
                int concatValue = Integer.parseInt(Integer.toString(firstValue) + Integer.toString(lastValue));
                // Add the value to the sum.
                sum += concatValue;
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        return sum;
    }
    private String replaceWordsWithNumbers(String line) {
        for (Map.Entry<String, String> entry : wordToNumberMap.entrySet()) {
            line = line.replaceAll(entry.getKey(), entry.getValue());
        }
        return line;
    }
    private int extractFirstDigit(char[] charArray) {
        for (char c : charArray) {
            if (Character.isDigit(c)) {
                return Character.getNumericValue(c);
            }
        }
        return 0;
    }

    private int extractLastDigit(char[] charArray) {
        for (int i = charArray.length - 1; i >= 0; i--) {
            if (Character.isDigit(charArray[i])) {
                return Character.getNumericValue(charArray[i]);
            }
        }
        return 0;
    }

    private static Map<String, String> createWordToNumberMap() {
        Map<String, String> map = new HashMap<>();
        map.put("one", "o1e");
        map.put("two", "t2o");
        map.put("three", "t3e");
        map.put("four", "f4r");
        map.put("five", "f5e");
        map.put("six", "s6x");
        map.put("seven", "s7n");
        map.put("eight", "e8t");
        map.put("nine", "n9e");
        return map;
    }
}