package com.fatec.produto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.fatec.produto.model.Produto;

class Req01CadastrarProdutoTest {

	@Test
	void ct01_cadastra_produto_com_sucesso_custo() {
		Produto produto = new Produto();
		produto.setCusto(12);
		assertEquals(12, produto.getCusto());

	}

}
