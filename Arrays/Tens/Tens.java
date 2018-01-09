
/**
 * Write a description of class Tens here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tens
{
    public static void main(String[] args)
    {
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++)
        {
            nums[i] = 10 * i + 10;
        }
        for (int i=0; i < nums.length; i++)
        {
            System.out.print(nums[i] + " ");
        }
    }
}
