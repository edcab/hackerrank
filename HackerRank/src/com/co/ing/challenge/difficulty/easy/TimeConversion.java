package com.co.ing.challenge.difficulty.easy;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class TimeConversion {

	/*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s)  {
    	try {
    		SimpleDateFormat inFormat = new SimpleDateFormat("hh:mm:ssaa");
    		SimpleDateFormat outFormat = new SimpleDateFormat("HH:mm:ss"); 
    		String time24 = outFormat.format(inFormat.parse(s));
			return time24;
		} catch (ParseException e) {
			e.printStackTrace();
		}
    	return null;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Ed\\Documents\\java\\res.txt"));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();
    }

}
