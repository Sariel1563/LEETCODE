import java.util.*;
public class FriendCircles
{
	public static boolean[] visited;
	public static void main(String[] args)
	{
		int[][] isConnected = new int[][] {{1,1,0},{1,1,0},{0,0,1}};
		System.out.println(findCircleNum(isConnected));
	}
	public static int findCircleNum(int[][] links)
	{
		int provinces = 0;
        visited = new boolean[links.length];
        for(int index = 0; index < links.length; index++)
		{
			if(visited[index])
				continue;
			rec(index, links);
			provinces++;
		}
        return provinces;
    }
	public static void rec(int index, int[][] links)
	{
		if(visited[index])
			return;
		visited[index] = true;
		for(int i = 0; i < links.length; i++)
		{
//			if(i == index)
//				continue;
			if(links[index][i] == 1)
				rec(i, links);
		}
	}
}
