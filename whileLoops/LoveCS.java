// ****************************************************************
//   LoveCS.java
//
//   Use a while loop to print many messages declaring your 
//   passion for computer science
// ****************************************************************
import java.util.Scanner;
public class LoveCS
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        int limit;
        int count = 1;
        
        System.out.println("How many times do you want to print the statement?: ");
        limit = kb.nextInt();
        while (count <= limit){
            
            System.out.printf("%d I love Computer Science!!\n", count);
            count ++;
            
        }
        System.out.printf("Printed this message %d times.", count);
    }
}