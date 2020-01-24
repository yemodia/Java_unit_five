// ****************************************************************
//   Student.java
//
//   Define a student class that stores name, score on test 1, and
//   score on test 2.  Methods prompt for and read in grades,
//   compute the average, and return a string containing student’s info.
// ****************************************************************
import java.util.Scanner;

public class Student
{
    //declare instance data
    public String studentName;
    public double score1;
    public double score2;

    Scanner scan = new Scanner(System.in);


    //-----------------------------------------------
    //constructor
    //-----------------------------------------------
    public Student(String studentName)
    {
        this.score1 = 0;
        this.score2 = 0;
        this.studentName = studentName;
        //add body of constructor
    }

    //-----------------------------------------------
    //inputGrades: prompt for and read in student's grades for test1 and test2.
    //Use name in prompts, e.g., "Enter's Joe's score for test1".
    //-----------------------------------------------
    public void inputGrades()
    {
        System.out.println("Enter a score for Test 1: ");
        this.score1 = scan.nextDouble();

        System.out.println("Enter a score for Test 2: ");
        this.score2 = scan.nextDouble();
    }

    //-----------------------------------------------


    //getAverage: compute and return the student's test average



    //-----------------------------------------------

    //add header for getAverage
    public double getAverage(){
        return (this.score1 + this.score2) / 2;
    }
        //add body of getAverage


    //-----------------------------------------------
    //getName: print the student's name
    //-----------------------------------------------

    public void printName(){
        System.out.println(this.studentName);
    }


    //add header for printName
    {
        //add body of printName
    }

    // toString method:  Output in the following format
    // Name: Joe  Test1: 85  Test2: 91
    public String toString(){
        return "Student Name: " + this.studentName + "\nTest1: " + this.score1 + "\nTest2: " + this.score2;
    }

}
