package Modelo;

public class ConversorEurosPesetas extends ConversorEuros {

	public ConversorEurosPesetas() {
		super(166.386D);
		// TODO Auto-generated constructor stub
	}

	public double eurosApesetas(double cantidad) {
		return eurosAmoneda(cantidad);
	}

	public double pesetasAeuros(double cantidad) {
		return monedaAeuros(cantidad);
	}

}
