package mundopc;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.gm.mundopc.Computadora;
import com.gm.mundopc.Monitor;
import com.gm.mundopc.Orden;
import com.gm.mundopc.Raton;
import com.gm.mundopc.Teclado;

public class MundoPC {
	public static void main(String[] args){
		LocalDateTime ld=LocalDateTime.now();

		
		Monitor monitor1=new Monitor("Samsung", 16.1);
		
		Raton raton1=new Raton("USB", "Genius");
		
		Teclado teclado1=new Teclado("Inalambrico", "Login");
		Teclado teclado2=new Teclado("Cable", "Microsoft");
		
		Computadora computadora1=new Computadora("Gamer", monitor1, teclado1, raton1, 1500);
		Computadora computadora2=new Computadora("LUZ", monitor1, teclado2, raton1, 2000);
		
		
		
		
		//Creamos la el objeto orden
		Orden orden1=new Orden();
		Orden orden2=new Orden();
		
		//Agregamos los productos al objeto orden
		
		orden2.agregarComputadora(computadora2);
		
		
		//Imprimimos la orden
		System.out.println(ld);
		orden2.mostrarOrden();
	}

	

}
