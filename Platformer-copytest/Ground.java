import greenfoot.*;
/**
 * This class is where the Ground is created for the player to move, jump on.
* @Quincy
 * @Shakthy
 * @version1
 */
public class Ground extends Actor
{
    public Ground()
    {
       getImage().scale(getImage().getWidth()*8,getImage().getHeight()*4);   
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            move(-4);
        }
        if(Greenfoot.isKeyDown("left"))
        {
            move(4);
        }
        if(getX()==0)
        {
            setLocation(getWorld().getWidth()-1,Greenfoot.getRandomNumber(100)+612);
        }
    }
}
