package ejercicio6;

import java.util.Scanner;

public class figurasgeometricas {
	
	Scanner sc = new Scanner(System.in);
	public double area;
	public double perimetro;
	public double radio;
	
	public double circulo () {
		double diametro = 0;
	    System.out.println("ingresa el radio del circulo");
	    
	    radio=sc.nextDouble();
	    
	    area=Math.PI*(Math.pow(radio, 2));
	    
	    System.out.println("el area del circulo es: "+area);
	    
		return area;
	}
	
	public double circulo (double diametro) {
		
		System.out.println("ingresa el diametro del circulo");
		
		diametro=sc.nextDouble();
		
		perimetro=Math.PI*diametro;
		
		System.out.println("el perimetro del circulo es "+perimetro);
		
		return perimetro;
	}
	
	public double rectangulo () {
		
		double base=0;
		double altura=0;
		
		System.out.println("ingresar la base del rectangulo");
		
		base=sc.nextDouble();
		
		System.out.println("ingresar altura del rectangulo");
		
		altura=sc.nextDouble();
		
		area=base*altura;
		
		System.out.println("el area del rectangulo es "+area);
		
		return area;
	}
	
	public double rectangulo (double base, double altura) {
		
		System.out.println("ingresar la base del rectangulo");
		
		base=sc.nextDouble();
		
		System.out.println("ingresar altura del rectangulo");
		
		altura=sc.nextDouble();
		
		perimetro=(base+altura)*2;
		
		System.out.println("el perimetro del rectangulo es "+perimetro);
		
		return perimetro;
		
	}
	
	public double cuadrado () {
		double base=0 ;
		double altura=0;
		
		System.out.println("ingresar la base del cuadrado");
		
		base=sc.nextDouble();
		
		System.out.println("ingresar altura del cuadrado");
		
		altura=sc.nextDouble();
		
		area=base*altura;
		
		System.out.println("el area del cuadrado es "+area);
		
		return area;
	}
	
	public double cuadrado (double lado) {
		
		System.out.println("ingresar uno de los lados del cuadrado");
		
		lado=sc.nextDouble();
		
		perimetro=lado*4;
		
		System.out.println("el perimetro del cuadrado es "+perimetro);
		
		return perimetro;
	}
	
	public double hexagono () {
		this.perimetro=0;
		double apotema=0;
		
		area=(this.area*apotema)/2;
		
		System.out.println("el perimetro del hexagono es "+area);
		
		return area;
	}
	
	public double hexagono (double l1, double l2, double l3, double l4, double l5, double l6 ) {
		 
		perimetro=l1+l2+l3+l4+l5+l6;
		
		System.out.println("el prerimetro del hexagono es "+perimetro);
		
		return perimetro;
	}
	
	public double trapecio () {
		
	    double b=0;
		double B=0;
		double h=0;
		
		System.out.println("ingresa la base menor del trapecio");
		
		b=sc.nextDouble();
		
		System.out.println("ingresa la base mayor del trapecio");
		
		B=sc.nextDouble();
		
		System.out.println("ingresa la altura del trapecio");
		
		h=sc.nextDouble();
		
		area=((b+B)*h)/2;
		
	    System.out.println("el area del trapecio es "+area);
		
		return area;
	}
	
	public double trapecio (double l1, double l2, double l3, double l4) {
		
		perimetro=l1+l2+l3+l4;
		
		System.out.println("el perimetro del trapecio es "+perimetro);
		
		return perimetro;
	}
	
	public static void main(String[] args) {
		int respuesta=0;		
		String figura=null;
		String opc=null;	
			
		do { Scanner sc = new Scanner(System.in);

	figurasgeometricas fg = new figurasgeometricas ();
	
	 System.out.println("desea hayar area o perimetro?");
	
	opc=sc.nextLine();
	
	switch (opc) {
	case "area":
		
		System.out.println("ingresa el tipo de figura geometrica de la que se desea sacar area");
		
		System.out.println("opciones: circulo, rectangulo, cuadrado, hexagono, trapecio.");
	
		figura=sc.nextLine();
		
		switch (figura) {
		case "circulo": fg.circulo();
		
		break;
		
		case "rectangulo": fg.rectangulo();
		
		break;
		
		case "cuadrado": fg.cuadrado();
		
		break;
		
		case "hexagono": fg.hexagono();
		
		break;
		
		case "trapecio": fg.trapecio();
		
		break;
			
		}
		
		break;
		
	case "perimetro":	
		
		System.out.println("ingresa el tipo de figura geometrica de la que se desea sacar perimetro");
		
		System.out.println("opciones: circulo, rectangulo, cuadrado, hexagono, trapecio.");
		
		figura=sc.nextLine();
		
		switch (figura) {
		case "circulo": double diametro = 0;
			fg.circulo(diametro);
		
		break;
		
		case "rectangulo": double altura=0;
			double base=0;
			fg.rectangulo(base,altura);
		
		break;
		
		case "cuadrado": double lado=0;
		
			fg.cuadrado(lado);
		
		break;
		
		case "hexagono": double l1=0;
		double l2=0; double l3=0; double l4=0; double l5=0; double l6=0;
			fg.hexagono(l1,l2,l3,l4,l5,l6);
		
		break;
		
		case "trapecio": double la1=0;
			double la2= 0;
			double la3= 0;
			double la4=0;
			fg.trapecio(la1,la2,la3,la4);
		
		break;
			
		}
		
		break;
				
	}
	
	 System.out.println("ingresar 1 si desea finalizar o cualquier otro numero para reiniciar el programa");
	 respuesta=sc.nextInt();
	} while (respuesta != 1); 
	
	}
	
}