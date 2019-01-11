//this will do magic square
#include <stdio.h>
int main(void)
{
	int n=3;
	int array1[n][n];
	int a=0;
	
	
	//a=((n-1)+0)/(2);
	
	printf("%d",a);
	printf("\n");
	int i=0;
	int loco=0;
	for(i=0;i<n;i++)
	{
		for(loco=0;loco<n;loco++)
		{
			
			array1[i][loco]=0;
		}
		
		
	}
	
	int j=0;
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			printf("%d",array1[i][j]);
			printf("\n");
			
		}
		
		
	}

	

	
	int k=0;
	int r=1;
	int x=0;
	
	
	int prevK=0;
	int prevA=0;
	
	
	
	a=1;
	
	
	printf("\n");
	
	while(x<9)
	{
		//this is the the previous
		
	
		
		if(k == -1)
		{
			k=2; //this is n-1
			
		}
		
		if(a == 3)
		{
			a=0;
			
		}
		
		
		
		//return to previous position
		
		printf("%d",prevK);
		printf("\n");
		printf("%d",prevA);
		printf("\n");
		
		
		if(array1[k][a] != 0)
		{
			//k=k+1;
			//a=a-1;
			//array1[k+1][a]=r;
			//k=k+1;
			
			array1[prevK+1][prevA]=r;
			k=prevK+1;
			a=prevA;
			
			
			
		}
		
		printf("the value of k is %d",k);
		printf("\n");
		printf("the value of a is %d",a);
		printf("\n");
		printf("the value of r is %d",r);
		printf("\n");
		
		
		array1[k][a]=r;
		prevK=k;
		prevA=a;
	
		r=r+1;
		
		
		k=k-1;
		a=a+1;
	
		
		
		
		x++;
		printf("\n");
		
		
	}
	
	printf("\n");
	
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			printf("%d",array1[i][j]);
			printf("\t");
			
		}
			printf("\n");
		
		
	
		
	}
	
	return 0;
	
	
	
	
	
	
	
}