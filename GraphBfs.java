import java.util.*;
class GraphBfsCode
{
	public static void addEdge(List<List<Integer>> adj,int i,int j)
	{
		adj.get(i).add(j);
		adj.get(j).add(i);
		
	}

	public static void print(List<List<Integer>> adj)
	{
		for(List<Integer> l: adj)
		{
			for(int z: l)
			{
				System.out.print(z+" ");
		        }
			System.out.println("");
		}
	}
	
	public static void BfsFunction(List<List<Integer>> adj,int start,boolean []visited)
	{
		Queue<Integer> q=new LinkedList<>();
		visited[start]=true;
		q.offer(start);
		while(!q.isEmpty())
		{
			int curr=q.poll();
			System.out.print(curr+" ");
			for(int z:adj.get(curr))
			{
				if(!visited[z])
				{
					visited[z]=true;
					q.offer(z);
				}
			}
		}
	
			
	}
	
	public static void  BfsGraph(List<List<Integer>> adj)
	{
		boolean visited[]=new boolean[adj.size()];
				for(int i=0;i<adj.size();i++)
		{			if(!visited[i])
			{
				BfsFunction(adj,i,visited);
			}
			System.out.println();
		}

			
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		 List<List<Integer>> adj=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			adj.add(new ArrayList<>());
			
		}
		while(true)
		{
		
		System.out.println("Enter the vertices to add the edge");
		int u=sc.nextInt();
		int v=sc.nextInt();
		addEdge(adj,u,v);
		System.out.println("Enter -1 to terminate");
		int z=sc.nextInt();
		if(z==-1)
		{
			break;
		}
	}
	int start=sc.nextInt();
	BfsGraph(adj);
	}
}
