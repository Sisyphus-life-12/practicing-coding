import java.util.Scanner;
public class Main
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String filepath = "C:\\Users\\neera\\OneDrive\\Desktop\\test.txt";

        filereader.readFile(filepath);
        System.out.println("The number of time dial is left pointing at zero is :"+ cal.getZeroCount());
        sc.close();
    }
}
