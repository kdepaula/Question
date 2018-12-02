
public class TrueFalse extends Question
{
	private String answer;

	public TrueFalse(String txt, String ans) 
	{
		super(txt);
		answer = ans;
	}
	
	
	public String getSolution()
	{
		return "" + getNumber() + ": " + answer;
	}
	
	public String toString()
	{
		return ("" + getNumber() + ". " + "True or False: " + getText());
	}
	
}
