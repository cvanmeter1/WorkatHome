import java.util.ArrayList;
import java.util.Scanner;
/**
 * Write a description of class Database here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Database
{
    public static void main(String[] args)
    {
        ArrayList<Contact>contact = new ArrayList<Contact>();
        Scanner kb = new Scanner(System.in);
        boolean continueContact = true;
        String answer = "";
        while(continueContact == true)
        {
            System.out.println("If you would like to add a contact enter 1.");
            System.out.println("If you would like to display all contacts enter 2.");
            System.out.println("If you would like to search for a specific contact enter 3.");
            System.out.println("If you would like to search for a specific contact and delete it enter 4.");
            System.out.println("If you would like to quit the program enter 5.");
            answer = kb.nextLine();
            if(answer.equals("1"))
            {
                System.out.println("Enter first name: ");
                String tempFirst = kb.nextLine();
                System.out.println("Enter last name: ");
                String tempLast = kb.nextLine();
                System.out.println("Enter phone number: ");
                String tempPhone = kb.nextLine();
                System.out.println("Enter e-mail: ");
                String tempEMail = kb.nextLine();
                contact.add(new Contact(tempFirst,tempLast,tempPhone,tempEMail));
                System.out.println("User added to database.");
            }
            if(answer.equals("2"))
            {
                for(int i = 0; i < contact.size(); i++)
                {
                    System.out.println(contact.get(i));
                }
            }
            if(answer.equals("3"))
            {
                System.out.println("Who would you like to search for?");
                String search = kb.nextLine();
                for(Contact c: contact)
                {
                    if(c.getFirst().equalsIgnoreCase(search) || c.getLast().equalsIgnoreCase(search) || c.getPhoneNum().equalsIgnoreCase(search) || c.getEMail().equalsIgnoreCase(search))
                    {
                        System.out.println(c);
                    }
                }
            
            }
            if(answer.equals("4"))
            {
                System.out.println("Who would you like to search for?");
                String delete = kb.nextLine();
                for(Contact c: new ArrayList<>(contact))
                {
                    if(c.getFirst().equalsIgnoreCase(delete) || c.getLast().equalsIgnoreCase(delete) || c.getPhoneNum().equalsIgnoreCase(delete) || c.getEMail().equalsIgnoreCase(delete))
                    {
                        System.out.println(c);
                        System.out.println("If you want to delete this contact enter (y/n): ");
                        String decision = kb.nextLine();
                        if(decision.equalsIgnoreCase("y"))
                        {
                            contact.remove(c);
                            System.out.println("Contacted deleted from database.");
                        }
                        else
                        {
                            System.out.println("User not deleted.");
                        }
                    }
                }
            }
            if(answer.equals("5"))
            {
                System.out.println("Program has been ended.");
                continueContact = false;
            }
        }
        
        
    }
}
