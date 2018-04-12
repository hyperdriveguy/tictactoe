package tictactoe2;
import java.util.Scanner;
import static java.lang.System.*;

public class Ticc
{
	private char[][] mat;

	public Ticc()
	{
			mat = new char [3][3];

	}

	public Ticc(String game)
	{
			mat = new char [3][3];
			int count = 0;
			for(int r = 0; r<3; r++)
			{
				for(int c = 0; c<0; c++)
				{
					mat[r][c] = game.charAt(count);
					count ++;
				}
			}
	}

	public String getWinner()
	{












		return "";
	}

	public String toString()
	{
		String output="";
	for(int r = 0; r<3; r++)
	{
		for (int c = 0; c < 3; c++)
		{
			output += mat[r][c] + " ";
		}
		output +="\n";

	}


		return output+"\n\n";
	}
}




