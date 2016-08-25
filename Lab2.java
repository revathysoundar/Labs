
import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		String weapon, color;

		// Get the user name

		System.out.println("Welcome! What is your name?");
		String name = scanner.nextLine();

		// get the choice from user
		System.out.println("Would you like to play a game? Y/N");
		String choice = scanner.nextLine();

		// Game starts here

		if (choice.equalsIgnoreCase("y")) {
			System.out.println("Excellent! You are walking across a field and you encounter a fire-breathing dragon!"
					+ "What would you do? Enter face the beast or run away:");

			String answer = scanner.nextLine();
			if (answer.equals("face the beast")) {
				System.out.println("You approach the dragon. You see that he has ______ heads." + " Enter 1 or 2 or 3");
				int num = scanner.nextInt();

				switch (num) {

				case 1:
					System.out.println("you have a faced a dragon. Choose your weapon."

							+ "enter slingshot or sword or bow&arrow");
					weapon = scanner.next();

					break;

				case 2:
					System.out.println("No one has ever faced a 2-headed dragon. Choose your weapon."
							+ "enter Slingshot or sword or bow&arrow");
					weapon = scanner.next();
					break;

				case 3:
					System.out.println("No one has ever faced a 3-headed dragon. Choose your weapon."
							+ "enter Slingshot or sword or bow&arrow");
					weapon = scanner.next();

					break;
				default:
					weapon = " ";

				}

				switch (weapon) {

				case "slingshot":
					System.out.println("Armed with your slingshot, you approach the dragon. You can feel its fiery"
							+ " breath as you get closer. It stares at you with its ____ eyes. (enter red or blue)");
					color = scanner.next();
					break;
				case "sword":
					System.out.println("Armed with your sword, you approach the dragon. You can feel its fiery"
							+ " breath as you get closer. It stares at you with its ____ eyes. (enter red or blue)");
					color = scanner.next();
					break;

				case "bow&arrow":
					System.out.println("Armed with your bow & arrow, you approach the dragon. You can feel its fiery"
							+ " breath as you get closer. It stares at you with its ____ eyes. (enter red or blue)");
					color = scanner.next();
					break;
				default:
					color = " ";

				}

				if (color.equals("red")) {
					System.out
							.println("Oh thank goodness! Red-eyed dragons are friendly. You pet it and become friends."
									+ "You name the dragon ____ (enter a name)");
					String dragon_name = scanner.next();

					System.out.println(name + " and " + dragon_name + " live happily ever after.");
				}

				else {
					System.out
							.println("Oh thank goodness! Blue-eyed dragons are friendly. You pet it and become friends."
									+ "You name the dragon ____ (enter a name)");
					String dragon_name = scanner.next();

					System.out.println(name + " and " + dragon_name + " live happily ever after.");
				}
			}

		}

		else {
			System.out.println("Goodbye!");
		}

		scanner.close();

	}

}
