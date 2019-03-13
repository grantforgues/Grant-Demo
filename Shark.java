
/**
 * Write a description of class Shark here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Shark extends Fish
{
    private boolean isPredator;
    private int aggressionLevel;
    
    public Shark (int stink, int legs, boolean isDomesticated, String color, int gillSize, String environment, boolean _isPredator, int _aggressionLevel)
    {
        super(stink, legs, isDomesticated, color, gillSize, environment);
        isPredator = _isPredator;
        aggressionLevel = _aggressionLevel;
    }
}
