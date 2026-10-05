package actividadPropuesta25;

import java.util.Scanner;

public class Actividadpropuesta25 {
//ctrl + shift + f= formatear las lineas = tabular bien = ordenar lineas = Trueno tabula
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double aforoMaximo = 0;
		double precioEntrada = 0;
		double entradasVendidas = 0;

		System.out.println("aforo maximo");
		aforoMaximo = sc.nextInt();

		System.out.println("precio entrada");
		precioEntrada = sc.nextInt();

		System.out.println("entradas vendidas");
		entradasVendidas = sc.nextInt();

		double porcentajesEntradas = ((entradasVendidas / aforoMaximo) * 100);

		double totalRecaudado = (precioEntrada * entradasVendidas);
		
		if (porcentajesEntradas <= 20) {
			System.out.println("se cancela");
		} else if (porcentajesEntradas <= 50) {
			double descuento = (precioEntrada / 4);

			 totalRecaudado = (descuento * entradasVendidas);
			
		

			System.out.println("no se han vendido suficientes entradas" + totalRecaudado);

		}else{
			
			System.out.println("si se han vendido suficientes entradas" + totalRecaudado);
		
		}

	}

}
