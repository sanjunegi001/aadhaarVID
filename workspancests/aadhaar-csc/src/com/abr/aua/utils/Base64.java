package com.abr.aua.utils;

import java.io.ByteArrayOutputStream;

public class Base64 {

	public static String encode(byte[] data) {

		char[] array = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
		StringBuilder sb = new StringBuilder();
		int n = 0;
		for (int i = 0; i < data.length; i += 3) {
			int n2 = (data[i] & 0xFF) << 16 & 0xFFFFFF;
			if (i + 1 < data.length) {
				n2 |= (data[i + 1] & 0xFF) << 8;
			} else {
				++n;
			}
			if (i + 2 < data.length) {
				n2 |= (data[i + 2] & 0xFF);
			} else {
				++n;
			}
			for (int j = 0; j < 4 - n; ++j) {
				sb.append(array[(n2 & 0xFC0000) >> 18]);
				n2 <<= 6;
			}
		}
		for (int k = 0; k < n; ++k) {
			sb.append("=");
		}

		return sb.toString();
	}

	public static byte[] decode(String data) {

		int[] array = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

		byte[] bytes = data.getBytes();
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		int i = 0;

		while (i < bytes.length) {
			if (array[bytes[i]] != -1) {
				int n = (array[bytes[i]] & 0xFF) << 18;
				int j = 0;
				if (i + 1 < bytes.length && array[bytes[i + 1]] != -1) {
					n |= (array[bytes[i + 1]] & 0xFF) << 12;
					++j;
				}
				if (i + 2 < bytes.length && array[bytes[i + 2]] != -1) {
					n |= (array[bytes[i + 2]] & 0xFF) << 6;
					++j;
				}
				if (i + 3 < bytes.length && array[bytes[i + 3]] != -1) {
					n |= (array[bytes[i + 3]] & 0xFF);
					++j;
				}
				while (j > 0) {
					byteArrayOutputStream.write((char) (n >> 16 & 0xFF));
					n <<= 8;
					--j;
				}
				i += 4;
			} else {
				++i;
			}
		}

		return byteArrayOutputStream.toByteArray();
	}

}
