import greenfoot.*;
/**
 * Created the Health bar in this class, so the player can see their health

 * 
 * @Quincy
 * @Shakthy
 * @version1
 */
public class HealthBar extends Actor
{
    /**
     * The health bar is created and displays above the player. The health bar will reduces when the enemy hits on the player.
     */
    int health = 50;
    public HealthBar()
    {
        setImage(new GreenfootImage(52, 12));
        getImage().drawRect(0,0,51,11);
        getImage().setColor(Color.RED);
        getImage().fillRect(1,1,health,10);
        
    }
    public void act()
    {
        setImage(new GreenfootImage(52, 12));
        getImage().drawRect(0,0,51,11);
        getImage().setColor(Color.RED);
        getImage().fillRect(1,1,health,10);
        World world = getWorld();
        MyWorld myWorld = (MyWorld)world;
        setLocation(myWorld.getPlayer().getX()-5, myWorld.getPlayer().getY()-50);
        loseHealth();
    }
    /**
     * This loseHealth method is when the enemy hits the player, the health bar reduces
     * If all health bar is lost, the game is over and the end screen will display.
     */
    public void loseHealth()
    {
        World world = getWorld();
        MyWorld myWorld = (MyWorld)world;
        if(myWorld.getPlayer().hitByEnemy())
        {
            health--;
        }
        if(health<=0)
        {
          Greenfoot.stop();
          getWorld().showText("Game Over...you survived for " + (myWorld.getPlayer().time/60) + "seconds", getWorld().getWidth()/2, getWorld().getHeight()/2);
        }
}
}
