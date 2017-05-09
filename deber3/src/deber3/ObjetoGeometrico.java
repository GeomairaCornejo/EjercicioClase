package deber3;

public class ObjetoGeometrico {
	public static void main (String[]args)
	{
		Triangulo T1= new Triangulo(1,1.5,1);
		T1.getArea();
		System.out.println("EL AREA DEL TRIANGULO ES DE:"+ T1.getArea());
		T1.getPerimetro();
		System.out.println("EL PERIMETRO DEL TRIANGULO ES DE:"+ T1.getPerimetro());
	}
}
