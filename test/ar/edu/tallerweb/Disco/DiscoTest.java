package ar.edu.tallerweb.Disco;

import org.junit.Assert;
import org.junit.Test;



public class DiscoTest {
	@Test
	public void TestPerimetroInterior(){	
		Disco disco = new Disco(10.0, 20.0);		
		Assert.assertEquals(disco.perimetroInterno(),  62.83,0.1); 	
		
	}
	@Test
	public void TestPerimetroExterior(){	
		Disco disco = new Disco(10.0, 20.0);		
		Assert.assertEquals(disco.perimetroExterior(), 125.66,0.1);		
	}
	@Test
	public void TestArea(){
		Disco disco = new Disco(10.0, 20.0);
		Assert.assertEquals(disco.area(),942.4777, 0.1);
	}
	
	
	

}
