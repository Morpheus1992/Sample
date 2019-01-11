
	//Purpose
//The purpose of this program is to create my own arraylist data structure without using the 
//class in the Java language. The arraylist class must be made by the programmer using only arrays and 
//with no outside libraries. Once the program is finished it should be able to to create an arraylist in which the user
//emphasizes the size of the arraylist. The user should be able to add items to the arraylist, remove items from the arraylist,check to see
//if the arraylist is empty, and see if it is true that an object is in the list.

	//Solution
//There were various problem to be solved when you are creating your own array list data structure. The first problem to be solved was to be able
//to initialize the data structure to hold the first hold a certain amount of object. 

//This problem was solved by making a constructor which initializes the size of the array based on what the user defines as the correct size for the array.
//This array is used to perform the various operations on the arraylist. This array is called Store. The program also include a default constructor to set the size
//of the array list to ten if the user does not pick a specific size.

//Another problem was to add an item to the array list. This was done by by making a variable called size and initializing it to zero. Every time an item was
//added to the list the item would be keep in the index of the array marked at size and size would be increased by one. Thus the object
//that is added in the list in added to the end of the list. This was done using the add method. 

//A second problem in the arraylist was to keep increasing the size of the array so that item can be kept being added without space running
//out. This was done with the increase method in which the store array was passed to a method which doubles it lenght and copies all the original element of
//the old array into the new longer array and returning this array as the value of store.

//A third problem was to add an object to the arrayList at a specific location. This was done by creating a method called AdLoc requiring
//the user to input the specific index and the object they want to place in the arrayList. The method then created a new Array that is longer
//in length by one that the store matrix. The new array yellow then stores all the original elements of the array store in their location shifted by one
// and if the index of yellow matches the index the user put in, then the object the user put in is stored in this index. The array store is the set equal to the
//array yellow thus ending the method.

// A fourth problem to solve when implementing the array list is to retrieve a certain item from the list. This was done
//by the method get. The get method allows you to get an object stored at a specific index in the arraylist. This was done by letting
//the user put in the index, and returning the to the user what is stored in the array at this index. To do to this first a for loop was done to evaluate the array
//if the the value of the current index of the for loop matches the index of value put in the by the user then the object stored
//at that specific index is returned. 

//A fifth problem was getting the size of the arraylist. This problem was solve by creating a method named get size. The method then returns the
//the size of the array store using the length variable the length of the array Store is then returned to the
//user.

//A sixth problem was determine whether the arrayList is empty meaning whether the arraylist has any elements it in. This problem was
//first solve by initializing the store array with the null value. Thus if the user does not put in any element into the arraylist
//only null is stored there. Then the array store was searched and a boolean value named pato was set to true,pato determines if the array store which is
//used to implement the arrayList is empty. The whole array is then searched and if all a value in it is determined not to be null then pato is set to false,
//the value pato is then returned to the user. If pato is true the array is empty, if pato is false the is not empty.

// A seventh problem is to determine whether or not an object is in the arrayList. To do this the is in method was created. A boolean value
//great was created for this method. Great was set to false. The array store was then searched for the object the user put in. If what is stored
//in the index of the object array store equals the object that the user put in then the value great will switch to true,because this means that the object
//is indeed in the array. The user will then get the boolean great as the return type. If great is true then the object is the arraylist if false
//then the object is not in the arraylist.

//A eighth problem was to return the the first instance of an object starting from location zero in the arraylist.
//This problem was solved by searching through the store array using a for loop. While this for loop was going through 
//its iteration an if statement was used to see first that what is stored in the current index in not null and then an
//if statement was used to see if what is stored in location i equals the object that the user put in. If this is the case
//the method returns i which is the location index where the object is stored, if the object is not found then the method returns 
//negative one.

//A ninth problem to be solved was removing the first occurrence of an item starting from location zero. This was done
//by first letting the user enter the object he wishes to remove. The store array is then searched with a for loop if what is stored in the index
//is found not to be null and if what is stored in the index equals the object the user put in, then that object in the index location is removed and all the other
//object are decreased in position by one, thus removing that object.

	//Data structure
//To implement an array list. The object array data structure was used.  

	//input output example
//An example of the an input is the following. First assume the user creates an arraylist named gato.
//Say the user decides to add the following
//Integer objects to the program say 5,11,21,10,12, and 13. Then using the get method in a for loop and printing the content of the arraylist will give you 5 11 21 10 12 13.
//Say the user uses the find method and put in the Integer 11 then the method will return and print to the screen 1 because that is the index
//where 11 is stored. Another method is the user can use is the is empty list the user can use gato.isEmpty() and since it is not empty it will return false.
//Another method that the user can use is the isIn method in which the user determines whether a certain object is in the 
//the list to do  for example if the user puts in gato.isIn(12) and prints out the value it should be true b/c integer object 12
//is in the list. If the user decides to add 69 to location 1 in the array using the addLocation method then the list will print out the following
//5,69,11,21,10,12,13. If the user decides to remove the object 11 using the remove method then list will become and print out to the screen 
//5,69,21,10,12,13 because the item 11 is removed.

	//Explain the purpose of each class you develop
//To implement the arrayList I only used one class which is the arraylist class, the arraylist class has all the method nessesary to implement
//the arrayList data structure.



	




//this program will create an arrayList class in Java

public class arraylist
{
	private int capacity;
	
	private int in=10; //the initial capacity of the arrayList
	//to hold how big the arrayList will
	private int size=0; //to keep increment the size
	private Object[] store; //the store where the array will be kept
	
	//the first constructor initializes the arrayList to 10
	
	public arraylist()
	{
		store = new Object[in];
		for(int i=0; i<store.length;i++)
		{
			store[i]=null;
		}
	}
	
	//in this array the user chooses how big the array will be 
	public arraylist (int dre)
	{
		capacity = dre;
		store = new Object[capacity];
		
		for(int i=0; i<store.length;i++)
		{
			store[i]=null;
		}
	}
	
		//in this class the size of the arrayList is increased. 
		//This increases the size of the arrayList
		
		public static Object[] increase (Object[] array1)
		{
			Object[] second = new Object[array1.length*2];
			//now do a loop to copy over all the element from array 1 to second which will be returned
			//as second is twice the length
			for(int i=0;i<array1.length;i++)
			{
				second[i]=array1[i];
			}
			System.out.println("the size of the list is bigger");
			return second;
		
		}
			//a method that lets you add something to the last list.
		public void add( Object obj)
		{
			if( store.length - size <= 5)
			{
				store = increase(store);
			}
			store[size]= obj;
			size++;
		}
		
		//this one does not current work
		public void add(int index , Object obj)
		{		//some of the variables in this method
			int newIndex=index;

			if(store.length - size <=4)
			{
				store=increase(store);
			}
			//create a new array
			Object[] yellow = new Object[store.length+1];
			int j=0;
			
			for(int i=0;i<yellow.length;i++)
			{
				if( i == newIndex)
				{
					yellow[i] = obj;
				
				}
				else
				{
					yellow[i] = store[j];
					j++;
				
				}
			}
				store=yellow;
		}
			
			//now apply the algorithm 
			
			
		//this method get the object stored in the specific index
		public Object get( int i)
		{
			if(i < store.length)
			{
				return store[i];
			
			}
			else
			{
				System.out.println("sorry you are out of bounds");
				return null;
			}
		}
		
		//return the the size of the array
		public int getSize()
		{
			return store.length;
		}
		
		
		//this method checks to see if the arrayList is empty meanign it has no object
		public boolean isEmpty()
		{
			boolean pato=true;
			for( int i=0;i<store.length;i++)
			{
				if( store[i] !=null)
				{
					pato=false;
					return pato;
				}
			}
				return pato;
		}
		
		//this method will return the first occurence of an object
		public int find (Object obj)
		{
			for(int i=0; i<store.length;i++)
			{
				if(store[i] != null)
				{
					if(store[i].equals(obj))
					{
						return i;
					}
				}
				
			}
				return -1;
		}
		
		//this method will see if a particular object is in the arrayList
		
		public boolean isIn(Object obj)
		{
			boolean great=false;
			for(int i=0;i<store.length;i++)
			{
			
				if(store[i] != null)
				{
				
					if(store[i].equals(obj))
					{
						great=true;
					}
				}
				
			}
				return great;
		}
		
		public void remove(Object obj)
		{
			//Object tmp = new Object(); //a temporary thing
			
			//using an algorithm set the one foward to null, and the backward to what foward was.
			for(int i=0;i<store.length;i++)
			{
				if(store[i] !=null)
				{
					if(store[i].equals(obj))
					{
						//tmp=store[i+1];
						//store[i]=tmp;
						//store[i+1]=null;
						//store[i]=null;
						
						int tmp=i;
						while(tmp < size)
						{
							store[tmp] = store[tmp+1];
							store[tmp+1] = null;
							tmp++;
							
							
						}
						
					}
				
				}
				
				
			}
				size--;
			
		}
			
			
}

