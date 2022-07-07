package setra.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class General {
	final protected static char[] hexArray = "0123456789ABCDEF".toCharArray();
	private static String SALT = "�SecrtSaltK3yJ4v4!";

	private static String bytesToHex(byte[] bytes) {
		char[] hexChars = new char[bytes.length * 2];
		int v;
		for (int j = 0; j < bytes.length; j++) {
			v = bytes[j] & 0xFF;
			hexChars[j * 2] = hexArray[v >>> 4];
			hexChars[j * 2 + 1] = hexArray[v & 0x0F];
		}
		return new String(hexChars);
	}

	public static String Encriptar(String texto) { 
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			md.update(SALT.getBytes()); // <-- Prepend SALT.
			md.update(texto.getBytes());
			// md.update(SALT.getBytes()); // <-- Or, append SALT.

			byte[] out = md.digest();
			return bytesToHex(out); // <-- Return the Hex Hash.
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return "";
	}
}