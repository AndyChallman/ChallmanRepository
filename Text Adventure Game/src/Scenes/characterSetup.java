package Scenes;

import java.util.Scanner;
import com.skillstorm.general.PlayerRoles.Allomancer;
import com.skillstorm.general.PlayerRoles.Bard;
import com.skillstorm.general.PlayerRoles.Martial;
import com.skillstorm.general.PlayerRoles.Player;


public class characterSetup {

	static Scanner in = new Scanner(System.in);	
	public static Player player1;
	
	public static void characterSetup() {
		System.out.println("Welcome to Shyradelle!");
		System.out.println("Choose a character name: ");
		String name = in.nextLine();
		
		System.out.println("Hello " + name + " you are in the mysterious land of Syradelle!");
		System.out.println();
		
		System.out.println("Lets create your character!");
		System.out.println("Choose a role: Allomancer, Martial, or Bard");
		System.out.println("Your choice: ");
		
		
			
		
		while(true) {
			String playerRole = in.nextLine();
			if(playerRole.equalsIgnoreCase("Allomancer")) {
				System.out.println("You chose: " + playerRole);
				System.out.printf("%n**** " + name + "'s Stats ****");
				System.out.println();
				player1 = new Allomancer();
				player1.stats();
				System.out.println();
				break;
			}
			else if(playerRole.equalsIgnoreCase("Martial")) {
				System.out.println("You chose: " + playerRole);
				System.out.printf("%n**** " + name + "'s Stats ****");
				System.out.println();
				player1 = new Martial();
				player1.stats();
				break;
			}
			else if(playerRole.equalsIgnoreCase("Bard")) {
				System.out.println("You chose: " + playerRole);
				System.out.printf("%n**** " + name + "'s Stats ****");
				System.out.println();
				player1 = new Bard();
				player1.stats();
				break;
			}
			else{
				System.out.println("Choose a valid role: ");
				
			}		
		}//while loop

	}
}
//String playerRole = in.nextLine();
//System.out.println();
