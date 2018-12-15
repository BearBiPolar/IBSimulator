
/**
 * Write a description of class Productivity here.
 *
 * @author William Wang
 * @version 2018-12-15 1.0
 */
public class Productivity
{
    // instance variables - replace the example below with your own
    private int productivity;

    /**
     * Constructor for objects of class Productivity
     */
    public Productivity()
    {
        // initialise instance variables
        productivity = 75;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void changeProductivity(int happiness, int health)
    {
        // put your code here
        productivity = (happiness + health) / 2;
    }
    
    /**
     * Returns the productivity.
     *
     * @return    the productivity
     */
    public int returnProductivity()
    {
        // put your code here
        return productivity;
    }
}
