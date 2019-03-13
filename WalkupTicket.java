
/**
 * Write a description of class WalkupTicket here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WalkupTicket extends Ticket
{
    private int price;
    
    public WalkupTicket(int ticketNum)
    {
        super(ticketNum);
    }
    
    public double setPrice()
    {
        return 50;
    }
}
