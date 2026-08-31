
public class cal2 
{
      static int pointer=50;
   static int zeropasser=0;
 public static void solve(String line)
 {
  

    String temp=line;
    char direction=temp.charAt(0);
    int number=Integer.parseInt(temp.substring(1));   
    
    if (direction =='R')
    {
        int zpointer=pointer+number;
        while(zpointer>=100)
        {zeropasser++;
        zpointer=zpointer-100;
        }
     
    }
    else if (direction =='L')
   {
    int zpointer=pointer-number;
    while(zpointer<=0)
    {zeropasser++;
        zpointer=zpointer+100;
    }
        
    }
   
 }   
 public static int getZeroPasser()
 {return zeropasser;}
}

