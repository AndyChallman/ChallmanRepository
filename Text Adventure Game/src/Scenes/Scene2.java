package Scenes;

import java.util.Scanner;


public class Scene2 {

	static Scanner in = new Scanner(System.in);
	
	public static void scene2() {
		
		System.out.printf("%n%n***** Scene 2 *****");
		

		System.out.printf("%n%nYou are transported through time and space to a different realm...%n%n");
		event1();
		//System.out.printf("%n%nYou have to make a choice:%n%n");
		//event2();
	}		

 public static void event1() {
	
		whileLoop:
		while(true) {
			
			System.out.printf("You land in a room with a table in front of you%n" +
							  "On the table in front of you there are 2 chalices%n");
			System.out.printf("A. Chalice 1.%n"
							+ "B. Chalice 2.%n"						
							+ "C. Try to detect poisons"
							+ "%n%nYour Choice:%n ");

			String answerS1P1 = in.nextLine();
			if(answerS1P1.equalsIgnoreCase("A")) {
				 S1P1pathA();
				 break;
			}
			else if(answerS1P1.equalsIgnoreCase("B")) {
				 S1P1pathB();
				 break;
			}
			else if(answerS1P1.equalsIgnoreCase("C")) {
				 if (characterSetup.player1.getWisdom() > 15) {
				 youWin();
				 answer1();
				     break whileLoop;
			        }else{
					 System.out.printf("%n%nYour Wisdom is too low!%n%n");
			        }}else{
				System.out.println("Choose a valid response: ");
    } 
  } // while
}
		
 public static void S1P1pathA() {

	    System.out.println("*********");
	 	System.out.printf("%nYou take a drink from chalice 1.");
		answer1();		
		
}//S1P1A
 public static void S1P1pathB() {
	 
	 	System.out.println("*********");
	 	System.out.printf("%nYou take a drink from chalice 2.%n");
	 	youDie();
	 	
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
	
	System.out.printf("%nYou can tell the non-lethal chalice"
					+ " is the first one, so you take a swig from it");
}
}
//System.out.println();