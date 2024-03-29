package com.fatec.sp.gov.br.RepositorioDoBem;

import com.fatec.sp.gov.br.RepositorioDoBem.Builder.Produto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RepositorioDoBemApplication {

	public static void main(String[] args) {
		Produto.Builder builder = new Produto.Builder();

		Produto produto = builder
				.nome("Arroz")
				.preco(05.00)
				.quantidadeEmEstoque(5)
				.categoria("Alimento")
				.build();


		System.out.println(produto.getNome());
		System.out.println(produto.getPreco());
		System.out.println(produto.getCategoria());
		System.out.println(produto.getQuantidadeEmEstoque());

		SpringApplication.run(RepositorioDoBemApplication.class, args);
	}

}
