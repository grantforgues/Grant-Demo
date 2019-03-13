import java.awt.Point;
/**
 * Write a description of class PointIntro here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PointIntro
{
    public static void main(String [] args)
    {
        Point p = new Point(3, 8);
        
        System.out.println(p);
        
        p.translate(-1, 3);
        System.out.println(p);
        
        p.setLocation(5, 4);
        System.out.println(p.x);
        p.x = 9;
        System.out.println(p);
        
        Point p1 = new Point(2,9);
        Point p2 = new Point(7, 4);
        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);
        System.out.println("Distance from p1 to p2: " + p1.distance(p2));
    }
}
