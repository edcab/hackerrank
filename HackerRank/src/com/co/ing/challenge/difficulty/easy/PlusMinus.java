package com.co.ing.challenge.difficulty.easy;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @author Edwin Cabezas
 *
 */
public class PlusMinus {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
    	float negative = 0, positive = 0, zero = 0;
    	
    	positive 	= Arrays.stream(arr).filter(i -> i > 0).count();
    	negative 	= Arrays.stream(arr).filter(i -> i < 0).count();
    	zero 		= Arrays.stream(arr).filter(i -> i == 0).count();
    	
    	System.out.println( new BigDecimal (positive / arr.length).setScale(6, BigDecimal.ROUND_HALF_UP) );
    	System.out.println( new BigDecimal (negative / arr.length).setScale(6, BigDecimal.ROUND_HALF_UP) );
    	System.out.println( new BigDecimal (zero / arr.length).setScale(6, BigDecimal.ROUND_HALF_UP) );

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}