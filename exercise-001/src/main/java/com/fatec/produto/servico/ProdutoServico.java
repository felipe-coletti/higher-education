package com.fatec.produto.servico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatec.produto.model.IProdutoRepository;
import com.fatec.produto.model.Produto;

@Service
public class ProdutoServico implements IProdutoServico {
	@Autowired
	IProdutoRepository repository;

	@Override
	public List<Produto> consultaCatalogo() {
		return repository.findAll();
	}

}
