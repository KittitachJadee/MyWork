import java.lang.Math;

public class TwoPoints {
	private double x1, x2, y1, y2;
	
	public void setFirstX(double fX)
	{
		x1 = fX;
	}
	public void setFirstY(double fY)
	{
		y1 = fY;
	}
	public void setSecondX(double sX)
	{
		x2 = sX;
	}
	public void setSecondY(double sY)
	{
		y2 = sY;
	}
	public double findDistance()
	{
		return Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
	}
	public double findSlope()
    {
        return (y2-y1)/(x2-x1);
    }
}
