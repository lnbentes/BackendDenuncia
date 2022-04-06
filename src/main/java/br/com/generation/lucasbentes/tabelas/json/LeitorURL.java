package br.com.generation.lucasbentes.tabelas.json;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class LeitorURL {
	
	public String readUrl(String urlString) throws Exception {  // Vou recever a URL
        BufferedReader reader = null;
        try {
            URL url = new URL(urlString);
            reader = new BufferedReader(new InputStreamReader(url.openStream()));  // Vai ler o json dela
            StringBuffer buffer = new StringBuffer();
            int read;
            char[] chars = new char[1024];
            while ((read = reader.read(chars)) != -1)
                buffer.append(chars, 0, read);

            return buffer.toString();  // Vai de devolver um string com os caractes json da pagina

        } finally {
            if (reader != null)
                reader.close();
        }
    }

}
