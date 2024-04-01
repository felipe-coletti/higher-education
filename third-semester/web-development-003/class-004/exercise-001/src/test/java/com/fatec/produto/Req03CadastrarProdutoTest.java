package com.fatec.produto;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.fatec.produto.model.Produto;

class Req03CadastrarProdutoTest {

	private Produto produto;

    @BeforeEach
    public void setUp() {
        produto = new Produto("Produto Teste", "Categoria Teste", 10.0, 100);
    }

    @Test
    public void testGetDescricao() {
        assertEquals("Produto Teste", produto.getDescricao());
    }

    @Test
    public void testSetDescricao() {
        produto.setDescricao("Novo Produto");
        assertEquals("Novo Produto", produto.getDescricao());
    }

    @Test
    public void testSetDescricaoBlank() {
        assertThrows(IllegalArgumentException.class, () -> produto.setDescricao(""));
    }

    @Test
    public void testSetCategoria() {
        produto.setCategoria("Nova Categoria");
        assertEquals("Nova Categoria", produto.getCategoria());
    }

    @Test
    public void testSetCategoriaBlank() {
        assertThrows(IllegalArgumentException.class, () -> produto.setCategoria(""));
    }

    @Test
    public void testGetCusto() {
        assertEquals(10.0, produto.getCusto(), 0.001);
    }

    @Test
    public void testSetCusto() {
        produto.setCusto(20.0);
        assertEquals(20.0, produto.getCusto(), 0.001);
    }

    @Test
    public void testSetCustoInvalid() {
        assertThrows(IllegalArgumentException.class, () -> produto.setCusto(-5.0));
    }

    @Test
    public void testGetQuantidadeNoEstoque() {
        assertEquals(100, produto.getQuantidadeNoEstoque());
    }

    @Test
    public void testSetQuantidadeNoEstoque() {
        produto.setQuantidadeNoEstoque(50);
        assertEquals(50, produto.getQuantidadeNoEstoque());
    }

    @Test
    public void testSetQuantidadeNoEstoqueInvalid() {
        assertThrows(IllegalArgumentException.class, () -> produto.setQuantidadeNoEstoque(0));
    }

}
