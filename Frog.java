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
        
        getEatenByAlien();
        if (getWorld() == null) return; 
        //move(2);
    }
    
    public void getEatenByAlien(){
        Actor frog = getOneObjectAtOffset(0, 0, Alien.class);
        if (frog != null) {
            try{getWorld().removeObject(this);    }
            catch(Exception e){
                 getWorld().addObject(new ScoreBoard(800, 600), 700, 600); 
            }
        }
    }
  
    public void checkKeyPress(){
        
        if(Greenfoot.isKeyDown("up")){
            setLocation(getX(), getY()-frogSpeed); 
            setRotation(270);
        }
        
        if (Greenfoot.isKeyDown("down")){
            setLocation(getX(), getY()+frogSpeed);
            setRotation(90);
            }
            
        if(Greenfoot.isKeyDown("right")){
            setLocation(getX()+frogSpeed, getY());
            setRotation(0);       
        }
        
        if(Greenfoot.isKeyDown("left")){
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
