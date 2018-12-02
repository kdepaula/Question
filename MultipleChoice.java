
public class MultipleChoice extends Question
{
	private String[] answerChoices;
	private char correctAnswer;
	
	public MultipleChoice(String txt, String[] ans, char correctA)
	{
		super(txt);
		answerChoices = ans;
		correctAnswer = correctA;
	}
	

	public String toString()
	{
		String formatChoices = "";
		for(String a : answerChoices)
		{
			formatChoices+= "\n   " + a;
		}
		return ("" + getNumber() + ". "+ getText() + formatChoices);
	}
	
	public String getSolution()
	{
		return ("" + getNumber() +  ": " + correctAnswer);
	}
	
}
