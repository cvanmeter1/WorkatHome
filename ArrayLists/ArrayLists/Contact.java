
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
    private String phoneNum;
    private String eMail;
    public Contact(String first, String last, String phoneNum, String eMail)
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
    public String getPhoneNum()
    {
        return phoneNum;
    }
    public String getEMail()
    {
        return eMail;
    }
    public String toString()
    {
        return "First Name: " + first + "\n Last Name: " + last + "\n Phone Number: " + phoneNum + "\n E-Mail: " + eMail;
    }
    
}
