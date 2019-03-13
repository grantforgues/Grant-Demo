
/**
 * Write a description of class Square here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Square extends RegularPolygon
{
    public Square(int sideLength)
    {
        super("Square", 4, sideLength);
    }
    
    public double getArea()
    {
        return getSideLength() * getSideLength();
    }
}
