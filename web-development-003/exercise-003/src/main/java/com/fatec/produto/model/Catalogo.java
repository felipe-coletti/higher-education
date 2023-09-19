package com.fatec.produto.model;

public class Catalogo {
	private Long id;
	private String descricao;
	private String categoria;
	private double custo;
	private int quantidadeNoEstoque;
	private byte[] imagem;

	public Catalogo(Long id, String descricao, String categoria, double custo, int q, byte[] imagem) {
		this.id = id;
		this.descricao = descricao;
		this.categoria = categoria;
		this.custo = custo;
		this.quantidadeNoEstoque = q;
		this.imagem = imagem;
	}

	public Long getId() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getCategoria() {
		return categoria;
	}

	public double getCusto() {
		return custo;
	}

	public int getQuantidadeNoEstoque() {
		return quantidadeNoEstoque;
	}

	public byte[] getImagem() {
		return imagem;
	}
}