
public class Movie {

	private String title;
	private String category;
	
	public Movie(String x, String y)
	{
		this.title = x;
		this.category = y;
	}
	
	public  String getCategory()
	{
		return category;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	public void setCategory(String category)
	{
		this.category = category;
	}
	
	
}
