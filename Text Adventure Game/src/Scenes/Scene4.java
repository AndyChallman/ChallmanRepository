package Scenes;

import java.util.Scanner;

public class Scene4 {
	
	static Scanner in = new Scanner(System.in);
	
	public static void scene4() {
		System.out.println("***** Scene 4 *****");
		System.out.printf("%n%nYou are transported through time and space to a different realm...%n%n");
		event1();
		//System.out.printf("%n%nYou have to make a choice:%n%n");
		//event2();
	}		

public static void event1() {
	
	whileLoop:
	while(true) {
			
		System.out.printf("Suddenly you find yourself floating above the clouds, suspended by some invisible force.%n"
						+ "in front of you there is an image of your late wife, but the image is distorted, light rays passing through it.%n"
						+ "The spectre reaches out a hand, tempting you to surrender and be with your life's live for eternity..."
						+ "%n%nWhat do you do?%n%n");
		System.out.printf("A. Take her hand%n"
						+ "B. Attack with Magic%n"						
						+ "C. Convince yourself this isn't real, and close your eyes tightly"
						+ "%n%nYour Choice:%n ");

		String answerS1P1 = in.nextLine();
		System.out.println(answerS1P1);
		if(answerS1P1.equalsIgnoreCase("A")) {
			System.out.printf("%n%nYou try to take the hand of your spectral wife, but your hand passes right through hers.%n%n"
							+ "The force holding you in the clouds releases you and you plummet towards earth...");
			 if (characterSetup.player1.getHealthPoints() > 15)
				 S1P1pathA();
			else{
				System.out.printf("%n%nYour Health is too low%n%n");
				youDie();
				break whileLoop;
			}
		}	
		if(answerS1P1.equalsIgnoreCase("B")) {
			 if (characterSetup.player1.getMagic() > 14) {
		     S1P1pathB();
		     	break whileLoop;
			 	}else{
				System.out.printf("%n%nYour Magic is too low%n%n"); 
		}}
		else if (answerS1P1.equalsIgnoreCase("C")) {
			System.out.printf("%nYou close your eyes tightly and say a silent prayer that you're correct.%n"
					+ "you hear a puff and feel a pull in the pit of your stomach.%n"
					+ "your eyes snap open but then...%n"); 
			 answer1();
			 break whileLoop;	 
		}
		else{
			 System.out.println("Choose a valid response: ");
} 
} // while
}
	
 public static void S1P1pathA() {

	 	System.out.printf("%nYour hand passes through the spectre's hand, and you plummet towards the earth.%n"
	 					+ "You brace for impact just before you reach the ground and....%n%n"
	 					+ "You crash into the ground with meteoric force, battered and bruised, but alive ");
		answer1();		
		
}//S1P1A
 public static void S1P1pathB() {

	 	System.out.printf("%nYou send a blast of Holy Light straight through the spectre's chest.%n"
	 			+ "The spectre fades from existance as you curse it for using the image of your wife against you.%n");
	 	answer1();
	 
}//S1P1B

	 
 public static void youDie() {
	 
	 System.out.printf("%n%nYou hit the ground before you knew what happened...... you died%n");
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