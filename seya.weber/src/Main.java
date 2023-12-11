import DayOne.*;
import DayThree.*;
import DayTwo.*;

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

        //Project of Day 2.1
        CubeConundrum1 cc1 = new CubeConundrum1();
        System.out.println(cc1.sumOfValidGames("seya.weber/src/DayTwo/Input/GameValues.txt"));

        //Project of Day 2.2
        CubeConundrum2 cc2 = new CubeConundrum2();
        System.out.println(cc2.CubeConundrum2("seya.weber/src/DayTwo/Input/GameValues.txt"));

        //Project of Day 3.1
        GearRatio1 gr1 = new GearRatio1();
        System.out.println(gr1.GearRatio1("seya.weber/src/DayThree/Input/EngineSchematic.txt"));

        //Project of Day 3.2
        GearRatio2 gr2 = new GearRatio2();
        System.out.println(gr2.GearRatio2("seya.weber/src/DayThree/Input/EngineSchematic.txt"));


    }
}