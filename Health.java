
/**
 * Write a description of class Health here.
 *
 * @author William Wang
 * @version 2018-12-14 1.0
 */
public class Health
{
    // instance variables - replace the example below with your own
    private int health;

    /**
     * Constructor for objects of class Health
     */
    public Health()
    {
        // initialise instance variables
        health = 75;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  amount of money being added in dollars
     */
    public void addHealth(int y)
    {
        // adds to current health
        health = health + y;
        // health can not exceed 100%
        if (health > 100)
        {
            health = 100;
        }
    }
    
    /**
     * Returns the health.
     *
     * @return    the health
     */
    public int returnHealth()
    {
        // put your code here
        return health;
    }
}
