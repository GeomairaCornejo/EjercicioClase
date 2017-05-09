package deber1;

	class Rectan 
	{
		public static double ancho=1;
		public static double altura=1;
		public double Area;
		public double Perimetro;
		public Rectan()
		{	
		}
		public Rectan(double anchoRec, double alturaRec)
		{
			this.ancho=anchoRec;
			this.altura=alturaRec;
		}
		public double getArea()
		{
			return Area= this.ancho*this.altura;
		}
		public double getPerimetro()
		{
			return Perimetro= this.ancho+this.altura+this.ancho+this.altura;
		}
	}
	public class Rectangulo
	{
		public static void main (String[]args)
		{	
			Rectan ct1=new Rectan(4,40);
			ct1.getArea();
			System.out.println("EL AREA ES:"+ ct1.getArea());
			ct1.getPerimetro();
			System.out.println("EL PERIMETRO ES:"+ ct1.getPerimetro());
			Rectan ct2= new Rectan(3.5,35.9);
			ct2.getArea();
			System.out.println("EL AREA DEL SEGUNDO RECTANGULO ES DE:"+ ct2.getArea());
			ct2.getPerimetro();
			System.out.println("EL PERIMETRO DEL SEGUNDO RECTANGULO ES DE:"+ ct2.getPerimetro());
		}
		
	}

