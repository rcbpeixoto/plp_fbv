package br.edu.fbv;

import java.text.MessageFormat;
import java.util.Scanner;

import br.edu.fbv.util.StringUtil;

public class Diagnostico {

	private static final String SIM = "s";
	private static final String NAO = "n";

	private Scanner reader;
	private Database database;

	
	public Diagnostico() {
		reader = new Scanner(System.in);
		database = new Database();
	}

	public void iniciar() {
		// Percorre a lista de nós mapeados:
		Node atual = database.first();

		// Temporárias:
		Pergunta pergunta;
		String resposta;

		while (atual instanceof Pergunta) {
			pergunta = (Pergunta) atual;
			imprimirPergunta(pergunta);

			resposta = lerResposta();

			// Reposta positiva:
			if (resposta.trim().equalsIgnoreCase(SIM)) {
				atual = pergunta.getPositivo();
			}
			// Reposta negativa:
			else if (resposta.trim().equalsIgnoreCase(NAO)) {
				atual = pergunta.getNegativo();
			}
		}

		if (atual instanceof Doenca) {
			imprimirDiagnostico((Doenca) atual);
		}
	}

	private String lerResposta() {
		String resposta = null;

		while (StringUtil.isNullOrEmpty(resposta)) {
			resposta = reader.next();
		}
		return resposta;
	}

	private void imprimirPergunta(Pergunta p) {
		System.out.println(
				MessageFormat.format("{0} (s/n)", 
						p.getValor()));
	}

	private void imprimirDiagnostico(Doenca d) {
		System.out.println(
				MessageFormat.format("Seu diagnóstico é: {0}",
						d.getValor()));
	}
}
