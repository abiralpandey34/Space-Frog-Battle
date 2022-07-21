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
    
    //Passing the context.
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
    
    //THis method increases the Food value when frog eats mushroom,
    public void increaseFoodCount(int value){
        MainWorld world = (MainWorld)getWorld(); 
        int currentFoodCount = world.foodCount.getValue();
        int newFoodCount = currentFoodCount + value;
        world.foodCount.setValue(newFoodCount);
    }
    
    //THis method checks if mushroom is being touched by Frog.
    public void getEatenByFrog(){
       Actor frog = getOneObjectAtOffset(0, 0, Frog.class);
        if (frog != null) {
            Greenfoot.playSound("yum.wav");
            increaseFoodCount(5);
            
            //Removing mushroom after mushroom gets eaten.
            getWorld().removeObject(this);
            
        }   
        
    }
}
