
/**
 * Write a description of class Animal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Animal
{
    private int stinkLevel;
    private int numLegs;
    private boolean isDomesticated;
    private String color;
    
    public Animal (int stink, int legs, boolean _isDomesticated, String colour)
    {
        stinkLevel = stink;
        numLegs = legs;
        isDomesticated = _isDomesticated;
        color = colour;
    }
    
    public void respirate()
    {
        System.out.println("I'm having a breathe moment");
    }
    
    public void locomote()
    {
        System.out.println("I am promoting healthy activity through exercise!");
    }
    
    public void bathe()
    {
        stinkLevel -= 2;
        if (stinkLevel < 0)
        {
            stinkLevel = 0;
        }
        System.out.println("I'm so clean.");
    }
    
    public String toString()
    {
        return "Stink Level: " + stinkLevel + "\nNumber of Legs: " + numLegs + "\nDomesticated?: " + isDomesticated + "\nColor: " + color;
    }
}
