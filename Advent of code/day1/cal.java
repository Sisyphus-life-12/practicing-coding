import java.util.*;
public class cal 
{
 public static void solve(String line)
 {
    int pointer=50;
   int zerocounter=0;

    String temp=line;
    char direction=temp.charAt(0);
    int number=Integer.parseInt(temp.substring(1));   
    if (direction =='R')
    {
     pointer=pointer+number;
     if (pointer>99)
     {
       pointer = (pointer + number) % 100;
        zerocounter++;
     }
    }
    else if (direction =='L')
         {
        pointer=(pointer-number);
        if (pointer<0)
        {
            pointer = (pointer - number + 100) % 100;
            zerocounter++;
        }
    }
    System.out.println(zerocounter);
 }   
}
