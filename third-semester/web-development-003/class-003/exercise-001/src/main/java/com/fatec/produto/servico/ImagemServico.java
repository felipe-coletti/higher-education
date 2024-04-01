package com.fatec.produto.servico;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

import com.fatec.produto.model.IImagemRepository;
import com.fatec.produto.model.IProdutoRepository;
import com.fatec.produto.model.Imagem;
import com.fatec.produto.model.Produto;

public class ImagemServico implements IImagemServico {
	Logger logger = LogManager.getLogger(this.getClass());
	
	@Autowired 
	private IImagemRepository imagemRepository;
	@Autowired 
	private IProdutoRepository produtoRepository;

	@Override
	public Optional<Imagem> save(MultipartFile file, long id) throws IOException {
		 logger.info(">>>>>> servico salvar imagem - iniciado...");
		 
		 Optional<Produto> p = produtoRepository.findById(id);
		 
		 if (p.isPresent()) { 
			 logger.info(">>>>>> servico salvar imagem - produto encontrado");
			 
			 String name = file.getOriginalFilename();
			 Path filePath = Paths.get("imagens/" + name);
			 
			 logger.info(">>>>>> servico salvar imagem - caminho arquivo => " + filePath);
			 
			 Imagem image = new Imagem();
			 
			 image.setId(id);
			 image.setName(file.getOriginalFilename());
			 image.setPath(filePath.toString());
			 image.setFile(file.getBytes());
			 
			 logger.info(">>>>>> servico salvar imagem - arquivo getSize => " + file.getSize());
	
			 return Optional.of(imagemRepository.save(image));
		 } else {
			 logger.info(">>>>>> servico salvar imagem - id nao encontrado");
			 
			 return Optional.empty();
		 }
	}

	@Override
	public List<Imagem> getAll() {
		return imagemRepository.findAll();
	}

	@Override
	public byte[] getImagem(String fileName) {
		Optional<Imagem> dbImagem = imagemRepository.findByName(fileName);
		
		if (dbImagem.isPresent()) 
			return dbImagem.get().getFile();
		else 
			return new byte[0];
	}

	@Override
	public byte[] getImagemById(Long id) {
		Optional<Imagem> dbImagem = imagemRepository.findById(id);
		
		if (dbImagem.isPresent()) 
			return dbImagem.get().getFile();
		else 
			return new byte[0];
	}

}
