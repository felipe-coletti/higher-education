package com.fatec.produto.servico;

import java.util.List;

import com.fatec.produto.model.Produto;

public interface IProdutoServico {
	public List<Produto> consultaCatalogo();
}
