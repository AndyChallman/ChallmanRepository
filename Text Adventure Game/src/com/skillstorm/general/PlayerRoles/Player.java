package com.skillstorm.general.PlayerRoles;

public class Player {
	
	private double healthPoints = 10;
	private double strength = 10;
	private double wisdom = 10;
	private double magic = 10;
		


	public double getHealthPoints() {
		return this.healthPoints;
	}
	
	public void setHealthPoints(double healthPoints) {
		this.healthPoints = healthPoints ;
	}
	
	public double getStrength() {
		return this.strength;
	}
	
	public void setStrength(double strength) {
		this.strength = strength;
	}
	
	public double getWisdom() {
		return this.wisdom;
	}
	
	public void setWisdom(double wisdom) {
		this.wisdom = wisdom;
	}
	
	public double getMagic() {
		return this.magic;
	}
	
	public void setMagic(double magic) {
		this.magic = magic;
	}

	public void stats() {
		System.out.printf("HP = " + getHealthPoints() + 
					  	   "%nStrength = " + getStrength() + 
					  	   "%nWisdom = " + getWisdom() + 
					  	   "%nMagic = " + getMagic());		
	}

}
