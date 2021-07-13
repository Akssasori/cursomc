package com.lucas;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lucas.domain.Categoria;
import com.lucas.domain.Produto;
import com.lucas.repository.CategoriaRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner{
	
	@Autowired
	private CategoriaRepository categoriaRepository;

	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null,"Escritório");
		
		Produto p1 = new Produto(null, "Computador", 2000.00, null);
		Produto p2 = new Produto(null, "Impressora", 800.00, null);
		Produto p3 = new Produto(null, "Mouse", 80.00, null);
		
		
		categoriaRepository.saveAll(Arrays.asList(cat1,cat2));
	}

}
