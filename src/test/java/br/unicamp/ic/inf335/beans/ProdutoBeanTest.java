package br.unicamp.ic.inf335.beans;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProdutoBeanTest {
	
	private ProdutoBean prod1 = new ProdutoBean("001","xbox","video-game", 199.0, "novo");
	private ProdutoBean prod2 = new ProdutoBean("002","ps5","video-game", 285.0, "usado");
	private ProdutoBean prod3 = new ProdutoBean("003","iphone","celular", 345.0, "novo");
	private ProdutoBean prod4 = new ProdutoBean("004","samsung","celular", 285.0, "usado");
	
	@Test
	//compara prod1 com prod2, resultado esperado = -1
	void testcompareto_menor() {
		
		int result = prod1.compareTo(prod2);
		assertEquals(result, (int)-1);

	}
	
	@Test
	//compara prod2 com prod4, resultado esperado = 0
	void testcompareto_igual() {
		
		int result = prod2.compareTo(prod4);
		assertEquals(result, (int)0);

	}

	@Test
	//compara prod3 com prod4, resultado esperado = 1
	void testcompareto_maior() {
		
		int result = prod3.compareTo(prod4);
		assertEquals(result, (int)1);

	}
	
}