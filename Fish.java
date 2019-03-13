
/**
 * Write a description of class Fish here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Fish extends Animal
{
    private int gillSize;
    private String environment;
    
    
    public Fish (int stink, int legs, boolean isDomesticated, String _color, int _gillSize, String _environment)
    {
        super(stink, legs, isDomesticated, _color);
        gillSize = _gillSize;
        environment = _environment;
    }
    
    public void layEggs(int eggs)
    {
    }
    
    public void locomote (int spaces)
    {
        System.out.println("I swam " + spaces + ".");
    }
    
}
