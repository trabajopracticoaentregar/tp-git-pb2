package ar.edu.unlampb2;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Double a;
		Double b;
		char opcion;
		Double resultado;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingrese su operación \n a) para sumar \n b) para restar \n c) para multiplicar \n d) para dividir");
		opcion = teclado.next().charAt(0);

		switch (opcion) {
		case 'a':
			System.out.println("Ingrese el 1er numero");
			a = teclado.nextDouble();

			System.out.println("Ingrese el 2do numero");
			b = teclado.nextDouble();
			System.out.println("El resultado de la suma es : " + (resultado = a + b));
			break;

		case 'b':
			System.out.println("Ingrese el primer numero");
			a = teclado.nextDouble();

			System.out.println("Ingrese el segundo numero");
			b = teclado.nextDouble();
			System.out.println("El resultado de la resta es : " + (resultado = a - b));
			break;

		case 'c':
			System.out.println("Ingrese el primer numero");
			a = teclado.nextDouble();

			System.out.println("Ingrese el segundo numero");
			b = teclado.nextDouble();
			System.out.println("El resultado de la  multiplicacion es : " + (resultado = a * b));
			break;

		case 'd':
			System.out.println("Ingrese el primer numero");
			a = teclado.nextDouble();

			System.out.println("Ingrese el segundo numero");
			b = teclado.nextDouble();
			
			if (b != 0) {

				System.out.println("El resultado de la division es : " + (resultado = a / b));
			} else {
				System.out.println("La division por 0 no existe");
			}
			break;

		default:
			System.out.println("Ingresaste el valor incorrecto");
			break;
			
		}

	}

}
