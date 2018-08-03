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
	
	//Step 2: Create the code to make this run:
	// Create Prog6 class
	//		  method removeDups, exitsElementAt, countElments
	
	@SuppressWarnings("deprecation")
	@Test
	public void testRemoveDups() {
		
		//Test case#1 : Example of the lab two repeated elements
		String[] source1 = {"horse", "dog", "cat", "horse","dog"};	
		String[] result1 = {"horse","dog","cat"};
		
		assertEquals(result1, Prog6.removeDups(source1));
	}
	
	//Test case#11 : All the elements are different
	@SuppressWarnings("deprecation")
	@Test
	public void testRemoveDups1() {
		
		//All the elements are different
		String[] source2 = {"horse", "dog", "cat", "elephant","cow"};	
		String[] result2 = {"horse", "dog", "cat", "elephant","cow"};
		
		assertEquals(result2, Prog6.removeDups(source2));
	}
		
	//Test case#12 : All the elements are the same
		@SuppressWarnings("deprecation")
		@Test
		public void testRemoveDups2() {
		
		//All the elements are different
		String[] source3 = {"dog", "dog", "dog", "dog","dog"};	
		String[] result3 = {"dog"};
		
		assertEquals(result3, Prog6.removeDups(source3));

	}
	
	
	//----------------------Verify if that string exist on the array-------------------------------
	//Test case#2: Verify if that string exist on the array
	@Test
	public void testExitsElementAt() {
		
		assertEquals(true, Prog6.exitsElementAt("horse", arrrayOfStrings));
		
	}
	
	//Test case#3: Verify if that string exist on the array
	@Test
	public void testExitsElementAt1() {
		
		assertEquals(false, Prog6.exitsElementAt("elephant", arrrayOfStrings));
		
	}
	
	//-----------------------Count how many elements are in the array different of null--------------
	//Test case#4: nulls are in the end
	@Test
	public void testCountElments() {
		
		String[] arrrayOfStrings3 = {"horse","dog","cat",null, null};
		
		assertEquals(3, Prog6.countElments(arrrayOfStrings3));
		
	}
	
	//Test case#5: nulls in the beginning
	@Test
	public void testCountElments1() {
		
		String[] arrrayOfStrings3 = {null, null,"horse","dog","cat"};
		
		assertEquals(3, Prog6.countElments(arrrayOfStrings3));
	}
	
	//Test case#6: nulls in between
	@Test
	public void testCountElments2() {
		
		String[] arrrayOfStrings3 = {"horse", null, "dog", null,"cat"};
		
		assertEquals(3, Prog6.countElments(arrrayOfStrings3));
	}
	
	//Test case#7: nulls in everywhere
	@Test
	public void testCountElments3() {
		
		String[] arrrayOfStrings3 = {null, "horse", null, "dog", null,"cat", null};
		
		assertEquals(3, Prog6.countElments(arrrayOfStrings3));
	}
	
	//Test case#7: Everything it is null
	@Test
	public void testCountElments4() {
		
		String[] arrrayOfStrings3 = {null, null, null, null, null, null, null};
		
		assertEquals(0, Prog6.countElments(arrrayOfStrings3));
	}
	
	//---------------------Remove nulls--------------------------------------------------------
	
	//Remove nulls
	//test case#8: removing null in the end
	@SuppressWarnings("deprecation")
	@Test
	public void testRemoveNulls() {
		
		String[] arrrayOfStrings3 = {"horse","dog","cat",null, null};
		String[] result = {"horse","dog","cat"};
		
		assertEquals(result, Prog6.removeNulls(arrrayOfStrings3));
		
	}
	
	//test case#8: removing null in the beginning
	@SuppressWarnings("deprecation")
	@Test
	public void testRemoveNulls1() {
		
		String[] arrrayOfStrings3 = {null, null, "horse","dog","cat", };
		String[] result = {"horse","dog","cat"};
		
		assertEquals(result, Prog6.removeNulls(arrrayOfStrings3));
		
	}
	
	//test case#9: removing null in between
	@SuppressWarnings("deprecation")
	@Test
	public void testRemoveNulls2() {
		
		String[] arrrayOfStrings3 = {"horse", null, "dog", null, "cat"};
		String[] result = {"horse","dog","cat"};
		
		assertEquals(result, Prog6.removeNulls(arrrayOfStrings3));
		
	}
	
	//test case#10: removing null in everywhere
	@SuppressWarnings("deprecation")
	@Test
	public void testRemoveNulls3() {
		
		String[] arrrayOfStrings3 = {null, "horse", null, "dog", null, "cat", null};
		String[] result = {"horse","dog","cat"};
		
		assertEquals(result, Prog6.removeNulls(arrrayOfStrings3));
		
	}
	
	//test case#10: all the array is null
	@SuppressWarnings("deprecation")
	@Test
	public void testRemoveNulls4() {
		
		String[] arrrayOfStrings3 = {null, null, null, null, null, null, null};
		String[] result = {};
		
		assertEquals(result, Prog6.removeNulls(arrrayOfStrings3));
		
	}
	
	//Step 3: Refactor we require to print out like this: ["horse","dog","cat"]
	//include the static key word and create new test cases
	//Now we will create handling exception
	
}
