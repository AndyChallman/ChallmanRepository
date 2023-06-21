package com.skillstorm.general.PlayerRoles;

public class Martial extends Player {

public Martial() {
	setHealthPoints(Math.floor(Math.random()* 5 + 15));
	setStrength(Math.floor(Math.random()* 5 + 12));
	setWisdom(Math.floor(Math.random()* 6 + 7));
	setMagic(Math.floor(Math.random()* 6 + 4));
	}
	
public Martial(double healthPoints, double strength, double wisdom, double magic) {
	
	setHealthPoints(healthPoints); 
	setStrength(strength);
	setWisdom(wisdom);
	setMagic(magic);
	}
	
	}

