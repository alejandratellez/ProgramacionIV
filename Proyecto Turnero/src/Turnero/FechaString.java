package Turnero;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FechaString {

	public FechaString() {
	}

	public String getFecha() {
		Date date = new Date();
		DateFormat fechaHora = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String convertido = fechaHora.format(date);

		return convertido;

	}

}
