import DayOne.TxtFileReaderV1_1;
import DayOne.TxtFileReaderV1_2;

public class Main
{
    public static void main(String[] args)
    {
        //Project of Day 1.1
        TxtFileReaderV1_1 tfr = new TxtFileReaderV1_1();
        System.out.println(tfr.readTxtFile("seya.weber/src/DayOne/Input/Trajectory_Values.txt"));

        //Project of Day 1.2
        TxtFileReaderV1_2 tfr2 = new TxtFileReaderV1_2();
        System.out.println(tfr2.readTxtFile("seya.weber/src/DayOne/Input/Trajectory_Values.txt"));
    }
}