package basiclibrary;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Library calling = new Library();

        int rollsNum = 4;
        int[] rolls = calling.roll(rollsNum);
        calling.containsDuplicates(rolls);
        calling.average(rolls);

        int[][] weeklyMonthTemperatures = { { 66, 64, 58, 65, 71, 57, 60 }, { 57, 65, 65, 70, 72, 65, 51 },
                { 55, 54, 60, 53, 59, 57, 61 }, { 65, 56, 55, 52, 55, 62, 57 } };
        int[] array = calling.lowestAverage(weeklyMonthTemperatures);
        System.out.println("The array with lowest average is: [");
        System.out.println(Arrays.toString(array));
    }

}
