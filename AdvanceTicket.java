
/**
 * Write a description of class AdvanceTicket here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AdvanceTicket extends Ticket
{
    private int price;
    private int daysBefore;
    
    public AdvanceTicket(int ticketNum, int daysBefore)
    {
        super(ticketNum);
        this.daysBefore = daysBefore;
    }
    
    
    public double setPrice()
    {
        if (daysBefore < 10)
        {
            price = 30;
        }
        
        if (daysBefore >= 10)
        {
            price = 40;
        }
        return price;
    }
}