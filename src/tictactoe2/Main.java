package tictactoe2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Main
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner (new File("tictactoe.dat"));
		int n = file.nextInt();
		file.nextLine();
		for(int i = 0; i < n; i++)
		{
			String g = file.nextLine();
			Ticc mygame = new Ticc(g);
			System.out.println(mygame);
		}
	}
}