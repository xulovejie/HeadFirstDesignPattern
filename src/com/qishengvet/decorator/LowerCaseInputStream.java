package com.qishengvet.decorator;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {
	public LowerCaseInputStream(InputStream in) {
		super(in);
	}
	
	public int read() throws IOException {
		int c  = super.read();
		return c == -1 ? c : Character.toLowerCase(c);
	}
	
	public int read(byte[] b, int offset, int len) throws IOException {
		int result = super.read(b, offset, len);
		for(int i = offset; i < offset+result; i++) {
			b[i] = (byte) Character.toLowerCase(b[i]);
		}
		
		return result;
	}
}
