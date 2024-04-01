package com.fatec.produto.servico;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.web.multipart.MultipartFile;

import com.fatec.produto.model.Imagem;

public interface IImagemServico {
	public Optional<Imagem> save(MultipartFile file, long id) throws IOException;
	public List<Imagem> getAll();
	public byte[] getImagem(String fileName);
	public byte[] getImagemById(Long id);
}
