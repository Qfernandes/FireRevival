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
        super(2000, 800, 1);
        prepare();
    }
    public void act()
    {
        if(Greenfoot.getRandomNumber(100)<=5)
        
        {
            addObject(new Coin(), getWidth()-1, Greenfoot.getRandomNumber(250)+500);
        }
        
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Player player = new Player();
        addObject(player,49,655);
        player.setLocation(49,659);
        Cloud cloud = new Cloud();
        addObject(cloud,112,32);
        cloud.setLocation(134,50);
        Cloud cloud2 = new Cloud();
        addObject(cloud2,289,135);
        cloud2.setLocation(315,173);
        Cloud cloud3 = new Cloud();
        addObject(cloud3,475,71);
        Cloud cloud4 = new Cloud();
        addObject(cloud4,713,163);
        Cloud cloud5 = new Cloud();
        addObject(cloud5,806,61);
        cloud5.setLocation(843,57);
        cloud4.setLocation(668,187);

        player.setLocation(139,631);

        player.setLocation(86,560);
        player.setLocation(81,648);
        player.setLocation(75,665);
        player.setLocation(70,648);

        cloud5.setLocation(1176,77);
        cloud5.setLocation(1124,95);
        cloud4.setLocation(840,188);
        cloud3.setLocation(592,92);
        player.setLocation(151,659);

        Coin coin = new Coin();
        addObject(coin,1108,350);
        Coin coin2 = new Coin();
        addObject(coin2,825,468);
        Coin coin3 = new Coin();
        addObject(coin3,606,488);
        Coin coin4 = new Coin();
        addObject(coin4,740,341);
        Coin coin5 = new Coin();
        addObject(coin5,1159,494);
        coin3.setLocation(519,506);

        coin4.setLocation(536,327);
        coin3.setLocation(505,510);
        coin5.setLocation(978,612);
        coin.setLocation(1482,268);

        coin.setLocation(980,468);
        coin2.setLocation(826,356);
        coin.setLocation(967,468);
        coin2.setLocation(1323,585);
        coin.setLocation(1640,595);
        Ground ground = new Ground();
        addObject(ground,25,724);
        ground.setLocation(128,723);
        Ground ground2 = new Ground();
        addObject(ground2,284,726);
        ground2.setLocation(437,736);
        ground2.setLocation(371,725);
        ground2.setLocation(371,725);
        Ground ground3 = new Ground();
        addObject(ground3,650,731);
        Ground ground4 = new Ground();
        addObject(ground4,865,720);
        ground4.setLocation(1202,707);
        ground4.setLocation(1189,710);
        ground3.setLocation(991,736);
        ground4.setLocation(1150,724);
        ground2.setLocation(571,735);
        ground3.setLocation(827,731);
        ground2.setLocation(416,714);
        ground3.setLocation(841,728);
        Ground ground5 = new Ground();
        addObject(ground5,1368,724);
        ground5.setLocation(1530,715);
        ground5.setLocation(1581,723);
        Ground ground6 = new Ground();
        addObject(ground6,1711,719);
        Ground ground7 = new Ground();
        addObject(ground7,1877,726);
        ground5.setLocation(1330,717);
        ground6.setLocation(1616,736);
        ground3.setLocation(883,734);
        ground3.setLocation(736,724);
        ground4.setLocation(1000,720);
        GroundHigh groundHigh = new GroundHigh();
        addObject(groundHigh,267,570);
        GroundMid groundMid = new GroundMid();
        addObject(groundMid,556,562);
        groundMid.setLocation(586,568);
        GroundMid groundMid2 = new GroundMid();
        addObject(groundMid2,844,558);
        groundMid2.setLocation(884,568);
        GroundMid groundMid3 = new GroundMid();
        addObject(groundMid3,1138,565);
        GroundMid groundMid4 = new GroundMid();
        addObject(groundMid4,1444,571);
        GroundMid groundMid5 = new GroundMid();
        addObject(groundMid5,1796,501);
        GroundHigh groundHigh2 = new GroundHigh();
        addObject(groundHigh2,68,427);
        groundHigh2.setLocation(150,419);
        GroundHigh groundHigh3 = new GroundHigh();
        addObject(groundHigh3,350,414);
        groundHigh3.setLocation(376,427);
        GroundHigh groundHigh4 = new GroundHigh();
        addObject(groundHigh4,648,417);
        groundHigh4.setLocation(706,430);
        GroundHigh groundHigh5 = new GroundHigh();
        addObject(groundHigh5,922,433);
        groundHigh5.setLocation(996,436);
        groundHigh5.setLocation(931,438);
        GroundHigh groundHigh6 = new GroundHigh();
        addObject(groundHigh6,1264,423);
        GroundHigh groundHigh7 = new GroundHigh();
        addObject(groundHigh7,1544,420);
        groundHigh7.setLocation(1544,420);
        GroundHigh groundHigh8 = new GroundHigh();
        addObject(groundHigh8,1794,411);
        groundHigh8.setLocation(1843,415);
        groundMid5.setLocation(1804,569);
        player.setLocation(139,683);
        groundHigh8.setLocation(1811,343);
        groundHigh8.setLocation(1847,335);
        groundHigh8.setLocation(1730,328);
        groundHigh8.setLocation(1720,332);
        groundHigh8.setLocation(1847,331);
        groundHigh8.setLocation(1842,332);
        groundHigh8.setLocation(1806,330);
        groundHigh8.setLocation(1819,330);
        groundHigh8.setLocation(1836,336);
        groundHigh8.setLocation(1849,340);
        groundHigh8.setLocation(1890,364);
        groundHigh8.setLocation(1905,396);
        groundHigh8.setLocation(1854,424);
        groundHigh8.setLocation(1876,456);
        groundHigh8.setLocation(1839,420);
        groundHigh8.setLocation(1837,436);
    }
}
