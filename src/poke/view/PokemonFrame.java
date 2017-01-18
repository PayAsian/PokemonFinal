package poke.view;

import javax.swing.JFrame;

import java.awt.Dimension;

import poke.controller.PokemonController;


public class PokemonFrame extends JFrame
{
	private PokemonController baseController;
	private PokemonPanel appPanel;
	private Object testFrame;
	private String title;
	
	
	public PokemonFrame(PokemonController baseController)
	{
		super();
		this.baseController = baseController;
		this.appPanel= new PokemonPanel(baseController);
		this.title = " ";
		
	}
	
	public void setupBaseFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("Pokedex");
		this.setSize(new Dimension(600, 400));
		this.setVisible(true);
		
		
	}
	
	public void setTitle(String newTitle)
	{
		this.title = newTitle; 
			
	}
	
	public String getTitle()
	{
		return getTitle();
	}
	
	public void setPokemonFrame()
	{
		
	}
	
	public void getPokemonFrame()
	{
		Object testedFrame;
		testedFrame.getTitle = true;
	}
	
}
