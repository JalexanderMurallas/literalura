package com.alurachallenge.literalura;

import com.alurachallenge.literalura.principal.Principal;
import com.alurachallenge.literalura.repository.IAutorRepository;
import com.alurachallenge.literalura.repository.IIdiomaRepository;
import com.alurachallenge.literalura.repository.ILibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiteraluraApplication implements CommandLineRunner {

	@Autowired
	IAutorRepository repoAutor;
	@Autowired
	ILibroRepository repoLibro;

	@Autowired
	IIdiomaRepository repoIdioma;

	public static void main(String[] args) {
		SpringApplication.run(LiteraluraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal menu = new Principal(repoLibro,repoAutor,repoIdioma);
		menu.verificarEntradaUsuario();
	}

}
