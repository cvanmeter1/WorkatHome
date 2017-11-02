import java.util.Scanner;
/**
 * Write a description of class TestNames here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestNames
{
    public static void main(String[] args)
    {
        String first2;
        String middle2;
        String last2;
        
        Scanner kb = new Scanner(System.in);
        
        System.out.println("What is your first name?: ");
        first2 = kb.nextLine();
        
        System.out.println("What is your middle name?: ");
        middle2 = kb.nextLine();
        
        System.out.println("What is your last name?: ");
        last2 = kb.nextLine();
        
        Name name1 = new Name(first2, middle2, last2);
        
        System.out.println("Name 1: " + name1.firstMiddleLast());
        System.out.println("Name 1 last, first, middle: " + name1.lastFirstMiddle());
        System.out.println("Name 1 initials: " + name1.initials());
        System.out.println("Name 1 length: " + name1.length());
        
        
        System.out.println("What is your last name?: ");
        last2 = kb.nextLine();
        
        System.out.println("What is your middle name?: ");
        middle2 = kb.nextLine();
        
        System.out.println("What is your last name?: ");
        last2 = kb.nextLine();
        
        Name name2 = new Name(first2, middle2, last2);
        
        System.out.println("Name 2: " + name2.firstMiddleLast());
        System.out.println("Name 2 last, first, middle: " + name2.lastFirstMiddle());
        System.out.println("Name 2 initials: " + name2.initials());
        System.out.println("Name 2 length: " + name2.length());
        System.out.println("Is the 2 names the same?: " + name1.equals(name2));
    }
}
