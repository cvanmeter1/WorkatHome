import java.util.Scanner;
/**
 * Write a description of class ReverseArray here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ReverseArray
{
    public static void main(String[] args)
    {
        int temp = 0;
        int numValues;
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter an whole number: ");
        numValues = kb.nextInt();
        int[] values = new int[numValues];
        System.out.println("Enter " + numValues + " whole numbers.");
        for(int i=0; i < values.length; i++)
        {
            values[i] = kb.nextInt();
            
        }
        for(int i=0; i < values.length; i++)
        {
            System.out.print(values[i] + " ");
        }
        System.out.println();
        for(int i=0; i < values.length/2; i++)
        {
            temp = values[i];
            values[i] = values[values.length - (i+1)];
            values[values.length-(i+1)] = temp;
        }
        for(int i=0; i < values.length; i++)
        {
            System.out.print(values[i] + " ");
        }
    }
}
