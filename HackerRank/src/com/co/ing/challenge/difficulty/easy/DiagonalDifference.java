package com.co.ing.challenge.difficulty.easy;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * 
 * @author Edwin Cabezas
 *
 */
public class DiagonalDifference { 

	static int diagonalDifference(int[][] arr) {
		int[] diagoPrincipal = new int[arr.length];
        int[] diagoSecundaria = new int[arr.length];
		
		IntStream.range(0, arr.length).forEach(i -> { diagoPrincipal[i] = arr[i][i]; diagoSecundaria[i] = arr[i][(arr.length - i) -1]; });
		return Math.abs(Arrays.stream(diagoPrincipal).sum() - Arrays.stream(diagoSecundaria).sum());
    }

	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Ed\\Documents\\java\\res.txt"));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[][] arr = new int[n][n];

		for (int i = 0; i < n; i++) {
			String[] arrRowItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int j = 0; j < n; j++) {
				int arrItem = Integer.parseInt(arrRowItems[j]);
				arr[i][j] = arrItem;
			}
		}

		int result = diagonalDifference(arr);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}

}
