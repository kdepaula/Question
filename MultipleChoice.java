
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
	
	//you have to call the no arguments constructor  FIRST

	public String toString()
	{
		String formatChoices = "";
		char letter = 'A';
		for(String a : answerChoices)
		{
			formatChoices+= "\n   " + letter + ": " + a;
			letter++;
		}
		return ("" + getNumber() + ". "+ getText() + formatChoices);
	}
	
	public String getSolution()
	{
		return ("" + getNumber() +  ": " + correctAnswer);
	}
	
}
