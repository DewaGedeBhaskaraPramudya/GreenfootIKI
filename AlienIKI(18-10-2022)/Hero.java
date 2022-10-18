import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    World w;
    
    public void act()
    {
        w = getWorld();
        moveWithKeyboard();
        shooter();
        heroDie();
        
    }
    public void moveWithKeyboard()
    {
        if (Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(), getY() - 10);
        }
        if (Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(), getY() + 10);
        }
        if (Greenfoot.isKeyDown("a"))
        {
            setLocation(getX() - 10, getY());
        }
        if (Greenfoot.isKeyDown("d"))
        {
            setLocation(getX() + 10, getY());
        }
    }
    int shooterTimer = 0;
    public void shooter(){
        if(shooterTimer==30)
        {
            getWorld().addObject(new Shoot(), getX()+50, getY());
            shooterTimer = 0;
        }else{
            shooterTimer++;
        }
    }
       
    public void heroDie(){
        if(isTouching(Enemy.class)){
        removeTouching(Enemy.class);
        Boom boom=new Boom();
        getWorld().addObject(boom,getX(), getY());
        setLocation(87,377);
        }
    }
   
}
