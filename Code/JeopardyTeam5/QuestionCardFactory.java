import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class QuestionCardFactory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class QuestionCardFactory{
    public ICardComponent generateQCard(String typeOfCard,String score){
        if(typeOfCard.equals("202"))
            return new QuestionCardLeaf202(score);
        else if (typeOfCard.equals("272"))
            return new QuestionCardLeaf272(score);
        else if(typeOfCard.equals("273"))
            return new QuestionCardLeaf273(score);
        else if(typeOfCard.equals("207"))
            return new QuestionCardLeaf207(score);
        else 
            return null;
    }
}
