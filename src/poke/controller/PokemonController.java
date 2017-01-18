package poke.controller;

import java.util.ArrayList;
import poke.model.Pokemon;
import poke.model.pokedex;
import poke.view.*;

public class PokemonController
{

	public void start()
	{
		
	}
	
	private PokemonController baseFrame;
	private PokemonController testedController = null;
	
	public String[] buildPokedexText()
	{
		String [] pokemonNames = new String[pokedex.size()];
		
		for(int index = 0; index < pokedex.size(); index++)
		{
			pokemonNames[index] = pokedex.get(index).getName();
		}
		
		return pokemonNames;
	}
	
	public void updateSelected(int index, String name, int combat, int health, double speed)
	{
		Pokemon current = pokedex.get(index);
		current.setName(name);
		current.setAttackPoints(combat);
		current.setSpeed(speed);
		current.setHealthPoints(health);
	}
	
	public ArrayList<Pokemon> getPokedex()
	{
		return getPokedex();
	}
	
	public PokemonFrame getBaseFrame()
	{
		return getBaseFrame();
	}
	
	public void setBaseFrame(PokemonController baseFrame)
	{
		this.baseFrame = baseFrame;
	}
	
	
	
}
