package DayTwo;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Collectors;
public class CubeConundrum1 {
    private static final int totalRedCubes = 12, totalGreenCubes = 13, totalBlueCubes = 14;
    public static int sumOfValidGames(String fileName) {
        int sum = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            for (String s : br.lines().collect(Collectors.toList())) {
                int id = Integer.parseInt(s.substring(5, s.indexOf(':')));
                s = s.substring(s.indexOf(':') + 2);
                boolean foundFaulty = false;
                x:
                for (String st : s.split("; ")) {
                    for (String str : st.split(", ")) {
                        int num = Integer.parseInt(str.substring(0, str.indexOf(' ')));
                        if (str.contains("blue")) if (num > totalBlueCubes) foundFaulty = true;
                        if (str.contains("green")) if (num > totalGreenCubes) foundFaulty = true;
                        if (str.contains("red")) if (num > totalRedCubes) foundFaulty = true;
                        if (foundFaulty) break x;
                    }
                }
                sum += foundFaulty ? 0 : id;
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        return sum;
    }
        private static int getGameId (String line)
        {
            // Assuming the game ID is the first number in the line
            String[] parts = line.split(":");
            return Integer.parseInt(parts[0].trim().replaceAll("[^0-9]", ""));
        }
    }