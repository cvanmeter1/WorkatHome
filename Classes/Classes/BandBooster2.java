import java.util.Scanner;
/**
 * Write a description of class BandBooster2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BandBooster2
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        BandBooster student1 = new BandBooster("Joe");
        BandBooster student2 = new BandBooster("Sarah");
        System.out.println("Enter the number of boxes sold by " + student1.getName() + " this week:");
        student1.updateSales(kb.nextInt());
        System.out.println();
        System.out.println("Enter the number of boxes sold by " + student2.getName() + " this week:");
        student2.updateSales(kb.nextInt());
        System.out.println(student1);
        System.out.println(student2);
    }
}
