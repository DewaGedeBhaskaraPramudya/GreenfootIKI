import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shoot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shoot extends Actor
{
    /**
     * Act - do whatever the Shoot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
        move(5);
        shootHit();
        
        // Add your action code here.
    }
    
    public void shootHit(){
         if (isTouching(Enemy.class)){
            removeTouching(Enemy.class);
            Boom boom = new Boom();
            getWorld().addObject(boom, getX(), getY());
            getWorld().removeObject(this);
        }else  if (isAtEdge())
        {
            World w = getWorld();
            w.removeObject(this);
        }
        }
}
