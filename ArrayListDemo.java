package JavaCollection;

import java.util.ArrayList; // Package of class

public class ArrayListDemo {

	public static void main(String[] args) 
	{
		
		ArrayList list1 = new ArrayList(); //package object - access methods in the array list
		list1.add("edubridge");
		list1.add(100);
		list1.add(false);
		list1.add(99.96);
		list1.add("edubridge"); //duplicate members allowed in arraylist
		
		System.out.println("Array members : "+list1);
		System.out.println("Size of Arraylist : "+ list1.size());
		
	
		//list is a not array type.
		//list is method type so we use get method
		for(int i=0; i<list1.size(); i++ )
		{
			System.out.println( "position : "+(i+1) +" member : " +list1.get(i));
		}
	}

}
