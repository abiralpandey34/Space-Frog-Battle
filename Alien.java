import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class is a blueprint for Alien Actor.
 * 
 * @author Akash Banjade 
 * @version 1.1
 */
public class Alien extends Actor
{
    Frog frog;
    public int alienSpeed = 3;
    
    public Alien(Frog frog){
        this.frog = frog;
    };
    
    /**
     * Act - do whatever the Alien wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(2);
        turnTowards(this.frog.getX(), this.frog.getY());
        //world.turnAlienTowardFrog();
    }
}
