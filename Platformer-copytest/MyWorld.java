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
    int count = 0;
    //Spawnspeed will be faster if you lower value of spawnSpeed, If increase the value slower.
    //Spawnspeed at 30 to increase the spawn speed.
    int spawnSpeed = 30;
    int randomSpawn;
    //onstructor created 
    public Player mainPlayer = new Player();
    //created counter so counter can be accessed outside of world
    Counter counter = new Counter();
    HealthBar healthbar = new HealthBar();
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(2000, 800, 1);
        prepare();
        
        mainPlayer=new Player();
        //we have created our player
        addObject(mainPlayer, getWidth()/2,getHeight()/2);
        //counter is placed on side so users can see enemies coming through the counter
        addObject(counter, 130, 100);
        addObject(healthbar, mainPlayer.getX()-5, mainPlayer.getY()-60);
    }
    
    public Player getPlayer()
    {
        //I created this method, where I created a main player object return type, getting the player from World class
        return mainPlayer;
    }
    
    public void act()
    {
        if(Greenfoot.getRandomNumber(100)<=5)
        
        {
            addObject(new Coin(),getWidth()-1, Greenfoot.getRandomNumber(20)+30);
            
            count++;
            if(count % 600 == 0)
        {
            spawnSpeed--;
        }
        while(Greenfoot.isKeyDown("p")){
        Greenfoot.delay(1);
        }
        spawnEnemies(); 
        }
    }

    public void spawnEnemies()
    {
        //8 locations where the spawn enemies get added in the world and they will randomly go through all of these spawns
        //Added a switch with 8 cases as there will be 8 locations the enemies will be randomly coming 
        
        if(count % spawnSpeed == 0)
        {
            //it gets a random number whenever it gets to spawn and assigns the location case 0 through case 7
            //everytime we count and we have a new spawn everytime we count, we set random spawn equal to another greenfoot.getrandom number eight
            randomSpawn = Greenfoot.getRandomNumber(8);
            // switch is if, randomSpawn is variable, and each cases are condition and commands
            switch(randomSpawn){
                //if randomspawn== 0, it will add object enemy and put the enemy to 0,0 location (x, y value)
                //break is added to exit the case
                //case 0 : addObject(new Enemy(mainPlayer,counter),0,0);break; 
                // if random spawn==1, we add enemy at this location, half of the width of the world and 0 for height.
                //case 1 : addObject (new Enemy(mainPlayer,counter),getWidth()/2,0);break;
                //case 2 : addObject (new Enemy(mainPlayer,counter),getWidth(),0);break;
                // if random spawn==3, we add enemy at this location, half of the height and entire width.
                case 3 : addObject (new Enemy(mainPlayer,counter),0,getHeight()/2);break;
                case 4 : addObject (new Enemy(mainPlayer,counter),getWidth(),getHeight()/2);break;
                //case 5 : addObject (new Enemy(mainPlayer,counter),0,getHeight());break;
                //case 6 : addObject (new Enemy(mainPlayer,counter),getWidth()/2,getHeight());break;
                //case 7 : addObject (new Enemy(mainPlayer,counter),getWidth(),getHeight());break;


            
            } 
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
        removeObject(player);
        ground13.setLocation(1218,464);
        ground13.setLocation(1056,479);
        coin4.setLocation(687,601);
        Counter counter = new Counter();
        addObject(counter,580,61);
        counter.setLocation(579,111);
        removeObject(groundHigh);
        removeObject(groundHigh2);
        ground13.setLocation(672,649);
        coin4.setLocation(897,510);
        coin5.setLocation(987,422);
        coin4.setLocation(1161,416);
        removeObject(groundHigh3);
        ground17.setLocation(1752,580);
        removeObject(ground17);
        coin5.setLocation(649,579);
        coin5.setLocation(754,584);
        ground13.setLocation(1068,436);
        Ground ground18 = new Ground();
        addObject(ground18,1304,536);
        coin2.setLocation(1649,495);
        coin4.setLocation(1096,395);
        counter.setLocation(767,116);
        coin3.setLocation(1289,469);
        coin4.setLocation(1100,362);
        coin3.setLocation(1304,487);
        ground13.setLocation(1107,456);
        ground18.setLocation(1364,536);
        coin3.setLocation(1354,488);
        ground18.setLocation(1440,536);
    }
}
