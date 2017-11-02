// ****************************************************************
//   Grades.java
//
//   Use Student class to get test grades for two students
//   and compute averages
//          
// ****************************************************************
public class Grades
{
    public static void main(String[] args)
    {
        Student student1 = new Student("Mary");
        //create student2, "Mike"
        Student student2 = new Student("Mike");
        //input grades for Mary
        student1.inputGrades();
        //print average for Mary
        System.out.println("Test average for " + student1.printName() + ": " + student1.getAverage());

        //input grades for Mike
        student2.inputGrades();
        //print average for Mike
        System.out.println("Test average for " + student2.printName() + ": " + student2.getAverage());
        System.out.println("\nStudent 1: " + student1);
        System.out.println("\nStudent 2: " + student2);
    }
}