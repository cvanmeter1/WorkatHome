import java.util.Scanner;
/**
 * Write a description of class Fibonacci here.
 *
 * @author (Christian VanMeter)
 * @version (10/24/17)
 */
public class Fibonacci
{
    public static void main(String[] args)
    {
        int days;
        int pop;
        int prevPop1 = 0;
        int prevPop2 = 0;
        int finalPop = 0;
        
        Scanner kb = new Scanner(System.in);
        System.out.print("How many pounds of crubs are present?(Enter -1 to stop): ");
        pop = kb.nextInt();
        
        System.out.println();
        System.out.print("How many days were they reproducing for?: ");
        days = kb.nextInt();
        prevPop1 = pop;

        while (pop != -1)
        {
            for (int i = 1; i <= days; i++)
            {
                if(i % 5 == 0)
                {
                    pop = prevPop1 + prevPop2;
                    prevPop2 = prevPop1;
                    prevPop1 = pop;

                }
            }
            finalPop = pop;
            System.out.println("Final population is " + finalPop + " pounds of crubs.");
            System.out.print("How many days were they reproducing for?: ");
            days = kb.nextInt();
            
            System.out.print("How many pounds of crubs are present?(Enter -1 to stop): ");
            pop = kb.nextInt();
    
            prevPop1 = pop;
            prevPop2 = 0;
        }
    }
}
