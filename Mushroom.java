import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class is a blueprint for Mushroom Entity.
 * 
 * @author Akash Banjade 
 * @version 1.1
 */
public class Mushroom extends Actor
{
    Frog frog;
    
    
    public Mushroom(Frog frog){
        this.frog = frog;
    }
    /**
     * Act - do whatever the Mushroom wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        getEatenByFrog();
        if (getWorld() == null) return; 
    
    }
    
    public void getEatenByFrog(){
       Actor frog = getOneObjectAtOffset(0, 0, Frog.class);
        if (frog != null) {
            Greenfoot.playSound("yum.wav");
            //Changing Food Value when Mushroom gets eaten.
            MainWorld world = (MainWorld)getWorld();            
            int currentFoodCount = world.foodCount.getValue();
            int newFoodCount = currentFoodCount + 5;
            world.foodCount.setValue(newFoodCount);
            //Removing mushroom after mushroom gets eaten.
            world.removeObject(this);
            
        }   
        
    }
}
