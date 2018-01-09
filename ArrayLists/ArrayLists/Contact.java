
/**
 * Write a description of class Contact here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Contact
{
    
    private String first;
    private String last;
    private int phoneNum;
    private String eMail;
    public Contact(String first, String last, int phoneNum, String eMail)
    {
        this.first = first;
        this.last = last;
        this.phoneNum = phoneNum;
        this.eMail = eMail;
    }
    public String getFirst()
    {
        return first;
    }
    public String getLast()
    {
        return last;
    }
    public int getPhoneNum()
    {
        return phoneNum;
    }
    public String eMail()
    {
        return eMail;
    }
    
}
