import java.util.ArrayList;

public class test 
{

	public static void main(String[] args) 
	{
		String[] arr = new String[] {"blue", "green", "yellow", "pink", "orange"};
		MultipleChoice mult = new MultipleChoice("What color is the sky?", arr, 'A');
		TrueFalse tf = new TrueFalse("The sky is pink.", "False");
		ArrayList<Question> test = new ArrayList<Question>();
		test.add(mult);
		test.add(tf);
		test.add(new TrueFalse("Mr. Ellis is cool", "True"));
		for(Question q: test)
		{
			System.out.print(q + "\n");
		}
		
		for(Question q: test)
		{
			System.out.print(q.getSolution() + "\n");
		}
	}

}
