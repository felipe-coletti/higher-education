package com.fatec.produto.servico;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.fatec.produto.model.Imagem;
import com.fatec.produto.model.IImagemRepository;
import com.fatec.produto.model.Produto;
import com.fatec.produto.model.IProdutoRepository;

@Configuration
public class LoadDatabase {
	Logger logger = LogManager.getLogger(this.getClass());
	@Autowired
	IImagemRepository imagemRepository;

	@Bean
	CommandLineRunner initDatabase(IProdutoRepository repository) {
		return args -> {
			Produto produto1 = new Produto("Eletrobomba 110V para Maquina de Lavar e Lava Louças", "maquina de lavar",
					51.66, 12);
			Produto produto2 = new Produto("Tirante Original Brastemp E Consul De 7 A 12 Kg 11cm", "lavar louça", 3.90,
					20);
			Produto produto3 = new Produto("Termoatuador Lavadora Colormaq Electrolux GE", "maquina de lavar", 29.70,
					40);
			repository.saveAll(Arrays.asList(produto1, produto2, produto3));
			logger.info(">>>>> loaddatabase -> 3 produtos cadastrados no db.");

			Path path = Paths.get("c:/temp/produto1.jpg");
			InputStream file = Files.newInputStream(path);
			byte[] arquivo1 = file.readAllBytes();
			Imagem image = new Imagem();
			image.setId(1L); // associa o id do produto ao id da imagem
			image.setName("produto1.jpg");
			image.setPath("imagens/" + image.getName());
			image.setFile(arquivo1);
			logger.info(">>>>> loaddatabase -> upload de arquivo imagem realizado => " + arquivo1.length);
			imagemRepository.save(image);

			path = Paths.get("c:/temp/produto2.jpg");
			file = Files.newInputStream(path);
			byte[] arquivo2 = file.readAllBytes();
			image = new Imagem();
			image.setId(2L); // associa o id do produto ao id da imagem
			image.setName("produto2.jpg");
			image.setPath("imagens/" + image.getName());
			image.setFile(arquivo2);
			logger.info(">>>>> loaddatabase -> upload de arquivo imagem realizado => " + arquivo2.length);
			imagemRepository.save(image);

			path = Paths.get("c:/temp/produto3.jpg");
			file = Files.newInputStream(path);
			byte[] arquivo3 = file.readAllBytes();
			image = new Imagem();
			image.setId(3L); // associa o id do produto ao id da imagem
			image.setName("produto3.jpg");
			image.setPath("imagens/" + image.getName());
			image.setFile(arquivo3);
			logger.info(">>>>> loaddatabase -> upload de arquivo imagem realizado => " + arquivo3.length);
			imagemRepository.save(image);
		};
	}

}
