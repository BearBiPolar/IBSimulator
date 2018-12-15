
/**
 * Write a description of class Money here.
 *
 * @author William Wang 
 * @version 2018-12-14 1.0
 */
public class Money
{
    // instance variables - replace the example below with your own
    private int balance;

    /**
     * Constructor for objects of class Money
     */
    public Money()
    {
        // initialise instance variables
        balance = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  amount of money being added in dollars
     */
    public void addMoney(int y)
    {
        //
        balance = balance + y;
    }
    
    /**
     * Returns the balance.
     *
     * @return    the balance
     */
    public int returnBalance()
    {
        // put your code here
        return balance;
    }
}
