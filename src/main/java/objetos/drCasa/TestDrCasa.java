package objetos.drCasa;

import org.junit.*;

public class TestDrCasa {

	Infecciosa malaria1 = new Infecciosa(500);
	Infecciosa otitis = new Infecciosa(100);
	Autoinmune lupus = new Autoinmune(10000);
	Infecciosa malaria2 = new Infecciosa(800);
	Persona logan = new Persona(3000000);
	Persona frank = new Persona(3500000);
	
	@Before
	public void initialize(){
		logan.contraerEnfermedad(malaria1);
		logan.contraerEnfermedad(otitis);
		logan.contraerEnfermedad(lupus);
	}
	
	
	@Test
	public void frankTieneMalaria2(){
		frank.contraerEnfermedad(malaria2);
		Assert.assertTrue(frank.tiene(malaria2));
	}
	
	@Test
	public void malaria1SeReprodujo(){
		malaria1.reproducite();
		Assert.assertEquals(1000, malaria1.getCelulasAmenazadas());
	}
	
}
