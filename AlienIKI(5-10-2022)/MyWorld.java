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
        super(1280, 720, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Hero hero = new Hero();
        addObject(hero,120,212);
        hero.setLocation(188,302);
        hero.setLocation(87,377);
        Enemy enemy = new Enemy();
        addObject(enemy,1138,374);
        enemy.setLocation(1168,315);
        enemy.setLocation(1150,144);
        enemy.setLocation(1152,141);
        Enemy enemy2 = new Enemy();
        addObject(enemy2,1238,58);
        enemy2.setLocation(1234,58);
        enemy2.setLocation(1234,58);
        enemy2.setLocation(1234,69);
        enemy.setLocation(1151,432);
        enemy2.setLocation(1167,304);
        Enemy enemy3 = new Enemy();
        addObject(enemy3,1227,346);
        Enemy enemy4 = new Enemy();
        addObject(enemy4,1083,398);
        Enemy enemy5 = new Enemy();
        addObject(enemy5,1014,166);
        Enemy enemy6 = new Enemy();
        addObject(enemy6,996,547);
        Enemy enemy7 = new Enemy();
        addObject(enemy7,1063,270);
        Enemy enemy8 = new Enemy();
        addObject(enemy8,1076,497);
        Enemy enemy9 = new Enemy();
        addObject(enemy9,1244,142);
        Enemy enemy10 = new Enemy();
        addObject(enemy10,78,141);
        Enemy enemy11 = new Enemy(50);
        addObject(enemy11,1092,110);
    }
}
