import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class QuestionScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class QuestionScreen extends Actor
{
     /**
     * Act - do whatever the QuestionScreen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
  
        if(Greenfoot.mouseClicked(this)){
            getWorld().removeObjects(getWorld().getObjects(TextField.class));
           getWorld().removeObject(this);
        }
    }    
}
