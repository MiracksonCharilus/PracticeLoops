import java.util.Scanner;
public class PracticeLoops {
    public static void main(String[] args){
        practiceForLoops();

    }
    public static void practiceForLoops()
    {
        /*int i;
        for (i = 25; i < 35; i++)
        {int jumpjack = i - 24;
            System.out.println("Jumping jack " + jumpjack);
        }
        for (i = 10; i > 0; i--)
        {int jumpjack = i - 24;
            System.out.println("Jumping jack " + jumpjack);
        }


        for (int i = 10; i <= 20; i+=2)
        {
            System.out.println("even " + i);
        }
        for (int i = 20; i >= 10; i-=2)
        {
            System.out.println("even " + i);
        }
        */

        for (int i = 1; i <= 100; i++)
        {
            //int test = i % 7;
            //if (test == 0)
            if (i % 7 == 0)
            {
            System.out.println(i + " is divisable by 7");}
        }
        for (int i = 1; i <= 115; i++)
        {
            if((i % 3 == 0) || (i % 8 == 0))
            System.out.println("Student #" + i + " has been selected.");
        }
    }
}
