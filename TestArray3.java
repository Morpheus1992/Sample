//I want to see if the array changes when you send to method
//i want to print the array backward
//this show you how to reverse an array
class TestArray3
{
	public static void main(String[] args)
	{
		int a[]=new int[10];
		for(int i=0;i<a.length;i++)
		{
			a[i]=i+2;
			System.out.print(a[i] +" ");
			
		}
		reOrder(a);
		System.out.println("the lenght");
		System.out.println(a.length);
	
		
		
	}
	
	static void reOrder(int arr[])
	{
		int temp;
		System.out.println("reorder");
		System.out.println("\n");
		for(int i=9;i>=0;i--)
		{
				System.out.print(arr[i] + "\n");
			
		}
		
		System.out.println("something");
		
		for(int i=0;i<arr.length/2;i++)
		{
			System.out.println(arr[i]);
			temp=arr[i];
			System.out.println(temp + " " );
			//here is the issue
			arr[i]=arr[arr.length-1-i];
			
			System.out.println(arr[i] + "  ");
			
			arr[arr.length-1-i]=temp;
			System.out.println(arr[arr.length-1-i] + " ");
			System.out.println();
			
		}
		
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+ " ");
			
		}
		
		
	}
	
	
	
}