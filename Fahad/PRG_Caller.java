package Fahad;
import java.util.Scanner;
public class PRG_Caller
{
    Scanner sc = new Scanner(System.in);
    char opt;
    void main()
    {
        System.out.println("Enter 1 to run Generate 6 random numbers PRG.");
        System.out.println("Enter 2 to run All Even Numbers PRG.");
        System.out.println("Enter 3 to run Continue loop PRG.");
        System.out.println("Enter 4 to run Break loop PRG.");
        System.out.println("Enter 5 to run Multiply Continue PRG.");
        System.out.println("Enter 6 to run Infinite Loop PRG.");
        System.out.println("Enter 7 to run Generate 6 random number for 5 person and accept the name and find the max of all PRG.");
        opt = sc.next().charAt(0);
        switch (opt)
        {
            case '1':
            PRG1();
            break;
            case '2':
            PRG2();
            break;
            case '3':
            PRG3();
            break;
            case '4':
            PRG4();
            break;
            case '5':
            PRG5();
            break;
            case '6':
            PRG6();
            break;
            case '7':
            PRG7();
            break;
            default:
            System.out.println("Wrong choice Exiting...");
            System.exit(0);
        }
    }
    void PRG1()
    {
         G6Rnum_PRG1 obj = new G6Rnum_PRG1();
         main();
    }
    void PRG2()
    {
        AllEvenallthree_PRG2 obj = new AllEvenallthree_PRG2();
        main();
    }
    void PRG3()
    {
        Continueloop_PRG3 obj = new Continueloop_PRG3();
        main();
    }
    void PRG4()
    {
        Breakloop_PRG4 obj = new Breakloop_PRG4();
        main();
    }
    void PRG5()
    {
        multiplyContinue_PRG5 obj = new multiplyContinue_PRG5();
        main();
    }
    void PRG6()
    {
        InfiniteLoopTEST_PRG6 obj = new InfiniteLoopTEST_PRG6();
        main();
    }
    void PRG7()
    {
        G6Rannmax_PRG31 obj = new G6Rannmax_PRG31();
        main();
    }
}
