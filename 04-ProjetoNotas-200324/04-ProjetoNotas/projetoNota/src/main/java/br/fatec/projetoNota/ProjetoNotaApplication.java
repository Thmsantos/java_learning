package br.fatec.projetoNota;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ProjetoNotaApplication {

	@Autowired
	@Qualifier("appName")
	private String appName;

	@GetMapping("/provas")
	public String avaliarAluno(@RequestParam(name = "nome") String nome,
							   @RequestParam(name = "notaP1") double notaP1,
							   @RequestParam(name = "notaP2") double notaP2)
	{
		double media = (notaP1 + notaP2)/2;
		String status = media >= 6 ? "APROVADO" : "REPROVADO";
		return String.format("%s você esta %s com média: %.2f.", nome, status, media);
	}

	@GetMapping("/imc")
	public String avaliarIMC(@RequestParam(name = "peso") double peso,
							 @RequestParam(name = "altura") double altura,
							 @RequestParam(name = "nome") String nome)
	{
		double imc = peso/(altura*altura);
		String statusImc = null;

		if(imc <= 19){
			statusImc = "ABAIXO DO PESO";
		} else if (imc  <= 25) {
			statusImc = "PESO NORMAL";
		} else if (imc <= 30){
			statusImc = "SOBRE PESO";
		} else if (imc <= 35){
			statusImc = "OBESIDADE I";
		} else if (imc <= 40) {
			statusImc = "OBESIDADE II";
		} else {
			statusImc = "OBESIDADE III";
		}

		return String.format("%s seu IMC: %.2f considerado como: %s", nome, imc, statusImc);
	}

	public static void main(String[] args) {
		SpringApplication.run(ProjetoNotaApplication.class, args);
	}
}
