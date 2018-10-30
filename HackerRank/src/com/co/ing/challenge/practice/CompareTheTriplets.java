package com.co.ing.challenge.practice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * 
 * @author Edwin Cabezas
 *
 */
public class CompareTheTriplets {

	// Complete the solve function below.
	static int[] solve(int[] a, int[] b) {
		int[] res = new int[2];
		for (int i = 0; i < a.length; i++) {
			if(a[i] != b[i]) {
				if(a[i] > b[i])
					res[0] = res[0]+1;
				else
					res[1] = res[1]+1;
			}
		}
		
		return res;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Ed\\Documents\\java\\res.txt"));

		int[] a = new int[3];
		
		String[] aItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < 2; i++) {
			int aItem = Integer.parseInt(aItems[i]);
			a[i] = aItem;
		}
		int[] b = new int[3];

		String[] bItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < 3; i++) {
			int bItem = Integer.parseInt(bItems[i]);
			b[i] = bItem;
		}

		int[] result = solve(a, b);

		for (int i = 0; i < result.length; i++) {
			bufferedWriter.write(String.valueOf(result[i]));

			if (i != result.length - 1) {
				bufferedWriter.write(" ");
			}
		}

		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
