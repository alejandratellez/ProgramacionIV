package Turnero;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class NodoCliente {
	private Turno dato;
	private NodoCliente enlace;
	
	public NodoCliente(Turno dato) {
		this.dato=dato;
		this.enlace = null;		
	}

	public Turno getDato() {
		return dato;
	}

	public void setDato(Turno dato) {
		this.dato = dato;
	}

	public NodoCliente getEnlace() {
		return enlace;
	}

	public void setEnlace(NodoCliente enlace) {
		this.enlace = enlace;
	}

	

}
