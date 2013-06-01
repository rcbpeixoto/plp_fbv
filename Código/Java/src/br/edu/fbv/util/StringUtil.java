package br.edu.fbv.util;

public abstract class StringUtil {

	public static boolean isNullOrEmpty(String text) {
		return ((text == null) || (text.trim().length() == 0));
	}
}
