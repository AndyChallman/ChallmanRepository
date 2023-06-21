package com.skillstorm.general;

import Scenes.FinalScene;
import Scenes.Scene1;
import Scenes.Scene2;
import Scenes.Scene3;
import Scenes.Scene4;
import Scenes.Scene5;
import Scenes.characterSetup;
import java.util.*;

public class GameMain {
	
	//static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		characterSetup.characterSetup();
		Scene1.scene1();
		
		ArrayList<Integer> sceneList = new ArrayList<Integer>();
		
		while (sceneList.size() < 4) {
			int nextRandom = (int)(Math.floor(Math.random()* 4 + 2));
			if (!sceneList.contains(nextRandom))
				sceneList.add(nextRandom);
		}
		
		for (int i = 0; i < sceneList.size(); i++) {
			switch(sceneList.get(i)) {
			case 2: Scene2.scene2();
				break;
			case 3: Scene3.scene3();
				break;
			case 4: Scene4.scene4();
				break;
			case 5: Scene5.scene5();
				break;
			default:
				break;
			
		}
		}
		FinalScene.finalScene();		
		
//		Scene2.scene2();
//		Scene3.scene3();
//		Scene4.scene4();
//		Scene5.scene5();
		
	
	}//main
}//class
		
//System.out.println();
