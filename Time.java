
/**
 * Write a description of class Time here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Time
{
    // instance variables - replace the example below with your own
    private static int minutes;
    private static int hours;
    private int days;
    private int months;
    private int years;

    /**
     * Constructor for objects of class Time
     */
    public Time()
    {
        // initialise instance variables
        minutes = 0;
        hours = 0;
        days = 0;
        months = 0;
        years = 0;
    }

    /**
     * Adds the amount of user specified time.
     *
     * @param  y  the amount of time added in minutes
     */
    public void addTime(int y)
    {
        // put your code here
        minutes = minutes + y;        
        while (minutes > 59)
        {
            minutes = minutes - 60;
            hours = hours + 1;
        }  
        while (hours > 23)
        {
            hours = hours - 24;
            days = days + 1;
        }
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @return    the time
     */
    public String returnTime()
    {
        if (minutes < 10)
        {
            return hours + ":0" + minutes;   
        }
        else
        {
            return hours + ":" + minutes;
        }
    }

    private void timeFixer ()
    {
        boolean isDone = false;

        /*
        do
        {
        if(days > 29)
        {
        switch (months)
        {
        case 2:
        case 4:
        case 6:
        case 9:
        case 11:
        smallMonth();
        break;
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
        if (days == 30)
        {
        isDone = true;
        }
        else
        {
        bigMonth();
        }
        break;  
        }
        }
        else
        {
        isDone = true;
        }
        } while (!isDone);
         */

    }

    private void bigMonth()
    {
        this.days = days - 31;
        this.months = months + 1;
    }

    private void smallMonth()
    {
        this.days = days - 30;
        this.months = months + 1;
    }
}

