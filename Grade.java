
/**
 * Write a description of class Grade here.
 *
 * @author William Wang
 * @version 2018-12-15 1.0
 */
public class Grade
{
    // instance variables - replace the example below with your own
    private int grade;

    /**
     * Constructor for objects of class Grade
     */
    public Grade()
    {
        // initialise instance variables
        grade = 75;
    }

    /**
     * Adds grade to your current grade
     *
     * @param  y  amount of grade being added in percent
     */
    public void addGrade(int y)
    {
        // add to current grade
        grade = grade + y;
        // average can not exceed 100%
        if (grade > 100)
        {
            grade = 100;
        }
        
    }
    
    /**
     * Returns the grade.
     *
     * @return    the grade
     */
    public int returnGrade()
    {
        // put your code here
        return grade;
    }
}
