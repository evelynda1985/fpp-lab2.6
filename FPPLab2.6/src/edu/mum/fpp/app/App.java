package edu.mum.fpp.app;

import java.util.Arrays;

import edu.mum.fpp.entity.Prog6;

public class App {

	public static void main(String[] args) {
		
		//hard code array fixed by 5
		String[] arrrayOfStrings = {"horse", "dog", "cat", "horse","dog"};
		
		Prog6 p6 = new Prog6(arrrayOfStrings);
		
		Arrays.stream(p6.removeDups(arrrayOfStrings)).forEach((x)->System.out.println(x));


	}

}
