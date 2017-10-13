package class01;

import java.util.stream.Stream;

public class BemVindoAoJava
{

	public static void main(String[] args)
	{
		doTheAsterisks(22);
		System.out.println("Sejam bem-vindos ao Java!");
		doTheAsterisks(22);
	}

	private static void doTheAsterisks(int n)
	{
		String asterisks = "";
		for(int i=0;i<n;i++)
			asterisks+="*";
		
		System.out.println(asterisks);
	}

}
