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
        Ground ground = new Ground();
        addObject(ground,45,341);
        ground.setLocation(94,366);
        Ground ground2 = new Ground();
        addObject(ground2,271,281);
        ground2.setLocation(311,270);
        Ground ground3 = new Ground();
        addObject(ground3,493,148);
        ground3.setLocation(510,158);
        Ground ground4 = new Ground();
        addObject(ground4,188,108);
        Ground ground5 = new Ground();
        addObject(ground5,1088,108);
        ground4.setLocation(168,115);
        ground.setLocation(89,689);
        ground2.setLocation(376,562);
        ground3.setLocation(661,422);
        ground4.setLocation(275,302);
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
        ground2.setLocation(436,564);
        ground.setLocation(161,680);

        player.setLocation(139,631);
        Ground ground6 = new Ground();
        addObject(ground6,911,288);
        ground6.setLocation(908,340);
        Ground ground7 = new Ground();
        addObject(ground7,1085,236);
        ground7.setLocation(1099,271);
        Ground ground8 = new Ground();
        addObject(ground8,1190,408);
        Ground ground9 = new Ground();
        addObject(ground9,1312,346);
        Ground ground10 = new Ground();
        addObject(ground10,1482,285);
        ground2.setLocation(276,629);
        ground4.setLocation(284,547);
        ground3.setLocation(581,570);
        ground6.setLocation(712,516);
        ground9.setLocation(482,454);
        ground7.setLocation(51,499);
        ground4.setLocation(291,522);
        ground4.setLocation(293,450);
        ground7.setLocation(112,408);
        ground6.setLocation(792,516);
        ground6.setLocation(732,640);
        ground8.setLocation(789,495);
        ground10.setLocation(641,336);
        ground5.setLocation(919,121);
        ground5.setLocation(888,691);
        ground8.setLocation(936,560);
        ground8.setLocation(948,560);
        Ground ground11 = new Ground();
        addObject(ground11,980,420);
        ground11.setLocation(966,462);
        ground10.setLocation(823,388);
        ground2.setLocation(331,618);
        ground9.setLocation(512,372);
        ground.setLocation(104,669);
        ground.setLocation(245,669);
        ground.setLocation(145,662);
        ground.setLocation(60,657);
        ground.setLocation(63,671);
        ground.setLocation(57,680);
        ground.setLocation(72,646);
        ground.setLocation(43,670);
        ground.setLocation(97,686);
        ground.setLocation(95,611);
        ground.setLocation(39,581);
        ground.setLocation(44,549);
        ground.setLocation(44,513);
        ground.setLocation(39,463);
        ground.setLocation(44,436);
        ground.setLocation(43,380);
        ground.setLocation(70,379);
        ground.setLocation(81,379);
        ground.setLocation(116,379);
        ground.setLocation(128,377);
        ground.setLocation(106,375);
        ground.setLocation(132,375);
        ground.setLocation(186,394);
        ground7.setLocation(134,640);
        ground.setLocation(112,400);
        ground.setLocation(147,341);
        ground.setLocation(205,320);
        ground.setLocation(201,283);
        ground.setLocation(173,362);
        ground.setLocation(214,396);
        ground.setLocation(184,344);
        player.setLocation(86,560);
        ground7.setLocation(71,657);
        ground7.setLocation(67,648);
        ground7.setLocation(119,673);
        ground7.setLocation(144,685);
        ground7.setLocation(55,675);
        ground7.setLocation(100,682);
        ground7.setLocation(27,676);
        ground7.setLocation(41,675);
        ground7.setLocation(86,678);
        ground7.setLocation(120,678);
        ground7.setLocation(77,688);
        ground2.setLocation(276,642);
        ground3.setLocation(388,598);
        ground6.setLocation(755,638);
        ground6.setLocation(606,542);
        ground5.setLocation(858,638);
        ground8.setLocation(760,566);
        ground11.setLocation(936,496);
        ground5.setLocation(937,631);
        player.setLocation(81,648);
        player.setLocation(75,665);
        player.setLocation(70,648);
        Ground ground12 = new Ground();
        addObject(ground12,1073,428);
        Ground ground13 = new Ground();
        addObject(ground13,1944,364);
        Ground ground14 = new Ground();
        addObject(ground14,2233,447);
        Ground ground15 = new Ground();
        addObject(ground15,1139,625);
        Ground ground16 = new Ground();
        addObject(ground16,1198,527);
        Ground ground17 = new Ground();
        addObject(ground17,1398,520);
        Ground ground18 = new Ground();
        addObject(ground18,1600,515);
        Ground ground19 = new Ground();
        addObject(ground19,1773,510);
        ground19.setLocation(1920,509);
        Ground ground20 = new Ground();
        addObject(ground20,1992,449);
        ground19.setLocation(1788,507);
        Ground ground21 = new Ground();
        addObject(ground21,3614,254);
        Ground ground22 = new Ground();
        addObject(ground22,3444,421);
        Ground ground23 = new Ground();
        addObject(ground23,4989,333);
        Ground ground24 = new Ground();
        addObject(ground24,4824,387);
        Ground ground25 = new Ground();
        addObject(ground25,4605,438);
        Ground ground26 = new Ground();
        addObject(ground26,4392,431);
        Ground ground27 = new Ground();
        addObject(ground27,4152,426);
        Ground ground28 = new Ground();
        addObject(ground28,3876,414);
        Ground ground29 = new Ground();
        addObject(ground29,3150,416);
        Ground ground30 = new Ground();
        addObject(ground30,2918,400);
        ground30.setLocation(2888,424);
        Ground ground31 = new Ground();
        addObject(ground31,2694,413);
        ground31.setLocation(2628,426);
        Ground ground32 = new Ground();
        addObject(ground32,2401,438);
        ground32.setLocation(2435,438);
        Ground ground33 = new Ground();
        addObject(ground33,3636,410);
        ground33.setLocation(3675,410);
        removeObject(ground23);
        removeObject(ground24);
        removeObject(ground25);
        removeObject(ground26);
        ground17.setLocation(1353,435);
        ground18.setLocation(1401,512);
        ground28.setLocation(1883,584);
        removeObject(ground33);
        ground27.setLocation(1735,414);
        ground32.setLocation(1384,316);
        ground32.setLocation(1487,529);
        ground18.setLocation(1563,507);
        ground32.setLocation(1574,515);
        ground19.setLocation(1687,434);
        ground19.setLocation(1674,428);
        ground19.setLocation(1677,424);
        ground27.setLocation(1663,404);
        ground27.setLocation(1641,405);
        ground27.setLocation(1688,412);
        ground28.setLocation(1322,454);
        ground20.setLocation(1064,644);
        ground22.setLocation(1856,376);
        ground22.setLocation(1928,282);
        ground22.setLocation(1950,484);
        ground22.setLocation(1934,466);
        ground22.setLocation(1108,545);
        ground30.setLocation(1252,541);
        ground22.setLocation(877,511);
        ground22.setLocation(1954,473);
        ground14.setLocation(1947,432);
        ground29.setLocation(1900,495);
        ground22.setLocation(1896,483);
        ground31.setLocation(1884,418);
        ground13.setLocation(1492,320);
        ground21.setLocation(1455,312);
        ground20.setLocation(1220,638);
        ground8.setLocation(968,513);
        ground5.setLocation(596,555);
        ground30.setLocation(1167,544);
        ground3.setLocation(489,593);
        ground8.setLocation(842,537);
        ground11.setLocation(823,526);
        ground20.setLocation(1097,641);
        ground16.setLocation(1151,532);
        ground31.setLocation(1100,428);
        ground12.setLocation(1077,435);
        ground14.setLocation(754,388);
        ground10.setLocation(872,398);
        ground10.setLocation(676,419);
        ground10.setLocation(695,402);
        ground10.setLocation(695,397);
        ground10.setLocation(739,399);
        ground28.setLocation(1300,449);
        ground28.setLocation(1300,449);
        ground28.setLocation(1308,446);
        ground28.setLocation(1285,448);
        ground28.setLocation(1406,421);
        ground17.setLocation(1400,435);
        ground3.setLocation(440,612);
        ground20.setLocation(1174,644);
        ground5.setLocation(620,608);
        removeObject(ground5);
        removeObject(ground10);
        removeObject(ground12);
        removeObject(ground8);
        removeObject(ground20);
        removeObject(ground30);
        removeObject(ground29);
        removeObject(ground17);
        removeObject(ground13);
        removeObject(ground19);
        removeObject(ground32);
        cloud5.setLocation(1176,77);
        cloud5.setLocation(1124,95);
        cloud4.setLocation(840,188);
        cloud3.setLocation(592,92);
        player.setLocation(151,659);
        ground2.setLocation(544,651);
        ground3.setLocation(283,650);
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
    }
}
