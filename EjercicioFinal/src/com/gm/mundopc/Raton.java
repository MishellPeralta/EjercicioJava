package com.gm.mundopc;

public class Raton extends DispositivoEntrada{

	private int idRaton;
	private static int contadorRatones;
	
	
	public Raton(String tipoEntrada, String marca) {
		super(tipoEntrada, marca);
		this.idRaton=++contadorRatones;
	}


	public int getIdRaton() {
		return idRaton;
	}


	public void setIdRaton(int idRaton) {
		this.idRaton = idRaton;
	}


	public static int getContadorRatones() {
		return contadorRatones;
	}


	public static void setContadorRatones(int contadorRatones) {
		Raton.contadorRatones = contadorRatones;
	}


	@Override
	public String toString() {
		return "Raton [idRaton=" + idRaton +","+ " "+super.toString()+"]";
	}
	

}
