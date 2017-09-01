import java.util.Scanner;
public class ModulusQuizzer
	{

	public static void main(String[] args)
		{
		int counter = 0;
		System.out.println("Hello! How many questions would you like me to ask");
		Scanner userInput = new Scanner (System.in);
		int numberOfQuestions = userInput.nextInt();
		for (int i = 1; i <= numberOfQuestions; i++)
			{
			int secondNumber = (int) ((Math.random() * 9) + 1);
			int firstNumber = (int) ((Math.random() * 30) + 11);
			if (i == 1)
				{
				System.out.println("What is " + secondNumber + "%" + firstNumber + "?");
				int firstAnswer = userInput.nextInt();
				if (firstAnswer == secondNumber%firstNumber)
					{
					System.out.println("That is correct!");
					counter++;
					}
				else 
					{
					System.out.println("That is incorrect.");
					}
				}
			else if (i == numberOfQuestions)
				{
				System.out.println("What is " + firstNumber + "%" + firstNumber + "?");
				int lastAnswer = userInput.nextInt();
				if (lastAnswer == firstNumber%firstNumber)
					{
					System.out.println("That is correct!");
					counter++;
					}
				else 
					{
					System.out.println("That is incorrect.");
					}
				}
			else 
				{
				System.out.println("What is " + firstNumber + "%" + secondNumber + "?");
				int answer = userInput.nextInt();
				if (answer == firstNumber%secondNumber)
					{
					System.out.println("That is correct!");
					counter++;
					}
				else 
					{
					System.out.println("That is incorrect.");
					}
				}
			}
		System.out.println("You got " + counter + " out of " + numberOfQuestions + "! Congrats!");
		}
	}
