package edu.mum.fpp.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.mum.fpp.entity.Prog6;

public class TestProg6 {
	
	//TDD
	//Step 1: Think think what we need mmmm.
	//Prog6 class with an array of String with arguments
	// method to return an array without duplicates words
	
	String[] arrrayOfStrings = {"horse", "dog", "cat", "horse","dog"};
	String[] arrrayOfStrings1 = {"horse", "dog", "cat"};
	String[] arrrayOfStrings2 = {"horse", "horse"};
	String[] arrrayOfStrings3 = {"horse","dog",null,"cat",null};
	
	Prog6 p6 = new Prog6(arrrayOfStrings);
	
	//Step 2: Create the code to make this run:
	// Create Prog6 class
	//		  method removeDups, exitsElementAt, countElments
	
	@SuppressWarnings("deprecation")
	@Test
	public void testRemoveDups() {
		
		String[] result = {"horse","dog","cat"};
		
		assertEquals(result, p6.removeDups(arrrayOfStrings));
		
	}
	
	
	//Verify if that string exist on the array
	@Test
	public void testExitsElementAt() {
		
		assertEquals(true, p6.exitsElementAt("horse", arrrayOfStrings));
		
	}
	
	//Count how many elements are in the array different of null ""	
	@Test
	public void testCountElments() {
		
		assertEquals(3, p6.countElments(arrrayOfStrings3));
		
	}
	
	//Remove nulls
	@SuppressWarnings("deprecation")
	@Test
	public void testRemoveNulls() {
		
		String[] result = {"horse","dog","cat"};
		
		assertEquals(result, p6.removeNulls(arrrayOfStrings3));
		
	}
	
}
