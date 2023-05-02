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
    private int collect=0;
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAround();
        checkFalling();
        collect();
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
        if(Greenfoot.isKeyDown("space")&&(onGround2()==true)) 
        {
            vSpeed = jumpHeight;
            fall();
        }
        if(Greenfoot.isKeyDown("space")&&(onGround3()==true)) 
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
    boolean onGround2()
    {
      Actor under2 = getOneObjectAtOffset(0, getImage().getHeight()/2, GroundMid.class);
      return under2 != null;  
    }
     boolean onGround3()
    {
      Actor under3 = getOneObjectAtOffset(0, getImage().getHeight()/2, GroundHigh.class);
      return under3 != null;
    }
    public void checkFalling()
    {
        if (onGround()== false || onGround2()==false || onGround3()==false)
        {
            fall();
        }
        if (onGround()== true || onGround2()==true || onGround3()==true)
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
            collect++;
        }
        if(collect==10)
        {
            getWorld().addObject(new SecretDoor(), 1950, 450);
        }
    }
}
