package Scenes;

import java.util.Scanner;


public class Scene1 {

	static Scanner in = new Scanner(System.in);
	
	public static void scene1() {
		
		System.out.printf("%n%n***** Scene 1 *****");
		

		System.out.printf("%n%nYou awake suddenly! Alone, you take in "
						+ "your surroundings. %nYou seem to be in a "
						+ "locked room. The last thing you can remember is sitting down for a meal at the tavern upon your arrival in Syradelle. %nFeeling around, you find a key in your pocket! "
						+ "%n%nWhat do you do next?%n%n");
		event1();
		System.out.printf("%n%nYou have to make a choice:%n%n");
		event2();
	}		

 public static void event1() {
	
		whileLoop:
		while(true) {
			
			System.out.printf("A. Use the key to unlock the room and escape.%n"
							+ "B. Try to break down the door.%n"
							+ "Your Choice?: %n%n");

			String answerS1P1 = in.nextLine();
			if(answerS1P1.equalsIgnoreCase("A")) {
				S1P1pathA();
				break;
			}
			else if(answerS1P1.equalsIgnoreCase("B")) {
				 if (characterSetup.player1.getStrength() > 10) {
					S1P1pathB();
					break whileLoop;
			       }else{
			    	System.out.printf("%n%nYour Strength is too low!%n%n");
			       }

			}else{
				System.out.println("Choose a valid response: ");
				//answerS1P1 = in.nextLine();
     } 
   } // while
}
 
 public static void event2() {
		
	 whileLoop:
	 while(true) {
			 
		 System.out.printf("A. Take the potion%n" +
				 		   "B. Attempt to fight your way out (not recommended)" +
				 		   "%n%nYour choice:%n%n");
		
		 String answerS1choice = in.nextLine();
		 if(answerS1choice.equalsIgnoreCase("A")) {
		 	answer1();
			break;
	   	 }
		 else if(answerS1choice.equalsIgnoreCase("B")) {
			  if(characterSetup.player1.getStrength() > 19) {
			  youWin();
				    break whileLoop;
			       }else{
			    	System.out.printf("%nYour Strength is too low!");
			    	youDie();
			       }
				
		    }else{
				System.out.println("Choose a valid response: ");
				
     }
   }
 }
 
 public static void S1P1pathA() {

	    System.out.println("*********");
	 	System.out.printf("%nYou remove the key from your pocket, and try to unlock the door with it. The key fits into the lock but will not turn.");
		System.out.printf("%nCursing, you slam a fist against the door in frustration. Just then you hear movement in the hallway");
		System.out.printf("%nThe clanking of armor tells you it's the gaurds coming your way...");
		System.out.printf("%nYou can fight your way out if the door opens...%n%n");
		System.out.printf("The door opens to reveal a talk figure cloaked in shadow. As the figure moves into the room you recogize them man as your father, the tyrannical ruler of this kingdom ...%n%n");
		System.out.printf("The man you came to Syradelle to kill...%n%n");
		System.out.printf("He holds up a small vial and says, 'drink this, or i'll have my guards kill you where you stand'");
		
}//S1P1A
 public static void S1P1pathB() {
	 
	 	System.out.println("*********");
	 	System.out.printf("%nYou throw your shoulder into the door, blasting it off it's hinges%n");
	 	System.out.printf("The castle hallway outside is empty, but you can hear voices coming from the only way out.%n");
	 	System.out.printf("You quietly sneak down the hallway into a chamber filled with guards who had heard the crash you made.%n");
	 	System.out.printf("Standing quietly in front of them is a tall figure cloaked in shadow. You immediately recognize the man as your father, the tyrannical ruler of this kingdom.%n%n");
	 	System.out.printf("The man you came to Syradelle to kill...%n%n");
	 	System.out.printf("He holds up a small vial and says, 'drink this, or i'll have my guards kill you where you stand' %n%n");
	 	
}//S1P1B

	 
 public static void youDie() {
	 
	 	System.out.printf("%n%nYou tried to fight...... you died%n");
	 	System.out.printf("%n%nGame Over%n%n");
	 	System.exit(0);
	 
}
 
public static void answer1() {
	
		System.out.printf("%n%nThe world around you blurs and turns dark....%n%n");
}

public static void youWin() {
	
		System.out.printf("%n%nYou killed the emporer and won the game");
}
}
//System.out.println();
// public static void printOptions1() {
//System.out.printf("A. Use the key to unlock the room and escape.%n"
//		+ "B. Try to break down the door.%n"
//		+ "C. Sit patiently and do nothing.%n%n"
//		+ "Your Choice?: %n%n");
//}