package Fahad;

import java.util.Scanner;
public class AllEvenallthree_PRG2
{
    Scanner sc = new Scanner(System.in);
    char opt;
    void main()
    {
        opt = sc.next().charAt(0);
        System.out.println("Enter a to run All Even numbers by for loop");
        System.out.println("Enter b to run All Even numbers by While loop");
        System.out.println("Enter c to run All Even numbers by DoWhile loop");
        switch (opt)
        {
            case 'a':
            byfor();
            case 'b':
            bywhile();
            case 'c':
            bydowhile();
        }
    }
    void byfor()
    {
        int x;
        for (x = 0;x<=100;x+=2)
        {
            System.out.print(x+" ");
        }
    }
    void bywhile()
    {
        int x = 0;
        while (x <=100)
        {
            System.out.print(x+2+" ");
        }
    }
    void bydowhile()
    {
        int x = 0;
        do 
        {
            System.out.print(x+2+" ");
        }
        while (x<=100);
    }
    }

