package com.gm.mundopc;

public class Orden {
 private int idOrden;
 private Computadora computadoras[];
 private static int contadorOrdenes;
 private static int contadorComputadoras;
 private static final int MAX_COMPUTADORAS=15;
 
 
 public Orden() {
	 this.idOrden=++contadorOrdenes;
	 this.computadoras=new Computadora[MAX_COMPUTADORAS];
 }
 
 public void agregarComputadora(Computadora computadora) {
	 if(contadorComputadoras<MAX_COMPUTADORAS) {
	 computadoras[contadorComputadoras++]=computadora;
	 }
	 else {
		 System.out.println("Supero el maximo de cantidades de computadoras"+MAX_COMPUTADORAS);
	 }
 }
 
 public double calcularTotal() {
	 double total=0;
	 for(int  i=0; i<contadorComputadoras;i++) {
		 Computadora computadora=this.computadoras[i];
		 total+=computadora.getPrecio();
	 }
	 return total;
 }
 
 public void mostrarOrden() {
	 System.out.println("Numero de orden: "+ idOrden);
	 System.out.println("Numero de orden: "+calcularTotal());
	 System.out.println("Descripción de la computadora: ");
	 for(int i=0; i<contadorComputadoras; i++) {
		 System.out.println(computadoras[i]);
	 }
	 
 }
}
