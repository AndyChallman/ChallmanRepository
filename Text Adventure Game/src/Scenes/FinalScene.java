package Scenes;

import java.util.Scanner;


public class FinalScene {
	
static Scanner in = new Scanner(System.in);
	
	public static void finalScene() {
		System.out.println("***** Final Scene *****");
		System.out.printf("%n%nYou are transported back to reality...%n%n");
		event1();
		//System.out.printf("%n%nYou have to make a choice:%n%n");
		//event2();
	}		

public static void event1() {
	
	whileLoop:
	while(true) {
			
		System.out.printf("%nYou have been summoned to the Emporer's throne room%n"
				+ "You stare at your father with hate in your eyes%n"
				+ "The Emporer quietly speaks, 'Hello son, I hope you've enjoyed the journey I sent you on...'%n"
				+ "Having had enough of your father's mind games during your upbringing, you decide to act before he can further distort your mind.%n"
				+ "How do you proceed?%n%n"
				);
		System.out.printf("A. Fireball to the face%n"
						+ "B. Lop off his head with your sword%n"
						+ "C. Try to hug it out"
						+ "%n%nYour Choice:%n ");

		String answerS1P1 = in.nextLine();
		if(answerS1P1.equalsIgnoreCase("A")) {
			if (characterSetup.player1.getMagic() > 15)
			S1P1pathA();
			break whileLoop;
			}else{
				System.out.printf("%n%nYour Magic is too low%n%n");
		}	
	    if(answerS1P1.equalsIgnoreCase("B")) {
			 if (characterSetup.player1.getStrength() > 15) {
		     S1P1pathB();
			 break whileLoop;
			 }else {
				System.out.printf("%n%nYour Strength is too low%n%n");	 
		}}
	    if(answerS1P1.equalsIgnoreCase("B")) {
	    	
	    	youDie();
	    }
		else{
			 System.out.println("Choose a valid response: ");
} 
} // while
}

	
 public static void S1P1pathA() {

	 	System.out.printf("%nYou call upon your magic and throw a superheated fireball directly at the Emporers head.%n"
	 					+ "the fireball strikes him, and he bursts into ashy dust");
		endGame1();		
		
}//S1P1A
 public static void S1P1pathB() {

	 	System.out.printf("%nYou whip out your sword and attack!%n"
	 					+ "After dosging 3 of your swings, the emporers head is sheared off by a well placed slice%n%n ");
	 	endGame1();
	 
}//S1P1B

	 
 public static void youDie() {
	 
	 System.out.printf("%n%nHugging it out won't kill an Emporer, get real. Grow up.%n"
	 				+ "The Emporer reduces you to dust with a snap of his fingers%n"
	 				+ "You die");
	 System.out.printf("%n%nGame Over%n%n");
	 System.exit(0);
 }
 
public static void endGame1() {
	
	System.out.printf("%nIt is finally over, you have beaten the Emporer.%n"
					+ "%n%n You have won the game %n%n");
	System.exit(0);
}
}
