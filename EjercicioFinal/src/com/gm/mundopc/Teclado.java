package com.gm.mundopc;

public class Teclado extends DispositivoEntrada{
	
	private int idTeclado;
	private static int contadorTeclados;
	

	public Teclado(String tipoEntrada, String marca) {
		super(tipoEntrada, marca);
		this.idTeclado=++contadorTeclados;
		
		
	}

	public int getIdTeclado() {
		return idTeclado;
	}

	public void setIdTeclado(int idTeclado) {
		this.idTeclado = idTeclado;
	}

	public static int getContadorTeclados() {
		return contadorTeclados;
	}

	public static void setContadorTeclados(int contadorTeclados) {
		Teclado.contadorTeclados = contadorTeclados;
	}

	@Override
	public String toString() {
		return "Teclado [idTeclado=" + idTeclado +","+ " "+super.toString()+"]";
	}

	
}
