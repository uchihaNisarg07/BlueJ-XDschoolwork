package Fahad;

public class G6Rnum_PRG1
{
   void main()
   {
       double ran , sum = 0 , num;
       for (int x = 1;x<=6;x++)
       {
           ran = Math.random();
           num = (ran*10.0);
           sum = sum + num;
       }
       System.out.println("Sum:"+sum);
   }
}
