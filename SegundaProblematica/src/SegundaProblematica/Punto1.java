package SegundaProblematica;
import java.util.Scanner;

public class Punto1 {
	private Scanner sc;
	String nombre;
	double sueldo;
	
	public Punto1() {
		sc=new Scanner(System.in);
		System.out.print("Ingrese el nombre del empleado: ");
		nombre=sc.nextLine();
		System.out.print("Ingrese su sueldo: ");
		sueldo=sc.nextDouble();
	}
	
	public void Impuestos() {
		if(sueldo>1500000) {
			System.out.println("Debe pagar impuestos.");
		}else {
			System.out.println("No debe pagar impuestos.");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punto1 empleado1;
		empleado1=new Punto1();
		empleado1.Impuestos();
		
	}

}
