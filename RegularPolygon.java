
/**
 * Write a description of class RegularPolygon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class RegularPolygon
{
    private String name;
    private int numSides, sideLength;
    
    public RegularPolygon(String name, int numSides, int sideLength)
    {
        this.name = name;
        this.numSides = numSides;
        this.sideLength = sideLength;
    }
    
    public int getPerimeter()
    {
        return numSides * sideLength;
    }
    
    public abstract double getArea();
    
    public String toString()
    {
        return name + " -- Perimeter: " + getPerimeter() + " Area: " + getArea();
    }
    
    public int getNumSides()
    {
        return numSides;
    }
    
    public int getSideLength()
    {
        return sideLength;
    }
}
