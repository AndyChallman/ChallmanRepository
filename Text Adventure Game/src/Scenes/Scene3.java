package Scenes;

import java.util.Scanner;

public class Scene3 {
	
		static Scanner in = new Scanner(System.in);
		
		public static void scene3() {
			
			System.out.printf("%n%n***** Scene 3 *****");
			

			System.out.printf("%n%nYou are transported through time and space to a different realm...%n%n");
			event1();
			//System.out.printf("%n%nYou have to make a choice:%n%n");
			//event2();
		}		

 public static void event1() {
		
		whileLoop:
		while(true) {
				
			System.out.printf("You come to in a nightmare, surrounded by fire with a single oppent"
							+ " facing you in the circle of flame, there is a sword in your hand.%n"
							+ "Your enemy draws it's sword, what do you do?%n%n");
			System.out.printf("A. Attack with your sword%n"
							+ "B. Attack with Magic%n"						
							+ "C. Sing your opponent a song"
							+ "%n%nYour Choice:%n ");

			String answerS1P1 = in.nextLine();
			if(answerS1P1.equalsIgnoreCase("A")) {
				 if (characterSetup.player1.getStrength() > 14) {
					 S1P1pathA();
					 break whileLoop; 
			}
				else
				System.out.printf("%n%nYour Strength is too low!%n%n");
			}
		    if(answerS1P1.equalsIgnoreCase("B")) {
				 if (characterSetup.player1.getMagic() > 14) {
			     S1P1pathB();
				 break whileLoop;
				 }else {
					System.out.printf("%n%nYour Magic is too low%n%n"); 
			}}
			else if (answerS1P1.equalsIgnoreCase("C")) {
				System.out.printf("%nYou attempt to sing the creature a sweet lullaby,"
					    	+ " but are swifly decapitated before you can get a note out"); 
				 youDie();
				 break whileLoop;	 
			}
			else{
				 System.out.println("Choose a valid response: ");
	} 
  } // while
}
		
	 public static void S1P1pathA() {

	
		 	System.out.printf("%nYou attack with your sword, exchanging blows with the creature%n" 
		 					+ "You manage to land a killing blow and your enemy bursts into dust%n");
			answer1();		
			
	}//S1P1A
	 public static void S1P1pathB() {
		 
		 	
		 	System.out.printf("%nYou attack with a blast of ice magic!%n"
		 			+ "Your opponent falls to the ground, defeated.%n");
		 	answer1();
		 	
	}//S1P1B

		 
	 public static void youDie() {
		 
		 System.out.printf("%n%nYou tried to find the correct chalice...... you died%n");
		 System.out.printf("%n%nGame Over%n%n");
		 System.exit(0);
	 }
	 
	public static void answer1() {
		
		System.out.printf("%n%nThe world around you blurs and turns dark....%n%n");
	}

	public static void youWin() {
		
		System.out.printf("%nYou blast the creature with a spike of ice thrown from your palm, and it dissolves to mist%n");
	}
}
//System.out.println();