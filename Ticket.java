
/**
 * Write a description of class Ticker here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Ticket
{
    private int ticketNumber;
    
    public Ticket(int number)
    {
        ticketNumber = number;
    }
    
    public abstract double setPrice();
    
    public int getTicketNumber()
    {
        return ticketNumber;
    }
    
    public String toString()
    {
        return "Number: " + ticketNumber + " Price: $" + setPrice();
    }
}
