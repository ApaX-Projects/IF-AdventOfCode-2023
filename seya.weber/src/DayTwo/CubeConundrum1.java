package DayTwo;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CubeConundrum1
{
    private final int totalRedCubes = 12, totalGreenCubes = 13, totalBlueCubes = 14;

    public static int sumOfValidGames(String fileName) {
        int sum = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;

        } catch (IOException e)
        {
            System.out.println("Error reading file: " + e.getMessage());
        }

        return sum;
    }

    private static int getGameId(String line) {
        // Assuming the game ID is the first number in the line
        String[] parts = line.split(":");
        return Integer.parseInt(parts[0].trim().replaceAll("[^0-9]", ""));
    }
}
