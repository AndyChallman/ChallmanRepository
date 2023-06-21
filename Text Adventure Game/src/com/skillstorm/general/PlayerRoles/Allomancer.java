package com.skillstorm.general.PlayerRoles;

public class Allomancer extends Player{

	public Allomancer() {
		setHealthPoints(Math.floor(Math.random()* 8 + 12));
		setStrength(Math.floor(Math.random()* 6 + 15));
		setWisdom(Math.floor(Math.random()* 6 + 15));
		setMagic(Math.floor(Math.random()* 6 + 15));
	}
	public Allomancer(double healthPoints, double strength, double wisdom, double magic) {
				
	setHealthPoints(healthPoints); 
	setStrength(strength);
	setWisdom(wisdom);
	setMagic(magic);
	}
	
	
	
	
}
