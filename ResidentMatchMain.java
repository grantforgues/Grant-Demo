
/**
 * Write a description of class ResidentMatchMain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ResidentMatchMain
{
    public static void main(String [] args)
    {        
        Resident [] residents = new Resident[10];
        for (int i = 0; i < residents.length; i++)
        {
            residents[i] = new Resident(i + 1, randomNumber(1, 5), randomNumber(1, 5), randomNumber(1, 5));
        }
        printArray(residents);
        
        Matcher matcher = new Matcher(residents);
        matcher.bestMatch();
        matcher.worstMatch();
        matcher.bestIndividualMatch(residents[1]);
        matcher.worstIndividualMatch(residents[1]);
        
        
    }
    
    //Prints all the elements in an array of Residents
    public static void printArray(Resident [] arr)
    {
        for (Resident r: arr)
        {
            System.out.println(r);
        }
    }
    
    //Generates a random integer between a min and max value 
       public static int randomNumber(int min, int max)
    {
        return (int)(Math.random() * (max - min + 1) + min);
    }
    }
