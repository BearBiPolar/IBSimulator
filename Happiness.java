
/**
 * Write a description of class Happiness here.
 *
 * @author William Wang
 * @version 2018-12-14 1.0
 */
public class Happiness
{
    // instance variables - replace the example below with your own
    private int happiness;

    /**
     * Constructor for objects of class Happiness
     */
    public Happiness()
    {
        // initialise instance variables
        happiness = 75;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  amount of money being added in dollars
     */
    public void addHappiness(int y)
    {
        // adds to current happiness
        happiness = happiness + y;
        // happiness can not exceed 100
        if (happiness > 100)
        {
            happiness = 100;
        }
    }
    
    /**
     * Returns the happiness.
     *
     * @return    the happiness
     */
    public int returnHappiness()
    {
        // put your code here
        return this.happiness;
    }
}
