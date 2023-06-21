package Scenes;

import java.util.Scanner;


public class Scene5 {
	
	static Scanner in = new Scanner(System.in);
	
	public static void scene5() {
		System.out.println("***** Scene 5 *****");
		System.out.printf("%n%nYou are transported through time and space to a different realm...%n%n");
		event1();
		//System.out.printf("%n%nYou have to make a choice:%n%n");
		//event2();
	}		

public static void event1() {
	
	whileLoop:
	while(true) {
			
		System.out.printf("%nYou are surrounded by almost darkness, you can barely make out the forms of trees all arounf you.%n"
				+ "The darkness of the forrest is almost as unnerving as the complete silence you are enveloped in....%n"
				+ "You start to hear the sound of dozens of creatures moving around you, but you can't pinpoint the locations.%n"
				+ "%nWhat do you do?%n");
		System.out.printf("A. Nothing. Tune out the terrifying sounds%n"
						+ "B. Illuminate the area%n"						
						+ "%n%nYour Choice:%n ");

		String answerS1P1 = in.nextLine();
		if(answerS1P1.equalsIgnoreCase("A")) {
			
			 S1P1pathA();
			 break whileLoop;
		}	
	    if(answerS1P1.equalsIgnoreCase("B")) {
			 
		     S1P1pathB();
			 break whileLoop;
			 
		}
		else{
			 System.out.println("Choose a valid response: ");
} 
} // while
}
	
 public static void S1P1pathA() {

	 	System.out.printf("%nYou shut out the ghastly noises, concentrating on the anything else you can think of.%n"
	 			+ "The harder you concentrate the quiter the noises become, fading from existence...%n"
	 			+ "when the sounds completely disappear, you open your eyes and...%n");
		answer1();		
		
}//S1P1A
 public static void S1P1pathB() {

	 	System.out.printf("%nYou illuminate the area  surrounding you to reveal dozens of enormous direwolves....%n"
	 			+ "The light sets off a frenzy, and they attack.%n%n ");
	 	youDie();
	 
}//S1P1B

	 
 public static void youDie() {
	 
	 System.out.printf("%n%nThe direwolves tear you limb from limb...... you died%n");
	 System.out.printf("%n%nGame Over%n%n");
	 System.exit(0);
 }
 
public static void answer1() {
	
	System.out.printf("%n%nThe world around you blurs and turns dark....%n%n");
}


}
//System.out.println();