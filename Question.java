
public abstract class Question 
{
	private String text;
	private int number;
	private static int count = 1;
	
	public Question(String text)
	{
		this.text = text;
		//this part is the field, text is parameter
		number = count;
		count++;
	}
	
	public int getNumber()
	{
		return number;
	}
	
	public String getText()
	{
		return text;
	}
	
	public abstract String getSolution();
	
}
