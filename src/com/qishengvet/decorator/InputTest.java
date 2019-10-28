package com.qishengvet.decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {

	public static void main(String[] args) {
		int c;

		InputStream in;
		try {
			in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("test.txt")));
			while ((c = in.read()) >= 0) {
				System.out.print((char) c);
			}

			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		

	}
}
