package DayOne;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TxtFileReader
{
    public int readTxtFile(String fileName)
    {
        int sum = 0;
        int firstValue = 0, lastValue = 0;
        int concatValue = 0;
        String file= "C:\\Users\\sweb\\IdeaProjects\\AdventOfCode23_SWEB\\src\\DayOne\\Input\\Trajectory_Values.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null)
            {
                // process the line.
                char[] charArray = line.toCharArray();

                //iterate over the char array from index 0 until a number is found
                for (char c : charArray)
                {
                    if (Character.isDigit(c)) {
                        //convert the char to a string
                        String number = Character.toString(c);
                        //convert the string to an int
                        firstValue = Integer.parseInt(number);
                        break;
                    }
                }
                //iterate over the char array from behind until a number is found
                for (int i = charArray.length - 1; i >= 0; i--)
                {
                    if (Character.isDigit(charArray[i])) {
                        //convert the char to a string
                        String number = Character.toString(charArray[i]);
                        //convert the string to an int
                        lastValue = Integer.parseInt(number);
                        break;
                    }
                }
                //concatinate the two numbers
                String number = Integer.toString(firstValue) + Integer.toString(lastValue);
                //convert the string to an int
                concatValue = Integer.parseInt(number);
                //add the value to the sum
                sum += concatValue;
                firstValue = 0;
                lastValue = 0;
                concatValue = 0;
            }
        }
        catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        return sum;
    }
}
