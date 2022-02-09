package com.dit.java.oops;

class Enemy {
	private String name;
	private boolean weapon;
	private int attack;
	static int counter;
	
	Enemy(String name, boolean weapon, int attack)
	{
		this.name = name;
		this.weapon = weapon;
		this.attack = attack;
		counter++;
		System.out.println("Enemy Created "+counter+" "+name+" "+weapon+" "+attack);
	}
	
}

public class StaticUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		main(null);
		
		for(int i = 1; i <= 10; i++)
		{
			Enemy obj = new Enemy("E"+i, true, i);
		}
	}
}
