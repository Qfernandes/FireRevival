import greenfoot.*;
/**
 * MyWorld is a class. Actors can get accessed here.

 * 
 * @Quincy
 * @Shakthy
 * @version1
 */
public class MyWorld extends World
{
    /**
     * I created delared variables and player, counter and health bar constructor for objects
     * 
     */
    int count = 0;
    int spawnSpeed = 30;
    int randomSpawn;
    public Player mainPlayer = new Player();
    Counter counter = new Counter();
    HealthBar healthbar = new HealthBar();
    /**
     * Creation of MyWorld and created objects
     * 
     */
    public MyWorld()
    {    
        super(2000, 800, 1);
        prepare();
        mainPlayer=new Player();
        addObject(mainPlayer, getWidth()/2,getHeight()/2);
        addObject(counter, 130, 100);
        addObject(healthbar, mainPlayer.getX()-5, mainPlayer.getY()-60);
    }
    public Player getPlayer()
    {
        return mainPlayer;
    }
    /**
     * Created an act method for spawn enemies and coins to randomly appear on the screen.
     * 
     */
    public void act()
    {
        if(Greenfoot.getRandomNumber(300)<=5)
        
        {
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = Greenfoot.getRandomNumber(600 + getHeight()/4);
            addObject(new Coin(),x,y);
        }
            count++;
            if(count % 600 == 0)
        {
            spawnSpeed--;
        }
        
        while(Greenfoot.isKeyDown("p"))
        {
        Greenfoot.delay(1);
        }
    spawnEnemies();
    }
    /**
     * Created a switch so enemies appear randomly at the left side
     * 
     */
    public void spawnEnemies()
    {
        if(count % spawnSpeed == 0)
        {
            randomSpawn = Greenfoot.getRandomNumber(8);
            switch(randomSpawn)
            {
                case 1 : addObject (new Enemy(mainPlayer,counter),getWidth(),getHeight()/2);break;
            } 
        }
    }   
    /**
     * Prepare method automatically created by greenfoot and create objects in design view and have the code written for you so it can arrange the placements of these manually 
     */
    private void prepare()
    {
        Ground ground = new Ground();
        addObject(ground,992,445);
        ground.setLocation(1073,459);
        ground.setLocation(1024,455);
        Ground ground2 = new Ground();
        addObject(ground2,1248,390);
        ground2.setLocation(1339,510);
        Ground ground3 = new Ground();
        addObject(ground3,1577,404);
        ground3.setLocation(1619,436);
        Ground ground4 = new Ground();
        addObject(ground4,1270,278);
        ground4.setLocation(1336,280);
        Ground ground5 = new Ground();
        addObject(ground5,1920,294);
        ground5.setLocation(1991,324);
        ground5.setLocation(1896,375);
        Ground ground6 = new Ground();
        addObject(ground6,1937,608);
        Ground ground7 = new Ground();
        addObject(ground7,1567,627);
        ground7.setLocation(1568,645);
        Counter counter = new Counter();
        addObject(counter,836,97);
        Coin coin = new Coin();
        addObject(coin,1339,447);
        ground2.setLocation(1276,504);
        coin.setLocation(1292,456);
        ground4.setLocation(1368,220);
        ground3.setLocation(1468,425);
        ground5.setLocation(1708,477);
        Ground ground8 = new Ground();
        addObject(ground8,1992,518);
        ground8.setLocation(2028,519);
        ground3.setLocation(1464,424);
        ground5.setLocation(1701,421);
        ground6.setLocation(816,595);
        ground8.setLocation(1916,532);
        Coin coin2 = new Coin();
        addObject(coin2,1564,581);
        ground3.setLocation(1491,399);
        ground8.setLocation(1916,580);
        ground5.setLocation(1873,452);
        ground3.setLocation(1576,418);
        Coin coin3 = new Coin();
        addObject(coin3,1536,354);
        Coin coin4 = new Coin();
        addObject(coin4,1988,476);
        Coin coin5 = new Coin();
        addObject(coin5,1810,374);
        coin.setLocation(1141,397);
        Coin coin6 = new Coin();
        addObject(coin6,1278,439);
    }
}