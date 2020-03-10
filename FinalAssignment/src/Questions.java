import java.util.Scanner;

public class Questions extends Obstacles implements DefaultInterface {

	String input;
	static int count=GameMain.count;
	Scanner sc = new Scanner(System.in);

	void start() { // starts the game
       System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("You want to play?");
		System.out.println("\t1 yes");
		System.out.println("\t2 no");
		input = sc.nextLine();
		count=count+1;
		if (input.equals("1")) { // if you choose YES to play
			
			firstQuestion();
		} else { // if you choose NO
			System.out.println("---say yes if you want to play---");
			
			start();
		}
		

	}

	// first question
	public void firstQuestion() {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the text adventure game!!!");
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("You are standing in front of the house. What would you like to do?");
		System.out.println("\t1. Go inside");
		System.out.println("\t2. Run Away");
		input = sc.nextLine();
		count=count+1;
		if (input.equals("1")) { // if you go inside the house
			
			secondQuestion();
		} else { // if you run away

			System.out.println("-----------------------------------------------------------------------------------");
			System.out.println("You reached to a jungle.");
			System.out.println("You saw a lion and there is a bridge what would you like to do? ");
			System.out.println("\t1.Run towards bridge");
			System.out.println("\t2.Run towards the lion");
			input = sc.nextLine();
			count=count+1;
			if (input.equals("1")) { // if you run towards the bridge
				
				System.out.println("--------------------------------------------------------------------------------");
				thirdQuestion();
			} else { // if you run towards the lion
				System.out.println("-------------------------------------------------------------------------------");
				System.out.println(
						"Sorry, it was not a wise choice. you have been killed by the lion...."
						+ "You can play again by making your choice again...");

				start(); // starts the game again
			}
		}

	}

	 // this method asks the third question
	public void thirdQuestion() {
		// TODO Auto-generated method stub
		
		System.out.println("Under the bridge there are some weapons. What would you like to choose?");
		System.out.println("\t1. Gun");
		System.out.println("\t2. Knife");
		System.out.println("\t3. Sword");
		input = sc.nextLine();
		count=count+1;
		if (input.equals("1")) { // When you choose GUN
			System.out.println(
					"------------------------------------------------------------------------------------------------------------------");
			System.out.println("wo wo....! There are no bullets");
			System.out.println("Go back to choose another weapon");
			System.out.println("\t1. Back");
			input = sc.nextLine();
			count=count+1;
			if (input.equals("1")) {
				thirdQuestion(); // repeats the third question again
			} else {
				System.out.println("Invalid Option...!!"); // if you are choosing a wrong option
			}
		} else if (input.equals("2")) { // When you choose KNIFE
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------");
			System.out.println("You have been successfully kept the knife.");
			System.out.println("Would you like to go inside the house now?");
			System.out.println("\t1. Yes");
			System.out.println("\t2. No");
			input = sc.nextLine();
			count=count+1;
			if (input.equals("1")) { // when you choose yes to go inside the house
				Obstacles.count=count;
				obs(); // calling obs method
			} else { // when you choose not to go inside the house
				System.out.println(
						"-----------------------------------------------------------------------------------------------------------");
				System.out.println(
						"You are not that brave to play this game.Game Over!!! Please start it again if you want to play it.");
				System.out.println("You made "+count+ " Number of choices.");
			}
		} else { // when you choose SWORD
			System.out.println(
					"----------------------------------------------------------------------------------------------------------------");
			System.out.println("WoWO... Sword is too heavy to handle. Go Back to choose another weapon.");
			System.out.println("\t1. Back");
			
			input = sc.nextLine();
			count=count+1;
			if (input.equals("1")) { // when you go back to choose the weapon again
				thirdQuestion();
			}
		}

	}

	public void secondQuestion() {// where you will find the obstacles
		// TODO Auto-generated method stub
		//System.out.println(count);
		Obstacles.count=count;
		obs();
	}

	@Override
	public void QuestionNext1() {
		// TODO Auto-generated method stub
		
	}

}
