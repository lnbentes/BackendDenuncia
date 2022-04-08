package br.com.generation.lucasbentes.tabelas.teste;

import br.com.generation.lucasbentes.tabelas.json.DesserializacaoJsonCep;
import br.com.generation.lucasbentes.tabelas.json.LeitorURL;

public class Teste {

	public static void main(String[] args) throws Exception {

		DesserializacaoJsonCep cep = new DesserializacaoJsonCep();
		
		String logradouro = cep.getDados("66610840").getLocalidade();
		
		System.out.println(logradouro);

//		LeitorURL ler = new LeitorURL();
//		
//		String cep = "66610840";
//		
//		String dados = ler.readUrl("https://viacep.com.br/ws/" + cep + "/json");
//		
//		System.out.println(dados);
		
	}

}
