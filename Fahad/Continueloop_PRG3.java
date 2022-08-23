package Fahad;
public class Continueloop_PRG3
{
    int x;
    void main()
    {
        for (x=1;x<=100;x++)
        {
            if (x==50)
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