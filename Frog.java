import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class is a blueprint for Frog Actor.
 * 
 * @author Akash Banjade 
 * @version 1.1
 */
public class Frog extends Actor
{
    // public instance initialized when loading the class
    private static final Frog freddy = new Frog();
     
    //Applying Singleton Design Pattern.5
    public static Frog getInstance(){
        return freddy;
    }
    
    int frogSpeed = 5; 
      
    /**
     * Act - do whatever the Plane wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkKeyPress();
        
        if (getWorld() == null) return; 
        getEatenByAlien();

        //move(2);
    }
    
    /*This method checks if frog is touching the alien and
     * shows the "GAME OVER" message when frog gets touched 
     * by alien  */
    public void getEatenByAlien(){
        Actor alien = getOneObjectAtOffset(0, 0, Alien.class);
        if (alien != null){
            getWorld().removeObject(null);

            //Displaying Gameover Message. 
            Greenfoot.playSound("gameover.wav");
            GreenfootImage bg = new GreenfootImage("gameover.png");
            bg.scale(getWorld().getWidth(), getWorld().getHeight());
            getWorld().setBackground(bg);
            
            Greenfoot.stop();
            return;
        }

    }
    
    //Key Listener to listen to Frog Movement user Input.
    public void checkKeyPress(){
        
        if(Greenfoot.isKeyDown("up") || Greenfoot.isKeyDown("w")){
            setLocation(getX(), getY()-frogSpeed); 
            setRotation(270);
        }
        
        if (Greenfoot.isKeyDown("down") || Greenfoot.isKeyDown("s")){
            setLocation(getX(), getY()+frogSpeed);
            setRotation(90);
            }
            
        if(Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("d")){
            setLocation(getX()+frogSpeed, getY());
            setRotation(0);       
        }
        
        if(Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("a")){
            setLocation(getX()-frogSpeed, getY());
            setRotation(180);      
        }
        
    }
    
    public int getFrogX(){
        return this.getX();
    }
    
    public int getFrogY(){
        return this.getY();
    }
}
