package deber4;

import java.util.Date;
public class Empleado extends Persona {
	private double salario;
	private Date FechaEntrada;
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public Date getFechaEntrada() {
		return FechaEntrada;
	}
	public void setFechaEntrada(Date fechaEntrada) {
		FechaEntrada = fechaEntrada;
	}
	
}
