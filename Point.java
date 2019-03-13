
/**
 * A Point class for exploring objects.
 *
 * @author Grant Forgues
 * @version 1-29-19
 */
public class Point
{
    private int x;
    private int y;
    
    public Point(int initialX, int initialY)
    {
        x = initialX;
        y = initialY;
    }
    
    public Point()
    {
        this(0, 0);
    }
    //Shifts this point's location by the given values
    public void translate(int dx, int dy)
    {
        x += dx;
        y += dy;
    }
    
    public void setLocation(int newX, int newY)
    {
        x = newX;
        y = newY;
    }
    
    public double distanceToOrigin()
    {
        return Math.sqrt(x * x + y * y);
    }
    
    public String toString()
    {
        return "(" + x + ", " + y + ")";
    }
}
