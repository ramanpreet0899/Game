import java.util.Random;
import java.util.Scanner;

public class Obstacles extends QuestionsContinue implements DefaultInterfaceNew {
	static int count=Questions.count;
	void obs() {
		Scanner sc = new Scanner(System.in);
		Random rm = new Random();

		String[] enemies = { "loki", "thenos", "Zombie", "Warrior" };
		int maxEneHealth = 10;
		int EneAttackDamage = 5;

		int Health = 10;
		int attackDamage = 5;
		int numHealthPortions = 1;
		int healAmountPortions = 2;
		int healthAmountdropPortions = 5;

		boolean running = true; // to continue the fight

		GAME: while (running) {
			System.out.println(
					"----------------------------------------------------------------------------------------------");

			int eneHealth = rm.nextInt(maxEneHealth); // random number to create enemy's health
			String enemy = enemies[rm.nextInt(enemies.length)]; // random number to create the enemy
			System.out.println(enemy + " appeared....!!!");

			while (eneHealth > 0) { // if your health is good enough to fight
				System.out.println("\tYour HP: " + Health);
				System.out.println("\t" + enemy + "'s HP: " + eneHealth);

				System.out.println("\n\t What Would you like to do?");
				System.out.println("\t1. Attack");
				System.out.println("\t2. Run");
				System.out.println("\t3. Drink Health Potions");
				
				String input = sc.nextLine();
				count=count+1;
				if (input.equals("1")) {
					int damageDealt = rm.nextInt(attackDamage); // to generate the random number for damage dealt
					int damageTaken = rm.nextInt(EneAttackDamage); // to generate the random number for damage taken
					eneHealth -= damageDealt;
					Health -= damageTaken;
					System.out.println(
							"------------------------------------------------------------------------------------------------");
					System.out.println("\t you strike the " + enemy + " for " + damageDealt + " damage. ");
					System.out.println("\t you received " + damageTaken + " in fight.");
					if (Health < 2) { // if your health is to weak to continue
						System.out.println(
								"-------------------------------------------------------------------------------------------");
						System.out.println("You have taken to much damage, You are so weak to go on....!!");
						System.out.println("You made "+count+ " Number of choices.");
						System.exit(0);
						running = false; // fight will be stopped
						break;
					} else if (eneHealth < 1) { // if enemy health is weak to continue or enemy is killed
						System.out.println(
								"-------------------------------------------------------------------------------------------");
						System.out.println("You have killed " + enemy + " . Congratulations !!!!!");
						System.out.println("Would you like to continue to kill other enemies?"); // continue fight with
																									// other enemies,
																									// yes/no
						System.out.println("\t1. Yes");
						System.out.println("\t2. No");
						input = sc.nextLine();
						count=count+1;
						if (input.equals("1")) { // when you choose yes
							running = true;
						} else { // when you choose no
							running = false;
							System.out.println(
									"-------------------------------------------------------------------------------");
							System.out.println(
									"You came outside the house to find some more clues about your destination.");
							QuestionsContinue.count=count;
							QuestionLast(); // when you came out of the house

						}
					}
				} else if (input.equals("2")) { // when you choose RUN from fight
					running = false;
					System.out.println(
							"-----------------------------------------------------------------------------------------------------");
					System.out.println(
							"You are running towards the jungle.you reached to the jungle. In The Jungle you found a suitcase."
									+ " You opened it.You found some weapons.What would you like to do next? ");
					System.out.println("\t1. you will throw all the weapons");
					System.out.println("\t2. You will keep both gun and knife.");
					input = sc.nextLine();
					count=count+1;
					if (input.equals("1")) { // when you throw all the weapons

						QuestionNext();

					} else if (input.equals("2")) { // when you keep the weapons
						// QuestionNext1();
						// break;
						System.out.println(
								"---------------------------------------------------------------------------------------------------------");
						System.out.println("Good choice..!! On the way you saw a monster. What would you like to do?");

						System.out.println("\t1. run away");
						System.out.println("\t2. attack with gun");
						System.out.println("\t3. attack with knife.");
						Scanner sc1 = new Scanner(System.in);
						String input1 = sc1.nextLine();
						count=count+1;
						if (input1.equals("1")) { // when you choose RUN AWAY
							System.out.println(
									"---------------------------------------------------------------------------------------------------------------");
							System.out.println(
									"You are running away. You saw a plane and a car. What whould you like to choose??");
							System.out.println("\t1. Plane");
							System.out.println("\t2. Car");
							input = sc.nextLine();
							count=count+1;
							if (input.equals("1")) { // when you choose PLANE
								System.out.println("Unfortunatley.. You don't know how to fly. Game Over!!!");
								System.out.println("You made "+count+ " Number of choices.");
								System.exit(0);
							} else if (input.equals("2")) { // when you choose CAR
								System.out.println(
										"You are driving the car towards your west.At the end you came out of the"
												+ " Jungle and you successfully found your way to back."
												+ "Congratulations You Won the Game..!!!");
								System.out.println("You made "+count+ " Number of choices.");
								System.exit(0);
							}
						} else if (input1.equals("2")) {
							System.out.println(
									"----------------------------------------------------------------------------------------------------");
							System.out.println("congratulations!! you have killed the monster. You won the Game");
							System.out.println("You made "+count+ " Number of choices.");
							System.exit(0);
						} else if (input1.equals("3")) {
							System.out.println(
									"----------------------------------------------------------------------------------------------------");
							System.out.println("congratulations!! you have killed the monster. You won the Game");
							System.out.println("You made "+count+ " Number of choices.");
							System.exit(0);
						}
					}

				} else { // when you choose DRINK HEALTH POTIONS
					if (numHealthPortions > 0) {
						Health += healAmountPortions;
						numHealthPortions--;
						System.out.println(
								"----------------------------------------------------------------------------------------------");
						System.out.println(
								"\t You Drink a health potions to heal yourself for " + healAmountPortions + " ."

										+ " \n\t you now have " + Health + " HP" + "\n\t you have " + numHealthPortions
										+ "health potions left.");
					} else { // if you have no potions left
						System.out.println("you have no health potions left, Defeat your enemy to get one!!");
					}
				}
			}

		}

	}

	public void QuestionNext1() {
		// TODO Auto-generated method stub
		System.out.println(
				"---------------------------------------------------------------------------------------------------------");
		System.out.println("Good choice..!! On the way you saw a monster. What would you like to do?");

		System.out.println("\t1. run away");
		System.out.println("\t2. attack with gun");
		System.out.println("\t3. attack with knife.");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		count=count+1;
		if (input.equals("1")) { // when you choose RUN AWAY
			System.out.println(
					"---------------------------------------------------------------------------------------------------------------");
			System.out.println("You are running away. You saw a plane and a car. What whould you like to choose??");
			System.out.println("\t1. Plane");
			System.out.println("\t2. Car");
			input = sc.nextLine();
			count=count+1;
			if (input.equals("1")) { // when you choose PLANE
				System.out.println("Unfortunatley.. You don't know how to fly. Game Over!!!");
				System.exit(0);
			} else if (input.equals("2")) { // when you choose CAR
				System.out.println("You are driving the car towards your west.At the end you came out of the"
						+ " Jungle and you successfully found your way to back."
						+ "Congratulations You Won the Game..!!!");
				System.exit(0);
			}
		}
	}

	public void QuestionNext() { // Throwing all the weapons
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println(
				"----------------------------------------------------------------------------------------------------------------------");
		System.out.println("Throwing all the weapons would be dangerous for you in the future...."
				+ "now you ran to an old palace.You saw gold jewelery. Do you want to take this je"
				+ "jewelery with you? if you will take this then may be this palace will "
				+ "be destroyed right away. So what will you do?");
		System.out.println("\t1. you will keep the jewelery with you.");
		System.out.println("\t2. you will think about the palace and will not touch the jewelery.");
		String input = sc.nextLine();
		count=count+1;
		if (input.equals("2")) { // when you LEAVE THE JEWELERY
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------------");
			System.out.println("well done...! you have been saved the Palace.You Won the Game"
					+ "As well as you got the gold jewelery as Reward.");
			System.out.println("You made "+count+ " Number of choices.");
			System.exit(0);
		} else if (input.equals("1")) { // when you KEEP THE JEWELERY WITH YOU
			System.out.println(
					"---------------------------------------------------------------------------------------------------------------------");
			System.out.println("oh Ho.....You have made a wrong choice."
					+ " You are dead because of the destruction of palace.Game Over...!!!");
			System.out.println("You made "+count+ " Number of choices.");
			System.exit(0);
			
		}

	}

}
