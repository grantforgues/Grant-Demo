
/**
 * Write a description of class Rectangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rectangle
{
    private int length;
    private int width;
    
    public Rectangle(int initialLength, int initialWidth)
    {
        length = initialLength;
        width = initialWidth;
    }
    
    public int getArea()
    {
        int area = length * width;
        return area;
    }
    public int getPerimeter()
    {
        int perimeter = (2 * length) + (2 * width);
        return perimeter;
    }
    public void doubleSides()
    {
        length = 2 * length;
        width = 2 * width;
    }
    public boolean isSquare()
    {
        return length == width;
    }
    public void changeLength(int newLength)
    {
        length = newLength;
    }
     public void changeWidth(int newWidth)
    {
        width = newWidth;
    }
    public int differenceInArea(Rectangle r2)
    {
        int difference = Math.abs((length * width) - r2.getArea());
        return difference;
    }
    public String toString()
    {
        return length + "x" + width ;
    }
}
