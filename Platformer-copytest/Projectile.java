import greenfoot.*;
/**
 * Created Projectiles class, so the player able to fire projectiles at the enemies
 * 
 * @Quincy
 * @Shakthy
 * @version1
 */
public class Projectile extends Actor
{
    /**
     * The Projectile is created, and created an act method to remove enemies when the projectiles interesect to the enemies.
     */
    
    int speed = 10;   
    public Projectile()
    {
        getImage().scale(30,30);
    }
    public void act()
    {
        move(10);
        if(isAtEdge())
        {
            getWorld().removeObject(this);
        }
    
    }
}