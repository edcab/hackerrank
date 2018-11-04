package com.co.ing.challenge.difficulty.easy;

import java.util.Collections;
import java.util.Scanner;

/**
 * 
 * @author Edwin Cabezas
 *
 */
public class Staircase {
	
	
    static void staircase(int n) {
    	String stairString = new String();
    	
    	for(int i = 1; i <= n; i++) {
    		stairString = String.join(stairString, Collections.nCopies(n - i, " "))
    				.concat(String.join(stairString, Collections.nCopies(i, "#") ));
    		System.out.println(stairString);
    		stairString = new String();
    	}
    }

	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }

}
