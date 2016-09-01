

public class Circle {
	
	public double radius;
	public double circumference;
	public double area;
	public final double  PI = 3.14;
	private static int objectCount = 0 ;
	
	
	public Circle(double radius)
	{
		this.radius = radius;
		++objectCount;
	}
	
	
	
	
	public double getCircumference()
	{
		circumference =  (2 * PI * radius);
		
		 return circumference;
		
	}
	
	public String getFormattedCircumference()
	{
		getCircumference();
		return formatNumber(circumference);
	}
	
	public double getArea()
	{
		area =  (PI * radius * radius );
		 return area;
		
	}
	public String getFormattedArea()
	{
		getArea();
		return formatNumber(area);
	}
	private String formatNumber(double x)
	{
		String result = String.format("%.2f", x);
		return result;
	}
	
	public static  int getObjectCount()
	{
		
		return objectCount;
	}

}
