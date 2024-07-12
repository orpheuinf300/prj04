package br.unicamp.ic.inf335.beans;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AnuncianteBeanTest {
	
	private AnuncianteBean vendedor = new AnuncianteBean();
	private AnuncioBean anuncio1 = new AnuncioBean();
	private AnuncioBean anuncio2 = new AnuncioBean();	
	private AnuncioBean anuncio3 = new AnuncioBean();
	private ProdutoBean prod1 = new ProdutoBean();
	private ProdutoBean prod2 = new ProdutoBean();	
	private ProdutoBean prod3 = new ProdutoBean();
	
	//Teste para valores iguais de produtos - valor esperado 500
	@Test
	void testmediaprecos1() {
		
		prod1.setValor(500.0);
		prod2.setValor(500.0);
		prod3.setValor(500.0);
		
		anuncio1.setProduto(prod1);
		anuncio2.setProduto(prod2);
		anuncio3.setProduto(prod3);
		
		vendedor.addAnuncio(anuncio1);
		vendedor.addAnuncio(anuncio2);
		vendedor.addAnuncio(anuncio3);
		
		double media = vendedor.valorMedioAnuncios();
		assertEquals(media, (double)500);
	}
	
	//Teste para valores nulos de produtos - valor esperado 0
	@Test
	void testmediaprecos2() {
		
		prod1.setValor(0.0);
		prod2.setValor(0.0);
		prod3.setValor(0.0);
		
		anuncio1.setProduto(prod1);
		anuncio2.setProduto(prod2);
		anuncio3.setProduto(prod3);
		
		vendedor.addAnuncio(anuncio1);
		vendedor.addAnuncio(anuncio2);
		vendedor.addAnuncio(anuncio3);
		
		double media = vendedor.valorMedioAnuncios();
		assertEquals(media, (double)0);
	}
	
	//Teste para vendedores sem anuncios - valor esperado 0
	@Test
	void testmediaprecos3() {
				
		double media = vendedor.valorMedioAnuncios();
		assertEquals(media, (double)0);
	}

	//Teste para valores nulos de produtos - valor esperado 1400
	@Test
	void testmediaprecos4() {
		
		prod1.setValor(1200.0);
		prod2.setValor(1000.0);
		prod3.setValor(2000.0);
		
		anuncio1.setProduto(prod1);
		anuncio2.setProduto(prod2);
		anuncio3.setProduto(prod3);
		
		vendedor.addAnuncio(anuncio1);
		vendedor.addAnuncio(anuncio2);
		vendedor.addAnuncio(anuncio3);
		
		double media = vendedor.valorMedioAnuncios();
		assertEquals(media, (double)1400);
	}

}