import java.util.Scanner;
public class Main2
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
         String filepath = "C:\\Users\\neera\\Coding\\C\\Advent of code\\day1\\test.txt";

        filereader2.readFile(filepath);
       System.out.println("the total number of zero is "+cal2.getZeroPasser());
        sc.close();
    }
}
