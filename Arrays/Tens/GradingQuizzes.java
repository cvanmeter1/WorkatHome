import java.util.Scanner;
/**
 * Write a description of class GradingQuizzes here.
 *
 * @author Christian VanMeter
 * @version 11/20/2017
 */
public class GradingQuizzes
{
    public static void main(String[] args) 
    {
        Scanner kb = new Scanner(System.in);
        double percent;
        int numQuestions;
        int correct = 0;
        String grading = "y";
        
        System.out.println("How many questions are on the quiz?: ");
        numQuestions = kb.nextInt();
        int[] key = new int[numQuestions];

        System.out.println("Enter the key for the quiz(put space in between each answer): ");

        for(int i=0; i < key.length; i++)
        {
            key[i] = kb.nextInt();

        }
        while(grading.equals("y")){
            System.out.println("Enter the answers(put space in between each answer): ");
            for(int i=0; i < key.length; i++)
            {
                if(kb.nextInt() == key[i])
                {
                    correct++;

                }
            }
            percent =(double)correct/numQuestions * 100;
            System.out.println("The student got " + correct + " answers correct which is " + percent + "%.");
            System.out.println("Grade another quiz?(y/n): ");
            grading = kb.nextLine();
            grading = kb.nextLine();
            
            percent = 0;
            correct = 0;
        }
    }
}
