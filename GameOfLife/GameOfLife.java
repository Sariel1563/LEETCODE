import java.util.*;
public class GameOfLife
{
	public static void main(String[] args)
	{
		int[][] board = new int[][] {{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
		gameOfLife(board);
		for(int i = 0; i < board.length; i++)
			System.out.println(Arrays.toString(board[i]));
	}
	public static void gameOfLife(int[][] board)
	{
		
	}
	/*public static void gameOfLife(int[][] board)
	{
		int len = board[0].length;							
		int[][] next = new int[board.length+2][len+2];
		for(int i = 0; i < board.length; i++)
		{
			for(int j = 0; j < len; j++)
				next[i+1][j+1] = board[i][j];
		}
		int sum;
		boolean currentAlive;
		for(int i = 0; i < board.length; i++)
		{
			for(int j = 0; j < len; j++)
			{
				currentAlive = false;
				if(next[i+1][j+1] == 1)
					currentAlive = true;
				sum = 0;
				//next[i+1][j+1]
				sum += next[i+1][j+2];
				sum += next[i+1][j];
				//next[i+2][j+1]
				sum += next[i+2][j+1];
				sum += next[i+2][j+2];
				sum += next[i+2][j];
				//next[i][j+1]
				sum += next[i][j+1];
				sum += next[i][j+2];
				sum += next[i][j];
				if(sum < 2 || sum > 3)
					board[i][j] = 0;
				else if(sum == 2)
				{
					if(currentAlive)
						board[i][j] = 1;
					else
						board[i][j] = 0;
				}
				else
					board[i][j] = 1;
			}
		}
    }*/
}
