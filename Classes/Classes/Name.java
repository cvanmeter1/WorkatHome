
/**
 * Write a description of class Name here.
 *
 * @author (Christian VanMeter)
 * @version (11/1/17)
 */
public class Name
{
    private String first;
    private String middle;
    private String last;
    public Name(String f,String m, String l)
    {
        first = f;
        middle = m;
        last = l;
    }

    public String getFirst()
    {
        return first;
    }

    public String getMiddle()
    {
        return middle;
    }

    public String getLast()
    {
        return last;
    }

    public String firstMiddleLast()
    {
        return (first + " " + middle + " " + last);
    }

    public String lastFirstMiddle()
    {
        return (last + ", " + first + " " + middle);
    }

    public boolean equals(Name otherName)
    {
        if(this.first.equalsIgnoreCase(otherName.first))
        {

            if(this.middle.equalsIgnoreCase(otherName.middle))
            {

                if(this.last.equalsIgnoreCase(otherName.last))
                {
                    return  true; 
                }

            }
            
        }
        return false;
    }

    public String initials()
    {
        return first.substring(0,1).toUpperCase() + middle.substring(0,1).toUpperCase() + last.substring(0,1).toUpperCase();

    }

    public int length()
    {
        return (first.length() + middle.length() + last.length());
    }
}
