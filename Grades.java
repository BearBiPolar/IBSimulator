
/**
 * Write a description of class gradeshere.
 *
 * @author William Wang
 * @version 2018-12-15 1.0
 */
public class Grades
{
    // instance variables - replace the example below with your own
    private int grades;

    /**
     * Constructor for objects of class Grade
     */
    public Grades()
    {
        // initialise instance variables
        grades= 75;
    }

    /**
     * Adds gradesto your current grade
     *
     * @param  y  amount of gradesbeing added in percent
     */
    public void addGrades(int y)
    {
        // add to current grade
        grades= grades+ y;
        // average can not exceed 100%
        if (grades> 100)
        {
            grades= 100;
        }
        
    }
    
    /**
     * Returns the grade.
     *
     * @return    the grade
     */
    public int returnGrades()
    {
        // put your code here
        return grades;
    }
}
