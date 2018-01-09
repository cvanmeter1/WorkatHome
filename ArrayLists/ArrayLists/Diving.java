import java.util.ArrayList;
import java.util.Scanner;
/**
 * Write a description of class Diving here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Diving
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        ArrayList<Double> divingScore = new ArrayList<Double>(6);
        double highest = -1000;
        double lowest = 1000;
        double score = 0;
        double dificulty;
        int highIndex  = 0;
        int lowIndex = 0;
        System.out.println("Enter the degree of dificulty(range from 1.2 to 3.8): ");
        dificulty = kb.nextDouble();
        while(dificulty > 3.8 || dificulty < 1.2)
        {
            System.out.println("Number not between the range enter another value between 1.2 and 3.8 : ");
            dificulty = kb.nextDouble();
        }
   
        for(int i = 0; i < 7; i++)
        {
            double temp;
            System.out.println("Enter the score for judge " + (i+1) + "  (between 0 and 10): ");
            temp = kb.nextDouble();
            if(temp < 0 || temp > 10)
            {
                i--;
            }
            else
            {
            divingScore.add(i,temp);
            if(temp > highest)
            {
                highest = divingScore.get(i);
                highIndex = i;
            }
            if(temp < lowest)
            {
                lowest = divingScore.get(i);
                lowIndex = i;
            }
            }
        }
        divingScore.remove(lowIndex);
        divingScore.remove(highIndex);
        for(Double num: divingScore)
        {
            score += num;
        }
        score = (score * dificulty) * 0.6;
        System.out.println("Final score for diver: " + score);
    }
    
}
