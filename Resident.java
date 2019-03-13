
/**
 * Write a description of class Resident here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Resident
{
    private int resNum, sleepHab, studHab, socAct;
    
    public Resident(int num, int sleep, int study, int social)
    {
        resNum = num;
        sleepHab = sleep;
        studHab = study;
        socAct = social;
    }
    public String toString()
    {
        return "Resident #" + resNum + "\n\tSleep Habits: " + sleepHab + "\n\tStudy Habits: " + studHab + "\n\tSocial Activity: " + socAct;
    }
    
    public int getResidentNum()
    {
        return resNum;
    }
    public int getSleepHabits()
    {
        return sleepHab;
    }
    public int getStudyHabits()
    {
        return studHab;
    }
    public int getSocialActivity()
    {
        return socAct;
    }
}
