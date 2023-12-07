import DayOne.TxtFileReader;

public class Main
{
    public static void main(String[] args)
    {
        //Project of Day 1
        TxtFileReader tfr = new TxtFileReader();

        System.out.println(tfr.readTxtFile("C:\\Users\\sweb\\IdeaProjects\\AdventOfCode23_SWEB\\src\\DayOne\\Input\\Trajectory_Values.txt"));
    }
}