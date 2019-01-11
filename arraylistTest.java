
public class arraylistTest
{
	public static void main(String[] args)
	{
		arraylist gato = new arraylist(9); //this create the arrayList
		Integer gordo = new Integer(5); //this creates a new object that will be placed in the array list
		Integer santiago= new Integer(11); //this creates a new object that will be  in the arrayList
		
		Integer red = new Integer(43); //this creates a new object that will not be placed in the array list
		
		Integer blue = new Integer(21); //this creates a new object that will be placed in the array list
		
		gato.add(gordo); //5 is added to the array list at location 0
		gato.add(santiago); //11 is added to the arraylist at loc 1
		gato.add(blue);  //21 is added to the arrayist at loc 2
		gato.add(new Integer(10)); //10 is added to the arraylist at location 3
		gato.add(new Integer(12)); //12 is added to the array list at location 4
		gato.add(new Integer(13)); //13 is added to the array list at location 5
		
		
		int dre=gato.getSize(); //this demonstrates the get size method and returns the current capacity of the arraylist
		System.out.println("the size of the arrray list is " +dre); //this print out the current capacity of the arraay
		
		for(int i=0;i< dre; i++)
		{
			System.out.println(gato.get(i)); //this shows the getMethod
		}
		System.out.println(gato.isEmpty()); //this show IsEmpty method will return false b/c the list is not empty.
		
		//make another arrayList to test out is empty
		
		arraylist tupac =new arraylist(9); //this make a new arraylist
		
		System.out.println(tupac.isEmpty()); // this test out whether the list tupac is empty and it it returns true because it is
		
		System.out.println(gato.find(gordo)); //this uses the find method to see where object gordo is stored
		
		System.out.println("this should return -1 : " + gato.find(red)); //this uses the find method to show that the object red is not in the arrayl list thus
		//returning -1
		
		int rex = gato.find(santiago); //this shows the find method in the array list and it return 1 because that is the index where santiago object is found
		System.out.println(rex); 
		
		System.out.println(gato.isIn(santiago)); //this test out the is In method and it returns true because the object santiago is in the array
		
		System.out.println("this should return false : " + gato.isIn(red)); //this test out the IsIn method and return false because red is not in the array
		
		
	
		
		Integer Ramon = new Integer(69); //this creates a new object to the be added to the array list
		
		gato.add(1,Ramon); //this uses the add method to add the object Ramon to the location one where santiago was previously
		
		System.out.println("this is the new list with ramon in it in it "); //the list now has santiago in it
		
		for(int i=0;i<gato.getSize();i++) 
		{
			System.out.println(gato.get(i)); //this uses the get method to print out a new list
		
		}
		
		
		gato.remove(santiago); //this uses the remove method to get ride of object santiago
		System.out.println("now the list sin santiago");
		
		for(int i=0;i<gato.getSize();i++)
		{
			System.out.println(gato.get(i)); //this print out array list without santiago
		
		}
		
		
		
	}
	
}