import greenfoot.*;  // imports Actor, World, Greenfoot, GreenfootImage

/**
 * This class is a blueprint for World.
 * 
 * The frog named 'Freddy' lands on an unknown planet. He found some mushrooms 
 * scattered. Since freddy is hungry, he decides to eat them. 
 * Suddendly, a 3-eyed monster started to chase Freddy. Freddy has to
 * run for its life and also eat all the mushrooms at the same time.
 * 
 * Point system will be added during the second assessment.
 * 
 * @author Akash Banjade 
 * @version 1.1
 *
 */

public class MainWorld extends World
{
    Frog freddy = Frog.getInstance();
    Alien alien = new Alien(freddy);
    Mushroom mushroom = new Mushroom(freddy); 
    
    SimpleTimer time = new SimpleTimer();
    Counter timeCount = new Counter();
    Counter foodCount = new Counter("Food: ");
    
    

    /**
     * Create the world. The world has a size of 800x600 cells, where every cell is just 1 pixel.
     */
    public MainWorld() 
    {
        super(1200, 700, 1);
        addObject(timeCount, getWidth()-100, 50);
        timeCount.setValue(30);
        timeCount.setPrefix("Time: ");
        
        foodCount.setValue(0);
        addObject(foodCount, 100,50);
        prepare();
    }
    
    public void act(){
        if(time.millisElapsed() > 1000){
            timeCount.add(-1);
            time.mark();
        }
        
        if (getObjects(Mushroom.class).isEmpty()) showMessage("congrat.png");        
        
        checkTimeout();
    }
 
    public void checkTimeout(){
        if(timeCount.getValue()<0) {
            //Time over code here
            removeObjects(getObjects(null));     
            showMessage("gameover.png");
        }
    }
    
    public void showMessage(String string){
        if(string.equals("gameover.png")) Greenfoot.playSound("gameover.wav");
        else Greenfoot.playSound("congrat.wav");
        
        removeObjects(getObjects(null));
        GreenfootImage bg = new GreenfootImage(string);
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
        
        Greenfoot.stop();
    }

    
    /**
     * Prepare the world for the start of the program. 
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject(freddy, 100, 400);
        //addObject(new ScoreBoard(800, 600), getWidth() / 2, getHeight() / 2); 

        addObject(alien, 1000, 200);
        //turnAlienTowardFrog();
        
        Mushroom mushroom2 = new Mushroom(freddy);
        addObject(mushroom2,642,156);        
        mushroom2.setLocation(624,210);

        Mushroom mushroom3 = new Mushroom(freddy);
        addObject(mushroom3,239,69);
        Mushroom mushroom4 = new Mushroom(freddy);
        addObject(mushroom4,239,179);
        Mushroom mushroom5 = new Mushroom(freddy);
        addObject(mushroom5,236,308);
        Mushroom mushroom6 = new Mushroom(freddy);
        addObject(mushroom6,236,439);
        Mushroom mushroom7 = new Mushroom(freddy);
        addObject(mushroom7,232,574);
        Mushroom mushroom8 = new Mushroom(freddy);
        addObject(mushroom8,359,579);
        Mushroom mushroom9 = new Mushroom(freddy);
        addObject(mushroom9,360,444);
        Mushroom mushroom10 = new Mushroom(freddy);
        addObject(mushroom10,363,307);
        Mushroom mushroom11 = new Mushroom(freddy);
        addObject(mushroom11,358,185);
        Mushroom mushroom12 = new Mushroom(freddy);
        addObject(mushroom12,368,74);
        Mushroom mushroom13 = new Mushroom(freddy);
        addObject(mushroom13,491,68);
        Mushroom mushroom14 = new Mushroom(freddy);
        addObject(mushroom14,490,183);
        Mushroom mushroom15 = new Mushroom(freddy);
        addObject(mushroom15,493,308);
        Mushroom mushroom16 = new Mushroom(freddy);
        addObject(mushroom16,490,447);
        Mushroom mushroom17 = new Mushroom(freddy);
        addObject(mushroom17,491,588);
        Mushroom mushroom18 = new Mushroom(freddy);
        addObject(mushroom18,616,583);
        Mushroom mushroom19 = new Mushroom(freddy);
        addObject(mushroom19,610,448);
        Mushroom mushroom20 = new Mushroom(freddy);
        addObject(mushroom20,612,312);
        Mushroom mushroom21 = new Mushroom(freddy);
        addObject(mushroom21,617,73);
        mushroom20.setLocation(624,309);
        mushroom19.setLocation(610,442);
        mushroom17.setLocation(489,578);
        mushroom18.setLocation(621,583);
        mushroom7.setLocation(243,578);
        mushroom6.setLocation(241,456);
        mushroom9.setLocation(350,452);
        mushroom16.setLocation(490,458);
        mushroom19.setLocation(607,459);
        mushroom10.setLocation(352,318);
        mushroom15.setLocation(483,315);
        mushroom20.setLocation(612,317);
        mushroom2.setLocation(598,200);
        mushroom14.setLocation(488,204);
        mushroom11.setLocation(369,205);
        mushroom4.setLocation(240,200);
        mushroom3.setLocation(240,93);
        mushroom12.setLocation(365,89);
        mushroom13.setLocation(481,82);
        mushroom21.setLocation(630,92);

        
    }
    
    
    
  
    
}