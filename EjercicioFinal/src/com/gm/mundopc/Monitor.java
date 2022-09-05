package com.gm.mundopc;

public class Monitor {
	private int idMonitor;
	private String marca;
	private double tama�o;
	private static int contadorMonitores;
	
	
	public Monitor() {
		this.idMonitor=++contadorMonitores;
	}
	public Monitor(String marca, double tama�o) {
		this();
		this.marca=marca;
		this.tama�o=tama�o;
		
	}
	public int getIdMonitor() {
		return idMonitor;
	}
	public void setIdMonitor(int idMonitor) {
		this.idMonitor = idMonitor;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getTama�o() {
		return tama�o;
	}
	public void setTama�o(double tama�o) {
		this.tama�o = tama�o;
	}
	public static int getContadorMonitores() {
		return contadorMonitores;
	}
	public static void setContadorMonitores(int contadorMonitores) {
		Monitor.contadorMonitores = contadorMonitores;
	}
	@Override
	public String toString() {
		return "Monitor [idMonitor=" + idMonitor + ", marca=" + marca + ", tama�o=" + tama�o + "]";
	}

	
}
