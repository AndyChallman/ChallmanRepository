package com.skillstorm.general.PlayerRoles;

public class Bard extends Player {
	
public Bard() {
	setHealthPoints(Math.floor(Math.random()* 3 + 17));
	setStrength(Math.floor(Math.random()* 5 + 1));
	setWisdom(Math.floor(Math.random()* 6 + 15));
	setMagic(Math.floor(Math.random()* 6 + 15));
	}
	
public Bard(double healthPoints, double strength, double wisdom, double magic) {
	
	setHealthPoints(healthPoints); 
	setStrength(strength);
	setWisdom(wisdom);
	setMagic(magic);
	}
	
	
	}

