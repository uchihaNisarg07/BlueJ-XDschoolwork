package Fahad;

public class multiplyingContinue_PRG5
{
    int x;
    void main()
    {
        for (x = 24;x<=100;x++)
        {
            if (x%23==0)
            {
                continue;
            }
            else
            {
                System.out.println(x);
            }
        }
    }
}
