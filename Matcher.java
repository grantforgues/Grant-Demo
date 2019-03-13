
/**
 * Write a description of class Matcher here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Matcher
{
    private Resident [] group;
    
    public Matcher(Resident [] groups)
    {
        group = groups;
    }
    
    public double calculateCompScore(Resident r, Resident n)
    {
        return ((Math.abs(r.getSleepHabits() - n.getSleepHabits())) + (Math.abs(r.getStudyHabits() - n.getStudyHabits())) + (Math.abs(r.getSocialActivity() - n.getSocialActivity())))/3.0;
    }
    
    public Resident [] bestMatch()
    {
        double min = calculateCompScore(group[0], group[1]);
        Resident [] match = new Resident [2];
        for (int i = 0; i < group.length; i++)
        {
            for (int j = i + 1; j < group.length; j++)
            {
                double score = calculateCompScore(group[i], group[j]);
                if (score < min)
                {
                    min = score;
                    match[0] = group [i];
                    match [1] = group[j];
                }
            }
        }
        System.out.println("The best matched partners are the following with a compatibility score of " + min + ":");
        System.out.println(match[0] + "\n" + match[1]);
        
        return match;
    }
    public Resident [] worstMatch()
    {
        double max = calculateCompScore(group[0], group[1]);
        Resident [] match = new Resident [2];
        for (int i = 0; i < group.length; i++)
        {
            for (int j = i + 1; j < group.length; j++)
            {
                double score = calculateCompScore(group[i], group[j]);
                if (score > max)
                {
                    max = score;
                    match[0] = group [i];
                    match [1] = group[j];
                }
            }
        }
        System.out.println("The worst matched partners are the following with a compatibility score of " + max + ":");
        System.out.println(match[0] + "\n" + match[1]);
        
        return match;
    }
    
    public Resident bestIndividualMatch (Resident r)
    {
        double min = calculateCompScore(group[0], group[1]);
        int bestResNum = 0;
        for (int i = 0; i < group.length; i++)
        {
            if (r.getResidentNum() != group[i].getResidentNum())
            {
                double score = calculateCompScore(r, group[i]);
                if (min > score)
                {
                    bestResNum = i;
                    min = score;
                }
            }
        }
        System.out.println("The best match for Resident #" + r.getResidentNum() + " is Resident #" + bestResNum + " at a score of " + min + ".");
        System.out.println(r + "\n" + group[bestResNum]);
        
        return group[bestResNum];
    }
    
        public Resident worstIndividualMatch (Resident r)
    {
        double max = calculateCompScore(group[0], group[1]);
        int worstResNum = 0;
        for (int i = 0; i < group.length; i++)
        {
            if (r.getResidentNum() != group[i].getResidentNum())
            {
                double score = calculateCompScore(r, group[i]);
                if (max < score)
                {
                    worstResNum = i;
                    max = score;
                }
            }
        }
        System.out.println("The worst match for Resident #" + r.getResidentNum() + " is Resident #" + worstResNum + " at a score of " + max + ".");
        System.out.println(r + "\n" + group[worstResNum]);
        
        return group[worstResNum];
    }
}
