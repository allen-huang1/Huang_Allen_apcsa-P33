//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
		setPlayers("R");
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
		
	}

	public void setPlayers(String player)
	{
		playChoice = player;
		int comp = (int) (Math.random() * 3);
		if (comp == 0) 
		{
			compChoice = "R";
		}
		else if (comp == 1)
		{
			compChoice = "P";
		}
		else 
		{
			compChoice = "S";
		}
	}

	public String determineWinner()
	{
		String winner="";
		if (playChoice.equals(compChoice))
		{
			winner = "draw";
		}
		else if (playChoice.equals("R") && compChoice.equals("S")
				|| playChoice.equals("S") && compChoice.equals("P")
				|| playChoice.equals("P") && compChoice.equals("R"))
		{
			winner = "player";
		}
		else
		{
			winner = "computer";
		}

		return winner;
	}

	public String toString()
	{
		String output= "";
		output += "player plays " + playChoice;
		output += "\ncomputer plays " + compChoice;
		output += "\nwinner is " + determineWinner();
		return output;
	}
}