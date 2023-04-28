import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Ground ground = new Ground();
        addObject(ground,152,688);
        ground.setLocation(157,664);
        Ground ground2 = new Ground();
        addObject(ground2,377,560);
        Ground ground3 = new Ground();
        addObject(ground3,206,432);
        ground3.setLocation(184,438);
        ground3.setLocation(117,505);
        Ground ground4 = new Ground();
        addObject(ground4,599,663);
        Ground ground5 = new Ground();
        addObject(ground5,782,571);
        Player player = new Player();
        addObject(player,133,628);
        Ground ground6 = new Ground();
        addObject(ground6,41,106);
        Ground ground7 = new Ground();
        addObject(ground7,162,215);
        Ground ground8 = new Ground();
        addObject(ground8,981,465);
        Ground ground9 = new Ground();
        addObject(ground9,532,374);
        Ground ground10 = new Ground();
        addObject(ground10,748,250);
        Ground ground11 = new Ground();
        addObject(ground11,942,156);
        player.setLocation(490,327);
        Ground ground12 = new Ground();
        addObject(ground12,457,389);
        ground12.setLocation(550,392);
        ground12.setLocation(552,387);
        ground12.setLocation(590,388);
        ground12.setLocation(607,385);
        ground12.setLocation(499,412);
        ground12.setLocation(518,382);
        ground12.setLocation(510,382);
    }
}
