package Fahad;
import java.util.Scanner;
// Write a program to Generate 6 number for 5 people and accept there name and find the max of all;
public class G6Rannmax_PRG31
{
    Scanner sc = new Scanner(System.in);
    void main()
    {   
        int num , sum , max = 0;
        String n , a = "s";
        for (byte i = 1; i <= 5;i++)
        {
            sum = 0;
            System.out.println("Enter your name");
            n = sc.nextLine();
            for (byte o = 1;o <= 6;o++)
            {
                double gen = Math.random();
                num = (int)(100*gen);
                System.out.println("Number"+o+" is "+num);
                sum += num;
            }
            System.out.println("sum of person "+n+" is "+sum);
            if (sum > max)
            {
                max = Math.max(max , sum);
                a = n;
            }
        }
        System.out.println("person "+a+" has the greatest number is "+max);
    }
}
