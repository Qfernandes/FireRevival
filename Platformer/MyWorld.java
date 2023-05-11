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
        if(Greenfoot.getRandomNumber(200)<=5)
        
        {
            addObject(new Coin(),getWidth()-1, Greenfoot.getRandomNumber(20)+30);
            
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

        player.setLocation(139,631);

        player.setLocation(86,560);
        player.setLocation(81,648);
        player.setLocation(75,665);
        player.setLocation(70,648);

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

        player.setLocation(139,683);

        player.setLocation(176,591);
        Ground ground8 = new Ground();
        addObject(ground8,188,641);
        ground8.setLocation(195,643);
        ground2.setLocation(1305,646);
        removeObject(ground7);
        removeObject(ground8);
        ground.setLocation(909,656);
        removeObject(ground6);
        ground.setLocation(1072,628);
        removeObject(ground5);
        ground2.setLocation(1099,627);
        removeObject(ground4);
        ground.setLocation(1168,768);
        removeObject(ground3);
        ground2.setLocation(1560,725);
        removeObject(ground2);
        ground.setLocation(1791,711);
        ground.setLocation(1072,732);
        ground.setLocation(1204,741);
        ground.setLocation(1108,753);
        ground.setLocation(200,770);
        player.setLocation(155,723);
        player.setLocation(148,692);
        ground.setLocation(1132,759);
        ground.setLocation(40,778);
        player.setLocation(48,716);
        ground.setLocation(930,755);
        ground.setLocation(216,760);
        player.setLocation(87,586);
        Ground ground9 = new Ground();
        addObject(ground9,410,686);
        ground9.setLocation(422,688);
        player.setLocation(80,581);
        player.setLocation(203,696);
        ground9.setLocation(463,761);
        ground.setLocation(205,769);
        ground.setLocation(573,741);
        removeObject(ground);
        ground9.setLocation(156,743);
        removeObject(ground9);
        Ground ground10 = new Ground();
        addObject(ground10,66,740);
        ground10.setLocation(138,748);
        Ground ground11 = new Ground();
        addObject(ground11,492,555);
        ground11.setLocation(444,532);
        ground11.setLocation(379,677);
        Ground ground12 = new Ground();
        addObject(ground12,632,722);
        ground12.setLocation(378,745);
        ground12.setLocation(386,736);
        removeObject(ground12);
        Ground ground13 = new Ground();
        addObject(ground13,610,670);
        ground13.setLocation(728,664);
        ground13.setLocation(720,676);
        Ground ground14 = new Ground();
        addObject(ground14,964,716);
        ground14.setLocation(979,730);
        Ground ground15 = new Ground();
        addObject(ground15,1317,644);
        Ground ground16 = new Ground();
        addObject(ground16,1608,713);
        ground16.setLocation(1582,712);
        Ground ground17 = new Ground();
        addObject(ground17,1936,595);
        ground17.setLocation(1898,653);
        ground13.setLocation(656,690);
        coin3.setLocation(375,623);
        coin4.setLocation(653,572);
        coin5.setLocation(986,644);
        Coin coin6 = new Coin();
        addObject(coin6,1899,537);
        Enemy enemy = new Enemy();
        addObject(enemy,448,613);
        ground11.setLocation(392,748);
        ground13.setLocation(553,730);
        ground11.setLocation(631,749);
        ground14.setLocation(908,740);
        ground15.setLocation(1159,744);
        ground16.setLocation(1570,728);
        ground17.setLocation(1824,717);
        GroundHigh groundHigh = new GroundHigh();
        addObject(groundHigh,1136,401);
        GroundHigh groundHigh2 = new GroundHigh();
        addObject(groundHigh2,1489,367);
        groundHigh2.setLocation(1504,478);
        groundHigh.setLocation(1227,575);
        groundHigh2.setLocation(1516,594);
        groundHigh.setLocation(1166,624);
        groundHigh2.setLocation(1516,614);
        GroundHigh groundHigh3 = new GroundHigh();
        addObject(groundHigh3,1809,621);
        ground13.setLocation(340,670);
        player.setLocation(72,665);
    }
}
