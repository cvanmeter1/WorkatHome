// **********************************************************
//   Count.java
//
//   This program reads in strings (phrases) and counts the 
//   number of blank characters and certain other letters
//   in the phrase.
// **********************************************************

import java.util.Scanner;

public class Count
{
    public static void main (String[] args)
    {
        String phrase;    // a string of characters
        int countBlank;   // the number of blanks (spaces) in the phrase 
        int length;       // the length of the phrase
        char ch;          // an individual character in the string
        int countA;
        int countE;
        int countS;
        int countT;
        Scanner scan = new Scanner(System.in);

        // Print a program header
        System.out.println ();
        System.out.println ("Character Counter");
        System.out.println ();

        // Read in a string and find its length
        System.out.print ("Enter a sentence or phrase or enter quit to stop: ");
        phrase = scan.nextLine();
        length = phrase.length();

        // Initialize counts
        countBlank = 0;
        countA = 0;
        countE = 0;
        countS = 0;
        countT = 0;
        // a for loop to go through the string character by character
        // and count the blank spaces
        while (!phrase.equals("quit"))
        {
            
            for(int i=0;i < length; i++)
            {
                ch = phrase.charAt(i);

                switch(ch)
                {
                    case 'a':
                    case 'A': countA++;
                    break;
                    case 'e':
                    case 'E': countE++;
                    break;
                    case 's':
                    case 'S': countS++;
                    break;
                    case 't':
                    case 'T': countT++;
                    break;
                    case ' ': countBlank++;
                    break;
                    default:System.out.print("");
                }
            }
            
            System.out.println ();
            System.out.println ("Number of blank spaces: " + countBlank);
            System.out.println ("Number of a's in the sentence or phrase: " + countA);
            System.out.println ("Number of e's in the sentence or phrase: " + countE);
            System.out.println ("Number of s's in the sentence or phrase: " + countS);
            System.out.println ("Number of t's in the sentence or phrase: " + countT);
            System.out.print ("Enter a sentence or phrase or enter quit to stop: ");
            phrase = scan.nextLine();
            length = phrase.length();
            
            countBlank = 0;
            countA = 0;
            countE = 0; 
            countS = 0;
            countT = 0;
            
        }
        // Print the results

    }
}