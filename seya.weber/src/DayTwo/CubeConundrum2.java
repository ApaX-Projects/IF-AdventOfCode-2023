package DayTwo;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.stream.Collectors;
public class CubeConundrum2 {
    private static final int totalRedCubes = 12, totalGreenCubes = 13, totalBlueCubes = 14;
    int sum = 0;
    public int CubeConundrum2(String inputfile) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(inputfile));
            for (String s : br.lines().collect(Collectors.toList())) {
                int id = Integer.parseInt(s.substring(5, s.indexOf(':')));
                s = s.substring(s.indexOf(':') + 2);
                int min_red = 0;
                int min_green = 0;
                int min_blue = 0;
                for (String st : s.split("; ")) {
                    for (String str : st.split(", ")) {
                        int num = Integer.parseInt(str.substring(0, str.indexOf(' ')));
                        if (str.contains("blue")) min_blue = Math.max(min_blue, num);
                        if (str.contains("green")) min_green = Math.max(min_green, num);
                        if (str.contains("red")) min_red = Math.max(min_red, num);
                    }
                }
                sum += min_blue * min_green * min_red;
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return sum;
    }
}