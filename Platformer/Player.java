import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    private int vSpeed = 0;
    private int acceleration = 1;
    private int jumpHeight= -20;
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAround();
        checkFalling();
        collect();
        fireProjectile();
    }
    public void fireProjectile()
    {
        if(Greenfoot.mousePressed(null))
        {
            getWorld().addObject(new Projectile(), getX(),getY());
        }
    }
        
    private void fall()
    {
        setLocation(getX(), getY() + vSpeed);
        vSpeed = vSpeed + acceleration;
    }
    public void moveAround()
    {
        if(Greenfoot.isKeyDown("space")&&(onGround()==true)) 
        {
            vSpeed = jumpHeight;
            fall();
        }
        
    }    
    boolean onGround()
    {
        Actor under = getOneObjectAtOffset(0, getImage().getHeight()/2, Ground.class);
        return under != null;
    }
    public void checkFalling()
    {
        if (onGround()== false)
        {
            fall();
        }
        if (onGround()== true)
        {
            vSpeed = 0;
        }
    }
    public void collect()
    {
        Actor coin = getOneIntersectingObject(Coin.class);
        if (coin!=null)
        {
            getWorld().removeObject(coin);
        }
    }
}
