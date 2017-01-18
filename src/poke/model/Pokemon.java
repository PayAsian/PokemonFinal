package poke.model;

import java.util.ArrayList;

public abstract class Pokemon
{

	private int healthPoints;
	private int attackPoints;
	private double speed;
	private int number;
	private String name;
	private String buildPokemonList;
	private ArrayList<Pokemon> Pokemon;
	private ArrayList<Pokemon> pokedex;
	
	
	
	public Pokemon(String name, int number)
	{
		this.healthPoints = 100;
		this.attackPoints = 100;
		this.speed = 100;
		this.name = new String();
		this.number = 0;
		this.buildPokemonList = new String();
		this.Pokemon = new ArrayList<Pokemon>();
		this.pokedex = new ArrayList<Pokemon>();
		
	}
	
	public ArrayList<Pokemon> pokedex()
	{
		return pokedex;
	}
	
	public String toString()
	{
		return toString();
	}
	
	public String getPokemonTypes()
	{
		return getPokemonTypes();
	}
		
	public String getPokemonInformation()
	{
		return getPokemonInformation();
	}
	
	public int getHealthPoints()
	{
		return getHealthPoints();
	}
	
	public int getAttackPoints()
	{
		return getAttackPoints();
	}
	
	public double getSpeed()
	{
		return getSpeed();
	}
	
	public int getNumber()
	{
		return getNumber();
	}
	
	public String getName()
	{
		return getName();
	}
	
	public void setHealthPoints(int healthPoints)
	{
		this.healthPoints = healthPoints;
	}
	
	public void setAttackPoints(int attackPoints)
	{
		this.attackPoints = attackPoints;
	}
	
	public void setSpeed(double speed)
	{
		this.speed = speed;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}

}
