import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * Write a description of class OutputWindow here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OutputWindow
{
    // instance variables - replace the example below with your own
    private final int windowHeight = 480;
    private final int windowWidth = 720;

    private Label moneyLabel;
    private Label timeLabel;
    private Label healthLabel;
    private Label happinessLabel;
    private Label gradesLabel;
    private Label productivityLabel;

    Engine engine;

    Panel intro;

    Frame frame;

    Label name ;
    /**
     * Constructor for objects of class OutputWindow
     */
    public OutputWindow() 
    {
        // initialise instance variables

        engine = new Engine();

        frame = new Frame();

        frame.setLayout(new FlowLayout());

        intro = new Panel();

        frame.add(intro);
        name = new Label("name");
        intro.add(name);

        Panel stats = new Panel();          // Panel is a container

        frame.add(stats);
        moneyLabel = new Label("money: $" + engine.moneyValue());
        stats.add(moneyLabel);
        timeLabel = new Label("time: " + engine.timeValue());
        stats.add(timeLabel);
        healthLabel = new Label("health: " + engine.healthValue() + "%");
        stats.add(healthLabel);
        Label happinessLabel = new Label("happiness: " + engine.happinessValue());
        stats.add(happinessLabel);
        Label gradesLabel = new Label("grades: " + engine.gradesValue());
        stats.add(gradesLabel);

        Frame bottom = new Frame();
        Panel bot = new Panel();
        bottom.add(bot);
        productivityLabel = new Label(engine.productivityValue());
        bot.add(productivityLabel);
        
        Panel text = new Panel();
        JTextField action = new JTextField();
        text.add(action);

        frame.setTitle("IB Simulator");  // "super" Frame sets its title
        frame.setSize(windowWidth, windowHeight);        // "super" Frame sets its initial window size
        frame.setVisible(true);

        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void setNewValues()
    {
        moneyLabel.setText("Money: $" + engine.moneyValue());
        timeLabel.setText("Time: " + engine.timeValue());
        healthLabel.setText("Health: " + engine.healthValue() + "%");
        happinessLabel.setText("Happiness: " + engine.happinessValue() + "%");
        gradesLabel.setText("Grades: " + engine.gradesValue() + "%");
        productivityLabel.setText("Productivity: " + engine.productivityValue() + "%");
    }
}
