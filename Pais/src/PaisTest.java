import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PaisTest {

	@Test
	public void test00Carregar() {
	System.out.println("carregar");
	//para funcionar o Pais 1 deve ter sido carregado no banco por fora
	Pais fixture = new Pais(1,"Queiti",4321,15.2);
	Pais novo = new Pais(1, null, -1, -1);
	novo.carregar();
	assertEquals("testa inclusao", novo, fixture);
	}

}
