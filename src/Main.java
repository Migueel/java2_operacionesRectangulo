import java.util.Scanner;

//Programa para visualizar en pantalla el area y el perimetro de un rectangulo.

public class Main {
	
	public static void main (String args[]) {

	double altura, base, area, perimetro;
			
		Rectangulo operaciones = new Rectangulo();
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca la base del rectangulo");
		base = sc.nextDouble();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca la altura del rectangulo");
		altura = sc.nextDouble();
		
		area = operaciones.area(altura, base);
		perimetro = operaciones.perim(altura, base);

	System.out.println("El área del rectangulo es:" + area);
	System.out.println("El perimetro del rectangulo es:" + perimetro);
