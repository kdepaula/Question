
public class test 
{

	public static void main(String[] args) 
	{
		String[] arr = new String[] {"A: blue", "B: green", "C: yellow", "D: pink", "E: orange"};
		MultipleChoice mult = new MultipleChoice("What color is the sky?", arr, 'A');
		TrueFalse tf = new TrueFalse("The sky is pink.", "False");
		System.out.println(mult.toString());
		System.out.println(tf.toString());
		System.out.println(mult.getSolution());
		System.out.println(tf.getSolution());
		System.out.println(tf.getNumber());
		System.out.println(mult.getNumber());
	}

}
