
public class test 
{

	public static void main(String[] args) 
	{
		String[] arr = new String[] {"blue", "green", "yellow", "pink", "orange"};
		MultipleChoice mult = new MultipleChoice("What color is the sky?", arr, 'A');
		TrueFalse tf = new TrueFalse("The sky is pink.", "False");
		System.out.println(mult);
		System.out.println(tf);
		System.out.println(mult.getSolution());
		System.out.println(tf.getSolution());
		System.out.println(tf.getNumber());
		System.out.println(mult.getNumber());
	}

}
