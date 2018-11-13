package cp120.assignments.assignment001;
// Java program to read data of various types using Scanner class.
import java.util.Scanner;
public class Assignment001
{
    public static void main(String[] args)
    {
        // String input
        String name = "127 327 2147483645 -9234 3.4567 294555.789 true c";
        /**
         * Declare scanner object and initialize with
         * predefined standard input object
         */
        Scanner sc = new Scanner(name);

        // Declare variable, Read and save data types.
        byte firstByteValue = sc.nextByte();
        short secondShortValue = sc.nextShort();
        int thirdIntValue = sc.nextInt();
        long forthLongValue = sc.nextLong();
        float fifthFloatValue = sc.nextFloat();
        double sixthDoubleValue = sc.nextDouble();
        boolean bValue = sc.nextBoolean();
        char lastCharValue = sc.next().charAt(0);
        int results;
        // Print the values with correct data type.
        System.out.println("firstNoByte: "+firstByteValue + '\n' +
                           "secondNoShort: "+secondShortValue + '\n' +
                           "thirdNoInt: "+thirdIntValue + '\n' +
                           "forthNoLong: "+forthLongValue + '\n' +
                           "fifthNoFloat: "+fifthFloatValue + '\n' +
                           "sixthNoDouble: "+sixthDoubleValue + '\n' +
                           "bValueBoolean: "+bValue + '\n' +
                           "lastValue: "+lastCharValue);

        results = 127 + 12 * 45 + 1 % 37 / 4;
        System.out.println(results);
    }


}