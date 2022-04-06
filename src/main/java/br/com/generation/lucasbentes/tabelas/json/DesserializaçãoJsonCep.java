package br.com.generation.lucasbentes.tabelas.json;

import com.google.gson.Gson;

public class DesserializaçãoJsonCep {
	
	LeitorURL leitorURL;  // Vai fazer a conversao de url para string
    Gson gson;  // Api que vai fazer a juncao dos dados json com a classe
    String json;  // Ela vai receber a string do leitorUrl
    ConsumirJsonCep cepJson;  // vai receber os dados
    
    public DesserializaçãoJsonCep() {
    	leitorURL = new LeitorURL();
    	gson = new Gson();
    }
    
    public ConsumirJsonCep getDados(String cep) throws Exception {
        try{
            json = leitorURL.readUrl("https://viacep.com.br/ws/" + cep + "/json/");
        }catch (Exception e){
            System.out.println("URL errada: \n" + e);
        }


        try{
        	cepJson = gson.fromJson(json, ConsumirJsonCep.class);  // juntando os dados json com a classe
        }catch (Exception e){
            System.out.println("String Json errada: \n" + e);
        }

        return cepJson;
    }

}
