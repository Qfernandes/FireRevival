import greenfoot.*;
/**
 * This class is where the counter is created.
 * 
* @Quincy
 * @Shakthy
 * @version1
 */
// Create Counter class 
public class Counter extends Actor
{
    /**
     * Variables are created and created an counter to see the score, cash and time
     */
    int score;
    int money;
    int time;
    public Counter()
    {
        setImage(new GreenfootImage("Score: " + score + "\n Cash: " + money + "\n Time: " + time/60, 40, Color.BLACK, new Color(0,0,0,0)));
        
    }
    public void act()
    {
        time++;
        setImage(new GreenfootImage("Score: " + score + "\n Cash: " + money + "\n Time: " + time/60 , 40, Color.BLACK, new Color(0,0,0,0)));
    }
}
