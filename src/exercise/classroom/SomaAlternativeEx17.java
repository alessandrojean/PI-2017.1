package exercise.classroom;

import java.util.Scanner;

public class SomaAlternativeEx17
{
	private static int numA = 0, numB = 0, numC = 0, numD = 0;;

	public static void main(String[] args)
	{
		promptNumbers();
		
		numA = numB + numC;
		printNumbers();
		
		numB = numC;
		printNumbers();
		
		numD = numC - numA;
		printNumbers();
	}

	private static void promptNumbers()
	{
		Scanner lScanner = new Scanner(System.in);

		System.out.print("Digite o numA: ");
		numA = lScanner.nextInt();

		System.out.print("Digite o numB: ");
		numB = lScanner.nextInt();

		System.out.print("Digite o numA: ");
		numC = lScanner.nextInt();
		
		printNumbers();
		
		lScanner.close();
	}
	
	private static void printNumbers()
	{
		System.out.printf("\nnumA = %d; numB = %d; numC = %d; numD = %d", numA, numB, numC, numD);
	}
}
