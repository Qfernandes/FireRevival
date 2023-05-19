import greenfoot.*;
/**
 * The Coin class is where the coins are created, and can remove coins
 * 
 * @Quincy
 * @Shakthy
 * @version1
 */
public class Coin extends Actor
{
    /**
     * The act method can remove coin objects, when the player intersects with it.
     */
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
            getWorld().removeObject(this);
        }
    }
}
