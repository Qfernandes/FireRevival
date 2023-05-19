import greenfoot.*;
/**
 * The Enemy class is where we created the enemy, and can access the player and counter class
 * 
 * @Quincy
 * @Shakthy
 * @version1
 */
public class Enemy extends Actor
{
    /**
     * Variables are created. Created an enemy and Player and Counter is accessable to this class.
     */
    int animateImage = 0;
    int animateSpeed = 50;
    int count;
    int health = 2;
    Player player;
    Counter counter;
    public Enemy(Player mainPlayer,Counter counter)
    {
     this.counter = counter;
     player = mainPlayer;
     setImage("survivor-idle_handgun_16.png");
     getImage().scale(80,80);
    }
    public void act()
    {
        count++;
        animate();
        moveAround();
        hitByProjectile();
    }
    /**
     * Created an animate method to animate the enemy.
     */
    public void animate()
    {
        if(count % animateSpeed ==0)
        {
            if(animateImage > 2){
                animateImage = 0;
            }
            setImage("survivor-move_handgun_"+animateImage + ".png");
            animateImage++;
            getImage().scale(80,80);
        }
    }
    /**
     * The moveAround method follows the player
     */
    public void moveAround()
    {
        move(1);
        turnTowards(player.getX(),player.getY());        
    }
    /**
     * The hitByProjectile method is when the projectile hits the enemy, it removes the enemy
     */
    public void hitByProjectile()
    {
        Actor projectile = getOneIntersectingObject(Projectile.class);
        if(projectile != null)
        {
            health--;
            getWorld().removeObject(projectile);
        }
        if(health == 0)
        {
            counter.score++;
            counter.money+=5;
            getWorld().removeObject(this);
        }
    }
}
