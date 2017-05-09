package deber3;

public class Triangulo extends ObjetoGeometrico
{
	public static double Area;
	public static double perimetro;
	public static double lado1=1.0;
	public static double lado2=1.0;
	public static double lado3=1.0;
	public Triangulo(){
}
	public Triangulo(double lado1,double lado2, double lado3)
	{
		this.lado1=lado1;
		this.lado2=lado2;
		this.lado3=lado3;
	}
	public double getlado1()
	{
		return lado1;
	}
	public double getlado2()
	{
		return lado2;
	}
	public double getlado3()
	{
		return lado3;
	}
//METODO SET
	public void setlado1(double lado1)
	{
		this.lado1=lado1;	
	}
	public void setlado2(double lado2)
	{
		this.lado2=lado2;	
	}
	public void setlado3(double lado3)
	{
		this.lado3=lado3;	
	}
	public double getArea()
	{
		return Area= this.lado1*this.lado2/2;
	}
	public double getPerimetro()
	{
		return perimetro= this.lado1+this.lado2+this.lado3;
	}
}
