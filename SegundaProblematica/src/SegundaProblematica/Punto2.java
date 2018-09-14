package SegundaProblematica;
import java.util.Scanner;

public class Punto2 {
private Scanner sc;
int a,b;

public Punto2() {
	sc=new Scanner(System.in);
	System.out.println("Ingrese dato:");
	a=sc.nextInt();
	System.out.println("Ingrese dato:");
	b=sc.nextInt();
}

public void suma() {
	int suma;
	suma=a+b;
	System.out.println(a+" + "+b+" = "+suma);
}

public void resta() {
	int resta;
	resta=a-b;
	System.out.println(a+" - "+b+" = "+resta);
}

public void multiplicar() {
	int multi;
	multi=a*b;
	System.out.println(a+" x "+b+" = "+multi);
}

public void dividir() {
	int dividir;
	dividir=a/b;
	if(a==0 | b==0) {
		System.out.println("No se puede dividir por cero.");
	}else {
		System.out.println(a+" / "+b+" = "+dividir);
	}
}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punto2 operacion=new Punto2();
		operacion.suma();
		operacion.resta();
		operacion.multiplicar();
		operacion.dividir();
	}

}
