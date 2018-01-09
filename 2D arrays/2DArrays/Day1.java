
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.*;
import java.util.*;
/**
 * Write a description of class Day1 here.
 *
 * @author Christian VanMeter
 * @version 12/6/2017
 */
public class Day1
{
    public static void main(String[] args) throws IOException
    {
        int sum = 0;
        int nextNum = 0;
        String data;
        int first = 0;
        int last = 0;
        int current = 0;
        int next = 0;
        data = Files.readAllLines(Paths.get("H:\\Github\\WorkatHome\\2D arrays\\2DArrays\\inputData.txt")).get(0);
        first = Character.getNumericValue(data.charAt(0));
        last = Character.getNumericValue(data.charAt(data.length()-1));
        for(int i = 0; i < data.length()-1;i++)
        {
        
            next = Character.getNumericValue(data.charAt(i+1));
            current = Character.getNumericValue(data.charAt(i));
            if(current == next)
            {
                sum += current;
            }
            
        }
        if(first == last)
        {
            sum += first;
        }
        System.out.println(sum);
        
    }
}
