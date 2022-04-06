package br.com.generation.lucasbentes.tabelas.json;

public class ConsumirJsonCep {
	
	private class DadosJsonCep{
		String cep;
		String logradouro;
		String complemento;
		String bairro;
		String localidade;
		String uf;
		String ibge;
		String  gia;
		String  ddd;
		String  siafi;
	}
	
	// Agora os atributos e metodos da classe ConsumirJsonCep
	// Consumindo os dados do Json
	
	private DadosJsonCep cep;
	
	
	public String getCep() {
		return cep.cep;
	}
	
	public String getLogradouro() {
		return cep.logradouro;
	}
	
	public String getoCmplemento() {
		return cep.complemento;
	}
	
	public String getBairro() {
		return cep.bairro;
	}
	
	public String getLocalidade() {
		return cep.localidade;
	}
	
	public String getUf() {
		return cep.uf;
	}
	
	public String getIbge() {
		return cep.ibge;
	}
	
	public String getGia() {
		return cep.gia;
	}
	
	public String getDdd() {
		return cep.ddd;
	}

	public String getSiafi() {
		return cep.siafi;
	}
}
