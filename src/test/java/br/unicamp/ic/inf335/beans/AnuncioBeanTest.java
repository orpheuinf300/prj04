package br.unicamp.ic.inf335.beans;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AnuncioBeanTest {
	
	private AnuncioBean anuncio = new AnuncioBean();
	private ProdutoBean prod = new ProdutoBean("001","tv","eletro", 500.0, "novo");
	
	//teste com desconto 0 - valor esperado 500
	@Test
	void testdesconto1() {
		
		anuncio.setProduto(prod);;
		anuncio.setDesconto(0.0);
		
		double precofinal = anuncio.getValor();
		assertEquals(precofinal, (double)500.0);
	}

	//teste com desconto 20% - valor esperado 400
	@Test
	void testdesconto2() {
		
		anuncio.setProduto(prod);;
		anuncio.setDesconto(0.2);
		
		double precofinal = anuncio.getValor();
		assertEquals(precofinal, (double)400.0);
	}

	//teste com desconto 100% - valor esperado 0
	@Test
	void testdesconto3() {
		
		anuncio.setProduto(prod);;
		anuncio.setDesconto(1.0);
		
		double precofinal = anuncio.getValor();
		assertEquals(precofinal, (double)0.0);
	}



}