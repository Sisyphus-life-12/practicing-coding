
public class cal

{
      static int pointer=50;
   static  int zerocounter=0;

 public static void solve(String line)
 {
  

    String temp=line;
    char direction=temp.charAt(0);
    int number=Integer.parseInt(temp.substring(1));   
    
    if (direction =='R')
    {
   
       pointer = (pointer + number) % 100;
       
     
     
    }
    else if (direction =='L')
   {

            pointer = (pointer - number + 100) % 100;
        
        
    }
    if(pointer== 0)
    { zerocounter=zerocounter+1;}
   
 }   
 public static int getZeroCount()
 {return zerocounter;}

}

