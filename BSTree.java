
//Purpose
//The purpose of the this program is to create a binary tree and use it to perform an infix
//traversal of a series of numbers. The numbers inserted into the program will be a series of random 
//numbers from 1 to 99. They will be stored in an array and later they will be stored in a binary search
//tree. Completing this project will help give us more experience with binary search tree and especially
//the reference based implementation of the binary search tree using nodes. 

//Algorithm 
//The algorithm that will be used to created to solve the binary tree uses the recursion technique in which
//first the root is of the tree is defined and if the rest of the nodes are inserted into the tree based on the root node.
//If the root node is empty then then when a new node is added to the tree containing the integer data value then
//a new root is created. The root is considered the current node. If the new node inserted is less than the current node it
//is placed to the the left of the current node. If it is greater than or equal to the current node it is placed to the right. 
//The program also uses the infix notation transversal to display the nodes and the numbers stored in the binary array. It does this by
//getting the left data then getting the right data and then finally getting to parent node. Because this is a binary search tree
//each parent can have at most two children. The node class is used to store the data which will be put in the binary tree and the type
//of data put in the tree in the integer type. The insert function has is public when the user is adding data from the the data structure to the
//tree and the private when working out how the nodes will arranged in the tree. 

//Data structure
//The data structures used in this program include the reference based implementation of the array data
//structure and an array of integers which are used to store the integers in the binary search tree. I also 
//used the node data structure.

//Input output demonstration
//First the program will display binary search tree. Then it will insert everything that is currently in the array of integers. For example if the
//random numbers in the array are 4 3 2 1 the program will display the numbers in the
//infix order like this  1 2 3 4 the program will keep doing this until the contents of the array are completely empty and
//all the numbers are in the binary array. It will put the numbers in the correct order. From least to greatest
//is how my numbers will end up being printed.

//Classes
//There are a total of three class I used for this program. The class arbol is where I created the
//the reference based implementation of the binary search tree and this is where I did all the recursive algorithms. 
//The class node is where I created the nodes or the reference that point from one link to another in my tree. It is here
//That I have method that make my nodes point to other nodes on the left and to other nodes on the right and allow me to create
//the binary search tree. The class BSTree is where I have my main function this is where I display the numbers that 
//are stored in my binary search tree using the recursion method.

import java.util.Random;
public class BSTree
{
	public static void main(String[] args)
	{
		System.out.println("this agustin fleiderman program");
		int[] array = new int[50];
		Random number = new Random();
		System.out.println("this is what is currently in array");
		//fill up the array from number 1 to 99
		for(int i=0;i<array.length;i++)
		{
			array[i]=number.nextInt(99-1+1)+1;
		
		}
		//see what is stored inside
		for(int j=0; j<array.length;j++)
		{
			System.out.print(array[j]+ " " );
		
		
		}
		//create a new arbol object 
		
		//thus the program is now printed the in the correct order
		Arbol agustin = new Arbol();
		for(int k=0;k<array.length;k++)
		{
			agustin.insert(array[k]);
		
		
		}
		System.out.println();
		System.out.println("Now to print it inorder");
		agustin.inorder();
	
	
	}

}

 class Node
{
	int doctor;
	Node left; //the left node 
	Node right;	// the right node
	int data;
	//this creates the null class and sets it to the left and the right
	//constructor
	public Node()
	{
		left=null;
		right=null;
		data=0;

	}
	//another type of constructor
	public Node( int k)
	{
		left=null;
		right=null;
		data=k;
	}
	
	//this demnads that I put in a node to set to the left of my current node
     public void setLeft(Node n)
     {
         left = n;
     }
    
     public void setRight(Node n)
     {
         right = n;
     }
    
     public Node getLeft()
     {
         return left;
     }
    
     public Node getRight()
     {
         return right;
     }
    
     public void setData(int k)
     {
         data = k;
     }
  
     public int getData()
     {
         return data;
     }     


}

	//this next class is used to implement the binary search tree in my program 
	
	class Arbol
	{
		private Node root;
		
		public Arbol()
		{
			root=null;
		
		}
		
		//function to see if tree is empty
		public boolean isEmpty()
     {
        if(root == null)
		{
			return true;
		
		}
		return false;
     }
		//the next function is used to insert data
		public void insert(int number)
		{
			root=insert(root,number);
		
		
		}
		 private Node insert(Node node, int data)
     {
		//this will make the binary tree work
         if (node == null)
             node = new Node(data);
         else
         {
			//if if it less than the current node insert to the right if notation
			//insert to the left
             if (data <= node.getData()) //the binary tree if th
                 node.left = insert(node.left, data);
             else
                 node.right = insert(node.right, data);
         }
         return node;
     }
	 
	 //this is the function for the inoder transversal from the left to the right
	 //this is a reursive function
	 public void inorder()
     {
         inorder(root);
     }
     private void inorder(Node r)
     {
         if (r != null)
         {
             inorder(r.getLeft());//get the left part of the binary tree and then get the right part
             System.out.print(r.getData() +" ");
             inorder(r.getRight());
         }
     }
	
	}