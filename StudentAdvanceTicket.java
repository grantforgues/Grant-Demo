
/**
 * Write a description of class StudentAdvanceTicket here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentAdvanceTicket extends Ticket
{
    private int price;
    private int daysBefore;
    
    public StudentAdvanceTicket(int ticketNum, int daysBefore)
    {
        super(ticketNum);
        this.daysBefore = daysBefore;
    }
    
    public double setPrice()
    {
        if (daysBefore < 10)
        {
            price = 15;
        }
        if (daysBefore >= 10)
        {
            price = 20;
        }
        return price;
    }
    
    public String toString()
    {
        return "Number: " + getTicketNumber() + " Price: $" + setPrice() + " (Student ID Required)";
    }
}
