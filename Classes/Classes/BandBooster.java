
/**
 * Write a description of class BandBooster here.
 *
 * @author (Christian VanMeter)
 * @version (11/1/2017)
 */
public class BandBooster
{
    private String name;
    private int boxesSold;
    public BandBooster(String n)
    {
        name = n;
        boxesSold = 0;
    }
    public String getName()
    {
        return name;
    }
    public void updateSales(int sold)
    {
        boxesSold += sold;
    }
    public String toString()
    {
        return (name + ": " + boxesSold + " boxes");
    }
}
