package ar.edu.tallerweb.Disco;

import org.junit.Assert;
import org.junit.Test;



public class DiscoTest {
	@Test
	public void TestPerimetroInterior(){	
		Disco disco = new Disco(10.0, 20.0);		
		Assert.assertTrue(disco.perimetroInterno() == 62.83185307179586); 	
		
	}
	@Test
	public void TestPerimetroExterior(){	
		Disco disco = new Disco(10.0, 20.0);		
		Assert.assertTrue(disco.perimetroExterior() == 125.66370614359172);		
	}
	@Test
	public void TestArea(){
		Disco disco = new Disco(10.0, 20.0);
		Assert.assertTrue(disco.area() == 942.4777960769379);
	}
	
	
	

}
