package setra.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class General {
	final protected static char[] hexArray = "0123456789ABCDEF".toCharArray();
	private static String SALT = "¡SecrtSaltK3yJ4v4!";
	private static final String FORMATO_FECHA = "yyyy-MM-dd";

	public static enum AuthActions {
		INICIAR_SESION, CAMBIAR_PASSWORD, REESTABLECER_PASSWORD, CERRAR_SESION
	}

	public static enum UsuariosActions {
		CONSULTAR, REGISTRAR, EDITAR, CAMBIAR_ESTADO, GENERAR_TICKET_SOPORTE, GENERAR_TICKET_CAPACITACION,
		GENERAR_REPORTE_INCIDENTES
	}

	public static enum ClientesActions {
		CONSULTAR, REGISTRAR, EDITAR, CAMBIAR_ESTADO
	}

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
			md.update(SALT.getBytes());
			md.update(texto.getBytes());
			// md.update(SALT.getBytes());

			byte[] out = md.digest();
			return bytesToHex(out);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return "";
	}

	public static Date ConvertToDate(Object fecha) {
		if (fecha == null)
			return null;

		String valorFecha = fecha.toString();
		Date date = null;
		try {
			date = new SimpleDateFormat(FORMATO_FECHA).parse(valorFecha);
		} catch (Exception e) {
			return null;
		}
		return date;
	}

	public static String ConvertToString(Object parameter) {
		return parameter != null ? parameter.toString() : "";
	}

	public static int ConvertToInt(Object parameter) {
		return parameter != null ? Integer.parseInt(ConvertToString(parameter)) : 0;
	}
}
