
public class MultipleChoice extends Question
{
	private String[] AnswerChoices;
	private char correctAnswer;
	
	public MultipleChoice(String txt, String[] ans, char correctA)
	{
		super(String txt);
		AnswerChoices = ans;
		correctAnswer = correctA;
		number++;
	}
	
	
}
