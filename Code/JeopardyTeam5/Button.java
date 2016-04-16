import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
    public Button(String text){
        GreenfootImage g = new GreenfootImage(text, 30, Color.YELLOW , null);
        setImage(g);   
    }
    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {   
        
        if(Greenfoot.mouseClicked(this)){
           getWorld().addObject(new QuestionScreen(),100,100);
            getWorld().addObject(new Question("Barack Obama is president of which country?"),305,60);
            getWorld().addObject(new TextField("a. India"),100,180);
            getWorld().addObject(new TextField("b. United States"),149,216);
            getWorld().addObject(new TextField("c. Europe"),114,256);
            getWorld().addObject(new TextField("d. Australia"),123,296);
            
            getWorld().removeObject(this);
        }
    }    
}
