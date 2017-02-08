package exercise.classroom;

public class Soma
{
	public static void main(String[] args)
	{
		int numA = 3, numB = 8, numC = 5;
		System.out.println("numA = " + numA + "; numB = " + numB + "; numC = " + numC);
		
		numA = numB + numC;
		System.out.println("numA = " + numA + "; numB = " + numB + "; numC = " + numC);
		
		numB = numC;
		System.out.println("numA = " + numA + "; numB = " + numB + "; numC = " + numC);
	}
}
