import java.util.Scanner;
/**
 * Write a description of class Shopping here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Shopping
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        String shopping = "y";
        ShoppingCart cart = new ShoppingCart();
        String itemName;
        double price;
        int quantity;
        while(shopping.equals("y"))
        {
            
            
            System.out.println("What item are you buying?: ");
            itemName = kb.nextLine();
            System.out.println("What is the price of the item?: ");
            price = kb.nextDouble();
            System.out.println("How many items are you buying?: ");
            quantity = kb.nextInt();
            cart.addToCart(itemName, price, quantity);
            
            
            System.out.println(cart);

            System.out.println("Please pay " + cart.getTotalPrice());
            
            System.out.println("Do you want to continue shopping(y/n)?: ");
            shopping = kb.nextLine();
            shopping = kb.nextLine();
        }
    }
}
