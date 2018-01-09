// ****************************************************************
// Sales.java
//
// Reads in and stores sales for each of 5 salespeople.  Displays
// sales entered by salesperson id and total sales for all salespeople.
//
// ****************************************************************
import java.util.Scanner;

public class Sales
{
    public static void main(String[] args)
    {
        int salesPeople;
        int[] sales;
        int sum;
        double average;
        Scanner scan = new Scanner(System.in);
        int maximum = 0;
        int maxSaleId = 0;
        int minimum = 9*999999;
        int minSaleId = 0;
        int compValue;
        int compTotal = 0;
        System.out.println("How many salespeople do you want to input?: ");
        salesPeople = scan.nextInt();
        sales = new int[salesPeople];
        for (int i=0; i<sales.length; i++)
        {
            
            System.out.print("Enter sales for salesperson " + (i+1) + ": ");
            sales[i] = scan.nextInt();
            
            if (maximum < sales[i])
            {
                maxSaleId = i+1;
                maximum = sales[i];
                
            }
            if (minimum > sales[i]) 
            {
                minimum = sales[i];
                minSaleId = i+1;
            }
        }

        System.out.println("\nSalesperson   Sales");
        System.out.println("--------------------");
        sum = 0;
        for (int i=0; i<sales.length; i++)
        {
            System.out.println("     " + (i+1) + "         " + sales[i]);
            sum += sales[i];
            
        }
        
        average = (double) sum / sales.length;
        System.out.println("\nSalesperson " + maxSaleId + " had the highest sale with $" + maximum + ".");
        System.out.println("\nSalesperson " + minSaleId + " had the lowest sale with $" + minimum + ".");
        System.out.println("\nTotal sales: " + sum);
        System.out.println("\nAverage sales: " + average);
        System.out.println("What value do you want to compare: ");
        compValue = scan.nextInt();
        System.out.println("These people exceeded $" + compValue);
        for (int i=0; i< sales.length; i++)
        {
            if (compValue < sales[i])
            {
                System.out.println("Salesperson " + (i+1) + " sold $" + sales[i]);
                compTotal++;
                
            }
        }
        System.out.println(compTotal + " salespeople exceeded $" + compValue);
    }
}