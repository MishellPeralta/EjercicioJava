package com.gm.mundopc;

public class Computadora {
	private int idComputadora;
	private double precio;
	private String nombre;
	private Monitor monitor;
	private Teclado teclado;
	private Raton raton;
	private static int contadorComputadoras;
	
	public Computadora(){
		this.idComputadora=++contadorComputadoras;
		
	}
	
	public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton, double precio){
		this();
		this.nombre=nombre;
		this.monitor=monitor;
		this.teclado=teclado;
		this.raton=raton;
		this.precio=precio;
	
	}

	public int getIdComputadora() {
		return idComputadora;
	}

	public void setIdComputadora(int idComputadora) {
		this.idComputadora = idComputadora;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

	public Teclado getTeclado() {
		return teclado;
	}

	public void setTeclado(Teclado teclado) {
		this.teclado = teclado;
	}

	public Raton getRaton() {
		return raton;
	}

	public void setRaton(Raton raton) {
		this.raton = raton;
	}

	public static int getContadorComputadoras() {
		return contadorComputadoras;
	}

	public static void setContadorComputadoras(int contadorComputadoras) {
		Computadora.contadorComputadoras = contadorComputadoras;
	}

	@Override
	public String toString() {
		return "Computadora [idComputadora=" + idComputadora + ", precio=" + precio + ", nombre=" + nombre+" "
				+monitor +  teclado +raton + "]";
	}

	
	
	

}
