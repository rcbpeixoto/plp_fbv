package br.edu.fbv;

public class Database {

	private Node first;


	public Database() {
		inicializar();
	}

	/**
	 * Inicializa perguntas e doenças e efetua mapeamento:
	 */
	private void inicializar() {
		Doenca d1 = new Doenca("d1", "Bronquite");
		Doenca d2 = new Doenca("d2", "Gripe");
		
		Pergunta p1 = new Pergunta("p1", "Paciente apresenta tosse?");
		Pergunta p2 = new Pergunta("p2", "É crônica?");
		Pergunta p3 = new Pergunta("p3", "É produtiva?");
		Pergunta p4 = new Pergunta("p4", "Mais de 3 meses em 2 anos seguidos?");
		Pergunta p5 = null;
		
		p1.setRespostas(p2, p5);
		p2.setRespostas(p3, null);
		p3.setRespostas(p4, null);
		p4.setRespostas(d1, d2);
		
		first = p1;
	}
	
	public Node first() {
		return first;
	}
}
