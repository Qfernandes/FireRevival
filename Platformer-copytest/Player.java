import greenfoot.*;
/**
 * In this class, player is created and player is able to fire projectiles, manoeuvre and collect coins.
 * 
 * @Quincy
 * @Shakthy
 * @version1
 */
public class Player extends Actor
{
    private int vSpeed = 0;
    private int acceleration = 1;
    private int jumpHeight= -20;
    int speed = 3;
    int time = 0;
    /**
     * In the act method, the player can able to move, fall, collect coins, fire projeciles to the enemy.
     */
    public void act()
    {
        moveAround();
        checkFalling();
        collect();
        fireProjectile();

        turnAround();
        moveAround();
        time++;
        hitByEnemy();
    }
    public void fireProjectile()
    {
        if(Greenfoot.mousePressed(null))
        {
            Projectile projectile = new Projectile();
            getWorld().addObject(projectile, getX(),getY());
            projectile.setRotation(getRotation());
            projectile.move(25);
        }
    }
        
    private void fall()
    {
        setLocation(getX(), getY() + vSpeed);
        vSpeed = vSpeed + acceleration;
    }
    //added just now
    public void turnAround()
    {
        if(Greenfoot.getMouseInfo() !=null)
        turnTowards(Greenfoot.getMouseInfo().getX(),Greenfoot.getMouseInfo().getY());
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
   public boolean hitByEnemy()
    {
    Actor enemy = getOneObjectAtOffset(0,0,Enemy.class);
    if(enemy!=null)
    
    {
       return true; 
    }
    else
    return false;
    }

}