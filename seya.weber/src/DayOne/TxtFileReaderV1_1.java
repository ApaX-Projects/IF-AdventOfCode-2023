package DayOne;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TxtFileReaderV1_1 {
    public int readTxtFile(String fileName) {
        int sum = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                sum += extractAndAddValues(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        return sum;
    }

    private int extractAndAddValues(String line) {
        int firstValue = 0, lastValue = 0;

        for (char c : line.toCharArray()) {
            if (Character.isDigit(c)) {
                firstValue = Character.getNumericValue(c);
                break;
            }
        }

        for (int i = line.length() - 1; i >= 0; i--) {
            if (Character.isDigit(line.charAt(i))) {
                lastValue = Character.getNumericValue(line.charAt(i));
                break;
            }
        }

        return Integer.parseInt(Integer.toString(firstValue) + Integer.toString(lastValue));
    }
}
