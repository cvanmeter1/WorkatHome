// ****************************************************************
//   Student.java
//
//   Define a student class that stores name, score on test 1, and
//   score on test 2.  Methods prompt for and read in grades, 
//   compute the average, and return a string containing student�s info. 
// ****************************************************************
import java.util.Scanner;

public class Student
{
    //declare instance data 
    private String name;
    private int test1;
    private int test2;
    private double average;
    //-----------------------------------------------
    //constructor
    Scanner kb = new Scanner(System.in);
    //-----------------------------------------------
    public Student(String studentName)
    {
        //add body of constructor
        test1 = 0;
        test2 = 0;
        name = studentName;
        average = 0;
    }

    //-----------------------------------------------
    //inputGrades: prompt for and read in student's grades for test1 and test2.
    //Use name in prompts, e.g., "Enter's Joe's score for test1".
    //-----------------------------------------------
    public void inputGrades()
    {
        //add body of inputGrades
        System.out.println("Enter " + name + "'s test score for test 1: ");
        test1 = kb.nextInt();
        System.out.println("Enter " + name + "'s test score for test 2: ");
        test2 = kb.nextInt();
    }

    //-----------------------------------------------
    //getAverage: compute and return the student's test average
    
    //-----------------------------------------------

    //add header for getAverage
    public double getAverage()
    {
        //add body of getAverage
        average = (test1 + test2) / 2;
        return average;
    }

    //-----------------------------------------------
    //getName: print the student's name
    
    //-----------------------------------------------

    //add header for printName
    public String printName()
    {
        //add body of printName
        return name;
    }
    public String toString()
    {
        return ("Name: " + name + "\nTest1: " + test1 + "\nTest2: " + test2);
    }
}