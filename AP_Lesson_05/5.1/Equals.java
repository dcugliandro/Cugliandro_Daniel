import java.util.Scanner;
public class Equals
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String word1 = kb.next();
		String word2 = "word";
		System.out.println(word1 == word2);
	}
}