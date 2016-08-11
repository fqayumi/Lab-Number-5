import java.util.Scanner;
import java.util.Random;

public class RollDice {

	static Scanner scan;
	public static void main(String[] args) 
	{
		
			System.out.println("Welcome to the Grand Circus Casino");
			scan = new Scanner(System.in);
			System.out.println("How many sides would you like on your dice : ");
			int sides = scan.nextInt();
			String choice = "y";
			scan.nextLine();
			while(choice.equalsIgnoreCase("yes") || choice.equalsIgnoreCase("y"))
			{
			System.out.println("Lets roll your dice twice!");
			int die1 = randomRoll(sides);
			int die2 = randomRoll(sides);
			System.out.println("You rolled a " + die1 + "and a " + die2);
			System.out.println("Roll Again? y/n");
			
			choice = scan.nextLine();
			}
			System.out.println("Good Bye!");
			
			
	}
	public static int randomRoll (int sides) 
	{
		return(int)(Math.random() * sides +1);
	}
}
