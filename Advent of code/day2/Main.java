package day2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
class Main
{
    public static void main(String args[])
    {
      String filepath = "C:\\Users\\neera\\Coding\\C\\Advent of code\\day2\\test.txt";
    try(BufferedReader br = new BufferedReader(new FileReader(filepath))) {
      String line;
      line = br.readLine();
     System.out.println(line);
      
    } catch (IOException e) {
      e.printStackTrace();
    }
}}