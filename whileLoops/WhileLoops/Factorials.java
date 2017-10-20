import java.util.Scanner;
/**
 * Write a description of class Factorials here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Factorials
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        int count = 1;
        int factorial = 1;
        int numberToCommute;
        System.out.println("Enter a non-negative integer:");
        numberToCommute = kb.nextInt();
        while (numberToCommute < 0)
        {
            System.out.println("A non-negative number is required. Enter a non-negative number: ");
            numberToCommute = kb.nextInt();
        }
        while (count<= numberToCommute)
        {
            factorial = factorial * count;
            count++;
            
        }
        System.out.printf("The product of the factorial %d is %d", numberToCommute, factorial);
    }
}
