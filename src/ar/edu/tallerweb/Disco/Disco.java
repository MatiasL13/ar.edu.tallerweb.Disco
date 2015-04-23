package ar.edu.tallerweb.Disco;


public class Disco {
	double radioInterior;
	double radioExterior;
	
	public  Disco(double radioInterior, double radioExterior){
		this.radioInterior = radioInterior;
		this.radioExterior = radioExterior;	
	}
	public double perimetroInterno(){
		double  perimetroInterno = 2* Math.PI * this.radioInterior;
		//perimetroInterno = Math.round(perimetroInterno);
		 System.out.println("perimetro Interno \t\t" + perimetroInterno +"\n");
		 return perimetroInterno;
	}
	public double perimetroExterior(){
		double perimetroExterior = 2* Math.PI * this.radioExterior;
		System.out.println("Perimetro Exterior \t\t" + perimetroExterior +"\n");
		return perimetroExterior;
	}
	public double area(){
		double  areaExterior  = (this.radioExterior * this.radioExterior) * Math.PI;
		double areaInterior = (this.radioInterior * this.radioInterior) * Math.PI;
		double area = areaExterior - areaInterior;
		System.out.println("Area \t\t" + area +"\n");
		return area;
	}
	
	
}
