

public class Circle {
	
	public double rad;
	public double circumference;
	public double area;
	public final double  PI = 3.14;
	static int count = 1;
	
	
	public Circle(double radius)
	{
		this.rad = radius;
	}
	
	public Circle()
	{
		count++;
	}
	
	
	public double getCircumference()
	{
		circumference =  (2 * PI * rad);
		
		 return circumference;
		
	}
	
	public String getFormattedCircumference()
	{
		return formatNumber(circumference);
	}
	
	public double getArea()
	{
		area =  (PI * rad * rad );
		 return area;
		
	}
	public String getFormattedArea()
	{
		return formatNumber(area);
	}
	private String formatNumber(double x)
	{
		String result = String.format("%.2f", x);
		return result;
	}
	
	public static  int getObjectCount()
	{
		
		return count;
	}

}
