package br.com.maxdoliveira;

import java.util.Scanner;

public class AtividadeEnum {

	private static Scanner teclado;

	public static void main(String[] args) {
		System.out.println(DiaSemana.DOMINGO);

		System.out.println(DiaSemana.valueOf("SEGUNDA"));

		DiaSemana[] dias = DiaSemana.values();

		teclado = new Scanner(System.in);
		System.out.print("Informe um numero" + " >>");
		Integer verificaDia = teclado.nextInt();
		
		System.out.println(dias[verificaDia]);
	

//		for (DiaSemana diasemana : dias) {
//			System.out.println(diasemana);
//		}

		
	}


}
