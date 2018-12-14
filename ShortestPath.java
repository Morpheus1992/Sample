
//Agustin Fleiderman
//Dijaskra algorithm
//CSC 4520


//My program works for the first input and calculates the shortest path tree in the graph.For the
//second input my program has run out of heap memory so you have to use the command line java
//-xMs to make the the program work. THe command increase the java heap memory. The problem I had

//with the program is that while the algorithm I used is correct the data structure I used the
//adjancecy matrix uses too much memory to work with 25000 matrics and therefore I need to
//increase the java heap meomory to make it work.

//However the program does work for the first  input.

import java.io.*; //needed for the file class

import java.util.StringTokenizer;
import java.util.Scanner;

public class ShortestPath 
{

	public static void main(String[] args) throws IOException
	{
	String filename;
	Scanner keyboard = new Scanner(System.in);
	System.out.println("HELLO USER, ENTER THE NAME OF THE FILE YOU WANT TO INPUT");
	
	
	
	filename=keyboard.nextLine();
	
			FileReader freader= new FileReader(filename);
			BufferedReader inputFile= new BufferedReader(freader);
			
			String loco=inputFile.readLine();
			System.out.println(loco);
			StringTokenizer pedro = new StringTokenizer(loco,"= m n");
			
			
			
	
	int N=25000;
	//Integer.parseInt(pedro.nextToken()); //the number of nodes you have in the array
		int M=8544;
		int inf=2100000;
		
		int[][] a =new int[N][N]; //this will hold all vertices going to all edges
		//int[] d = new int[N]; //distance
		
		//boolean[] kaki = new boolean[N];
		
		//int[] p = new int[N]; 
		
		
		 //the sum of all the shortest paths
		
		int v=0; //is for vertices
		int x=0; //is for the edges
		int y=0;
		
		
		
		//now we initialize the graph the source node is zero the rest of the paths are inf
	
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
			{
				if(i != j)
				{
					a[i][j]=inf;
				}
				else
				{
					a[i][j]=0;
				
				}
			
			}
		
		}
		
			
			 //read the first line
			//ok now we are reading the file
			
			//in the file the first line is the vertex
			//the second is where it is going and the weight of this edge
			
			//a is the array vertices and edges are stored
			while(loco != null)
			{
				loco=inputFile.readLine();
					if(loco == null)
					{
						break;
					
					}
					
					StringTokenizer str = new StringTokenizer(loco);
					
					if(str.countTokens() == 1)
					{	x=Integer.parseInt(str.nextToken());
						v=x;
						//System.out.println(v);
					}
					
					if(str.countTokens() == 2)
					{
						x=Integer.parseInt(str.nextToken());
						y=Integer.parseInt(str.nextToken());
						
						//System.out.println( x + " " + y);
						
						a[v][x]=y;
						a[x][v]=y; //since the graph goes in multiple directions
					
					
					}
			}
					inputFile.close();
					System.out.println("-------------");
					//here I have constructed the graph yes
					//these be examples to make sure its working 
					
					//System.out.println(a[0][25]);
					
					//System.out.println(a[0][613]);
					
					//System.out.println(a[613][0]);
					
					//System.out.println(a[899][903]);
					
					//System.out.println(a[991][997]);
				
						Dij(0,a,N);
						
					//vertex zero is the shortest path
	}
	
				public static void Dij(int v,int[][] array, int N)
				{
					//System.out.println("hello");
					//System.out.println(array[0][0]);
					System.out.println(N);
					int[]d = new int[N];
					boolean[] visit = new boolean[N];
					int[] p = new int[N];
					
					int inf=2100000;
					
					//this just an example of unreacheable part
					
					//System.out.println("example of an unrecheable vertex " + array[0][991]);
					
					System.out.println("\n");
					int sum=0;
					int i;
					int j;
					int k=0;
					int min;
					//we will see which one are visited
					
					for(i=0;i<N;i++)
					{
						visit[i]=false;
					
					}
						visit[v]=true; //you can visit the first node in source path
						p[v]=-1;
						
						for(i=0;i<N;i++)
						{
							d[i]=array[v][i]; //the distance is initially from a to i
							//ok so it works it does print all vertices away from vertex 0
							if(d[i]!= inf)
							{
								//System.out.println(d[i]);
							}
							if(d[i] != inf)
							{
								p[i]=0;
							}
							else
							{
								p[i]=-1;
							
							}
						
						}
							//System.out.println("this should be 314 it is :" + d[638]);// 314
							//System.out.println("this should be false " + visit[613]);
							//System.out.println("\n");
						//Now we proceed further along
						
						for(i=0;i<N;i++)
						{
							min=inf;
							for(j=0;j<N;j++)
							{
								//look for smallest one
								if(visit[j]==false && d[j]<min)
								{
								min=d[j];
								k=j;
								//this was only to check
									if(min !=inf)
									{
										//System.out.println("the node is  " + k + " the edge is  " + min); //we showing the min but not 171
									}
									
										
								}
								 //it should end up being 171
							
							}
							
							//show the status of the visited
						
							
							if( min == inf)
							{
								break;
								//end the loop
							}
							visit[k]=true;
							
							 //because k is equal to min
								
							//now we apply the djaskra relaxation technique to see if there is a shorter path
							for(j=0;j<N;j++)
							{
								if(visit[j] == false && d[j]>d[k]+array[k][j])
								{
									d[j]=d[k]+array[k][j];
									p[j]=k;
								
								}
							
							
							}
						}
						
						//System.out.println("see if 1 is visit " + visit[1]);
						//System.out.println(" see if node 538 visit " + visit[538]);
						//these are only test points for the algoritm to see if works
						//System.out.println( d[538]);
						//System.out.println(d[33]);
						//System.out.println(d[173]);
						
						
						for(int w=0;w<N;w++)
						{
							sum=sum+d[w];
						
						}
							System.out.println("THE LENGTH OF THE SHORTEST PATH TREE IS " + sum);
									
								
						
				}
					
							
					
				
				
				
}
				


